package com.awesome.steve.operator;

import rx.Observable;
import rx.schedulers.Schedulers;

/**
 * Created by Steve on 2017/1/5.
 * @author Steve
 */
public class Just extends Operator {
    public Just() {
        super();
    }

    @Override
    public Observable getObservable() {
        Observable observable = Observable.just("111", "222", "333", "444", "555", "666", "777")
                .observeOn(Schedulers.computation())
                .map(s -> s + "-Dan")
                .map(s-> s + " hello!");
        return observable;
    }
}
