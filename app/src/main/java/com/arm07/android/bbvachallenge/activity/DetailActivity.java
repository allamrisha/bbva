package com.arm07.android.bbvachallenge.activity;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.TextView;

import com.arm07.android.bbvachallenge.R;
import com.arm07.android.bbvachallenge.model.JsonResponse;

public class DetailActivity extends AppCompatActivity {

    private TextView tvName, tvAddress, tvGps;
    private JsonResponse.ResultsBean resultsBean;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail);

        resultsBean = getIntent().getParcelableExtra("resultBean");
        tvName = findViewById(R.id.tvName);
        tvAddress = findViewById(R.id.tvAddress);
        tvGps = findViewById(R.id.tvGps);
        tvName.setText(resultsBean.getName());
        tvAddress.setText(resultsBean.getFormatted_address());

    }
}
