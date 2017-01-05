package com.awesome.steve.operator;

import rx.Observable;
import rx.schedulers.Schedulers;

/**
 * Created by Steve on 2017/1/5.
 * @author Steve
 */
public class Just extends Operator {
    public Just() {
        super("Just");
    }

    @Override
    public void excute() {
        Observable.just("111", "222", "333", "444", "555", "666", "777")
                .observeOn(Schedulers.computation())
                .map(s -> s + "-Dan")
                .map(s-> s + " hello!")
                .subscribe(s -> System.out.println(s));
    }
}
