package com.awesome.steve.operator;

import rx.Observable;

/**
 * Created by Steve on 2017/1/5.
 * @author Steve
 */
public class Operator {
    private String name;

    public Operator() {
        /**
         * Get the class exclude pacakge name
         * */
        this.name = this.getClass().getName().substring(this.getClass().getName().lastIndexOf(".") + 1);
    }

    public Observable getObservable() {
        return null;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
