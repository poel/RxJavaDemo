package com.awesome.steve;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.widget.TextView;

import com.awesome.steve.adapter.OperatorAdapter;
import com.awesome.steve.operator.Just;
import com.awesome.steve.operator.Operator;

import java.lang.ref.WeakReference;
import java.util.ArrayList;

import butterknife.BindView;
import butterknife.ButterKnife;

public class MainActivity extends AppCompatActivity {

    @BindView(R.id.textView)
    TextView textView;
    @BindView(R.id.opetators)
    RecyclerView opetators;

    OperatorAdapter adapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ButterKnife.bind(this);

        opetators.setLayoutManager(new LinearLayoutManager(this, LinearLayoutManager.VERTICAL, false));

        ArrayList<Operator> operators = new ArrayList<Operator>() {{
            add(new Just());
        }};

        adapter = new OperatorAdapter(new WeakReference<>(this), operators);
        opetators.setAdapter(adapter);
    }
}
