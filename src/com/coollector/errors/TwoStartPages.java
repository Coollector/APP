package com.coollector.errors;

public class TwoStartPages extends Exception {
    public TwoStartPages(String errorMessage, Throwable err) {
        super(errorMessage, err);
    }
}
