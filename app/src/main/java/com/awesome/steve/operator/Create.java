package com.awesome.steve.operator;

import rx.Observable;
import rx.Subscriber;

/**
 * Created by Steve on 2017/1/5.
 *
 * @author Steve
 */
public class Create extends Operator {
    public Create() {}

    @Override
    public Observable getObservable() {
        Observable observable = Observable.create(new Observable.OnSubscribe<Integer>() {
            @Override
            public void call(Subscriber<? super Integer> observer) {
                try {
                    if (!observer.isUnsubscribed()) {
                        for (int i = 1; i <= 5; i++) {
                            observer.onNext(i);
                        }

                        observer.onCompleted();
                    }
                } catch (Exception e) {
                    observer.onError(e);
                }
            }
        });

        return observable;
    }
}
