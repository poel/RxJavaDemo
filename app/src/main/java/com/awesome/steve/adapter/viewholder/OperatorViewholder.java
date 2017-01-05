package com.awesome.steve.adapter.viewholder;

import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.TextView;

import com.awesome.steve.R;
import com.awesome.steve.callback.OperatorItemClickListener;
import com.awesome.steve.operator.Operator;

import butterknife.BindView;
import butterknife.ButterKnife;

/**
 * Created by Steve on 2017/1/5.
 *
 * @author Steve
 */
public class OperatorViewholder extends RecyclerView.ViewHolder {
    @BindView(R.id.operator_name)
    TextView operatorName;

    public OperatorViewholder(View itemView) {
        super(itemView);
        ButterKnife.bind(this, itemView);
    }

    public void bindata(@NonNull final Operator operator, OperatorItemClickListener itemClickListener) {
        operatorName.setText(operator.getName());
        itemView.setOnClickListener(
                view -> itemClickListener.onItemClicked(operator)
        );
    }
}
