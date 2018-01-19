package com.arm07.android.bbvachallenge.utility;

import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.arm07.android.bbvachallenge.R;
import com.arm07.android.bbvachallenge.fragment.ListFragment;
import com.arm07.android.bbvachallenge.model.JsonResponse;

import java.util.List;

/**
 * Created by rashmi on 1/19/2018.
 */

public class MyItemRecyclerViewAdapter  extends RecyclerView.Adapter<MyItemRecyclerViewAdapter.ViewHolder> {

    private List<JsonResponse.ResultsBean> resultsBeans;
    private final ListFragment.OnListFragmentInteractionListener mListener;

    public MyItemRecyclerViewAdapter(List<JsonResponse.ResultsBean> resultsBeans, ListFragment.OnListFragmentInteractionListener listener) {
        this.resultsBeans = resultsBeans;
        mListener = listener;
    }

    @Override
    public ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.fragment_item, parent, false);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(final ViewHolder holder, final int position) {
        holder.resultsBean = resultsBeans.get(position);
        holder.mIdView.setText(resultsBeans.get(position).getName());
        holder.mContentView.setText(resultsBeans.get(position).getFormatted_address());

        holder.mView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (null != mListener) {
                    // Notify the active callbacks interface (the activity, if the
                    // fragment is attached to one) that an item has been selected.
                    mListener.onListFragmentInteraction(resultsBeans.get(position));
                }
            }
        });
    }

    @Override
    public int getItemCount() {
        return resultsBeans.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder {
        public final View mView;
        public final TextView mIdView;
        public final TextView mContentView;
        public JsonResponse.ResultsBean resultsBean;

        public ViewHolder(View view) {
            super(view);
            mView = view;
            mIdView = (TextView) view.findViewById(R.id.name);
            mContentView = (TextView) view.findViewById(R.id.address);
        }

        @Override
        public String toString() {
            return super.toString() + " '" + mContentView.getText() + "'";
        }
    }
}
