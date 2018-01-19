package com.arm07.android.bbvachallenge.activity;

import android.Manifest;
import android.annotation.SuppressLint;
import android.app.ProgressDialog;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.location.Location;
import android.os.AsyncTask;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.v4.app.ActivityCompat;
import android.support.v4.app.FragmentTransaction;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.widget.Toast;

import com.arm07.android.bbvachallenge.R;
import com.arm07.android.bbvachallenge.fragment.ListFragment;
import com.arm07.android.bbvachallenge.model.JsonResponse;
import com.arm07.android.bbvachallenge.utility.HttpHandler;
import com.google.android.gms.location.FusedLocationProviderClient;
import com.google.android.gms.location.LocationServices;
import com.google.android.gms.maps.CameraUpdate;
import com.google.android.gms.maps.CameraUpdateFactory;
import com.google.android.gms.maps.GoogleMap;
import com.google.android.gms.maps.OnMapReadyCallback;
import com.google.android.gms.maps.SupportMapFragment;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.LatLngBounds;
import com.google.android.gms.maps.model.Marker;
import com.google.android.gms.maps.model.MarkerOptions;
import com.google.android.gms.tasks.OnSuccessListener;
import com.google.gson.Gson;

import java.io.IOException;
import java.net.URL;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class MainActivity extends AppCompatActivity implements ListFragment.OnListFragmentInteractionListener{
    private static final String TAG = "MainActivity";
    private static final int REQUEST_LOCATION = 123;
    private String urlString;
    public static List<JsonResponse.ResultsBean> resultList;
    private FusedLocationProviderClient locationClient;
    private Location lastLocation;
    private GoogleMap map;
    private List<Bitmap> bitmaps;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        //Fabric.with(this, new Crashlytics(), new CrashlyticsNdk());
        setContentView(R.layout.activity_main);
        locationClient = LocationServices.getFusedLocationProviderClient(this);
        bitmaps = new ArrayList<>();
        resultList = new ArrayList<>();
        //get last location.
        if (ActivityCompat.checkSelfPermission(this, Manifest.permission.ACCESS_FINE_LOCATION) != PackageManager.PERMISSION_GRANTED && ActivityCompat.checkSelfPermission(this, Manifest.permission.ACCESS_COARSE_LOCATION) != PackageManager.PERMISSION_GRANTED) {
            ActivityCompat.requestPermissions(this, new String[]{Manifest.permission.ACCESS_COARSE_LOCATION}, REQUEST_LOCATION);
        }else{
            Log.i(TAG, "permission already granted!");
            getLastKnownLocation();
        }
    }

    @Override
    public void onRequestPermissionsResult(int requestCode, @NonNull String[] permissions, @NonNull int[] grantResults) {
        super.onRequestPermissionsResult(requestCode, permissions, grantResults);
        if (requestCode == REQUEST_LOCATION){
            if(grantResults.length > 0 && grantResults[0] == PackageManager.PERMISSION_GRANTED){
                Log.i(TAG, "last location got! 2");
                //           getLastKnownLocation();
                new GetResultList().execute();
            }else{
                Log.i(TAG, "no location permission granted!");
            }
        }
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        MenuInflater inflater = getMenuInflater();
        inflater.inflate(R.menu.main_menu, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        //       FragmentTransaction transaction = getSupportFragmentManager().beginTransaction();
        switch (item.getItemId()){
            case R.id.mapView:
                if(getSupportFragmentManager().findFragmentByTag("MapFragment") == null){
                    FragmentTransaction transaction = getSupportFragmentManager().beginTransaction();
                    ListFragment fragment = new ListFragment();
                    transaction.add(R.id.contentMain, fragment, "MapFragment").commit();
                    Log.i(TAG, "map fragment is null");
                }else {
                    if (!getSupportFragmentManager().findFragmentByTag("MapFragment").isVisible()) {
                        FragmentTransaction transaction = getSupportFragmentManager().beginTransaction();
                        transaction.show(getSupportFragmentManager().findFragmentByTag("MapFragment"))
                                .commit();
                        if(getSupportFragmentManager().findFragmentByTag("ListFragment") != null){
                            FragmentTransaction transaction1 = getSupportFragmentManager().beginTransaction();
                            transaction1.hide(getSupportFragmentManager().findFragmentByTag("ListFragment")).commit();
                        }
                        Log.i(TAG, "map fragment is not null and is not visible");
                    } else {
                        Log.i(TAG, "map fragment is not null and is visible");
                    }
                }

                break;
            case R.id.listView:
                if(getSupportFragmentManager().findFragmentByTag("ListFragment") == null){
                    Log.i(TAG, "list fragment is null");
                    ListFragment fragment = new ListFragment();
                    FragmentTransaction transaction = getSupportFragmentManager().beginTransaction();
                    transaction.add(R.id.contentMain, fragment, "ListFragment")
                            .hide(getSupportFragmentManager().findFragmentByTag("MapFragment"))
                            .commit();
                }else{
                    if(!getSupportFragmentManager().findFragmentByTag("ListFragment").isVisible()){
                        Log.i(TAG, "list fragment is not null and is not visible");
                        FragmentTransaction transaction = getSupportFragmentManager().beginTransaction();
                        transaction.show(getSupportFragmentManager().findFragmentByTag("ListFragment"))
                                .commit();
                        if(getSupportFragmentManager().findFragmentByTag("MapFragment")!=null){
                            FragmentTransaction transaction1 = getSupportFragmentManager().beginTransaction();
                            transaction1.hide(getSupportFragmentManager().findFragmentByTag("MapFragment")).commit();
                        }
                    }else{
                        Log.i(TAG, "list fragment is not null and is visible");
                    }
                }
                break;
        }
        return super.onOptionsItemSelected(item);

    }

    @SuppressLint("MissingPermission")
    private void getLastKnownLocation() {
        locationClient.getLastLocation().addOnSuccessListener(MainActivity.this, new OnSuccessListener<Location>() {
            @Override
            public void onSuccess(Location location) {
                if (location != null) {
                    lastLocation = location;
                    urlString = "https://maps.googleapis.com/maps/api/place/textsearch/json?query=BBVA+Compass&location="
                            +location.getLatitude()+","+location.getLongitude()+"&radius=10000&key=AIzaSyDjkiPrhiICUL4SPTf9vNl5SEyIXK-jOZg";
                    Log.i(TAG, "last location got!");
                    Log.i(TAG, "last location is "+location.getLongitude()+" "+location.getLongitude());
                    new GetResultList().execute();

                }else{
                    Log.i(TAG, "location is null!");
                }
            }
        });
    }

    @Override
    public void onListFragmentInteraction(JsonResponse.ResultsBean resultsBean) {

    }

    private class GetResultList extends AsyncTask {
        ProgressDialog progressDialog;
        JsonResponse jsonResponse;
        private String response;
        private Map<Marker, JsonResponse.ResultsBean> markerMap;

        @Override
        protected void onPreExecute() {
            super.onPreExecute();
            progressDialog = new ProgressDialog(MainActivity.this);
            progressDialog.setMessage("Loading result...");
            progressDialog.setCancelable(false);
            progressDialog.show();
        }

        @SuppressLint("MissingPermission")
        @Override
        protected Object doInBackground(Object[] objects) {
            //get objects from json string
            HttpHandler httpHandler = new HttpHandler();
            response = httpHandler.getJsonString(urlString);
            Log.i(TAG, "url is "+urlString);
            Gson gson = new Gson();
            jsonResponse = gson.fromJson(response, JsonResponse.class);
            Log.i(TAG, "status is "+jsonResponse.getStatus());

            //get icon from each result

            resultList = jsonResponse.getResults();
            for(JsonResponse.ResultsBean resultsBean: resultList){
                try {
                    bitmaps.add(BitmapFactory.decodeStream(new URL(resultsBean.getIcon()).openStream()));
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
            return null;
        }

        @Override
        protected void onPostExecute(Object o) {
            super.onPostExecute(o);
            if(progressDialog.isShowing()){
                progressDialog.dismiss();
            }
            displayResultsOnMap();

        }

        private void displayResultsOnMap() {

            SupportMapFragment mapFragment = new SupportMapFragment();
            getSupportFragmentManager().beginTransaction().replace(R.id.contentMain, mapFragment, "MapFragment").commit();

            mapFragment.getMapAsync(new OnMapReadyCallback() {
                @SuppressLint("MissingPermission")
                @Override
                public void onMapReady(final GoogleMap googleMap) {
                    map = googleMap;

                    if(lastLocation != null){
                        //resultList = jsonResponse.getResults();
                        //setting up google maps
                        googleMap.setMyLocationEnabled(true);
                        googleMap.getUiSettings().setAllGesturesEnabled(true);
                        googleMap.getUiSettings().setZoomControlsEnabled(true);
                        googleMap.getUiSettings().setCompassEnabled(true);
                        googleMap.getUiSettings().setMapToolbarEnabled(true);

                        googleMap.setOnInfoWindowClickListener(new GoogleMap.OnInfoWindowClickListener() {
                            @Override
                            public void onInfoWindowClick(Marker marker) {
                                Intent intent = new Intent(MainActivity.this, DetailActivity.class);
                                intent.putExtra("resultBean", markerMap.get(marker));
                                startActivity(intent);
                            }
                        });
                        markerMap = new HashMap<>();

                        //place markers
                        LatLngBounds.Builder builder = new LatLngBounds.Builder();
                        int i = 0;
                        for(final JsonResponse.ResultsBean result : resultList){
                            LatLng resultGPS = new LatLng(result.getGeometry().getLocation().getLat(), result.getGeometry().getLocation().getLng());
                            Marker marker = null;

                            /*final Bitmap[] bitmap = new Bitmap[1];
                                Runnable runnable = new Runnable() {
                                    @Override
                                    public void run() {
                                        try {
                                            bitmap[0] = BitmapFactory.decodeStream(new URL(result.getIcon()).openStream());
                                        } catch (IOException e) {
                                            e.printStackTrace();
                                        }
                                    }
                                };*/
                            marker = googleMap.addMarker(new MarkerOptions()
                                    .position(resultGPS)
                                    .title(result.getName())
                                    .snippet(result.getFormatted_address())
                                    .icon(BitmapDescriptorFactory.fromBitmap(bitmaps.get(i))));
                            i++;
                            builder.include(resultGPS);
                            markerMap.put(marker, result);
                        }
                        LatLngBounds bounds = builder.build();
                        int padding = 25;
                        final CameraUpdate cu = CameraUpdateFactory.newLatLngBounds(bounds,padding);
                        googleMap.setOnMapLoadedCallback(new GoogleMap.OnMapLoadedCallback() {
                            @Override
                            public void onMapLoaded() {
                                googleMap.moveCamera(cu);
                            }
                        });


                    }else{
                        Toast.makeText(MainActivity.this, "Please check location gps is turned on.", Toast.LENGTH_SHORT).show();
                        Log.i(TAG, "lastlocation is null");
                    }

                }
            });
        }
    }
}
