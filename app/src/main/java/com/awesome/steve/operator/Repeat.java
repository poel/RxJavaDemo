package com.awesome.steve.operator;

import rx.Observable;
import rx.schedulers.Schedulers;

/**
 * Created by Steve on 2017/1/5.
 * @author Steve
 */
public class Repeat extends Operator {
    public Repeat() {}

    @Override
    public Observable getObservable() {
        Observable observable = Observable.just("111").repeat(Schedulers.trampoline());
        return observable;
    }
}
