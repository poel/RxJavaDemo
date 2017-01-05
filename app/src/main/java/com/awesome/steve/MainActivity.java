package com.awesome.steve;

import android.os.Bundle;
import android.support.constraint.ConstraintLayout;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import butterknife.BindView;
import butterknife.ButterKnife;
import okhttp3.MediaType;
import rx.Observable;
import rx.Subscriber;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    public static final MediaType JSON = MediaType.parse("application/json; charset=utf-8");
    @BindView(R.id.button)
    Button button;
    @BindView(R.id.textView)
    TextView textView;
    @BindView(R.id.activity_main)
    ConstraintLayout activityMain;

    Observable<String> myObservable;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ButterKnife.bind(this);

        myObservable = Observable.just("Hello, World!");
        button.setOnClickListener(this);
    }

    private void init() {
        myObservable.just("Hello, World!")
                .map(s -> s + "-Dan")
                .subscribe(s -> System.out.println(s));
    }

    @Override
    public void onClick(View v) {
        init();
    }
}
