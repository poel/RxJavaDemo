package com.awesome.steve.adapter;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.ViewGroup;

import com.awesome.steve.R;
import com.awesome.steve.adapter.viewholder.OperatorViewholder;
import com.awesome.steve.callback.OperatorItemClickListener;
import com.awesome.steve.operator.Operator;

import java.lang.ref.WeakReference;
import java.util.ArrayList;

/**
 * Created by Steve on 2017/1/5.
 *
 * @author Steve
 */
public class OperatorAdapter extends RecyclerView.Adapter<OperatorViewholder> {
    private WeakReference<Context> contextRef;
    private ArrayList<Operator> operators;
    private LayoutInflater inflater;
    private OperatorItemClickListener itemClickListener;

    public OperatorAdapter(WeakReference<Context> contextRef,
                           ArrayList<Operator> operators,
                           OperatorItemClickListener itemClickListener) {
        this.contextRef = contextRef;
        this.operators = operators;
        this.inflater = LayoutInflater.from(contextRef.get());
        this.itemClickListener = itemClickListener;
    }

    @Override
    public OperatorViewholder onCreateViewHolder(ViewGroup parent, int viewType) {
        return new OperatorViewholder(inflater.inflate(R.layout.operator_cell_item, parent, false));
    }

    @Override
    public void onBindViewHolder(OperatorViewholder holder, int position) {
        holder.bindata(operators.get(position), itemClickListener);
    }

    @Override
    public int getItemCount() {
        if (operators != null) {
            return operators.size();
        } else {
            return 0;
        }
    }
}
