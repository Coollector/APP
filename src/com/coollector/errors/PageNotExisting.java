package com.coollector.errors;

public class PageNotExisting extends Exception {
    public PageNotExisting(String errorMessage, Throwable err) {
        super(errorMessage, err);
    }
}
