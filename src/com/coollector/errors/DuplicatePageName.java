package com.coollector.errors;

public class DuplicatePageName extends Exception {
    public DuplicatePageName(String errorMessage, Throwable err) {
        super(errorMessage, err);
    }
}
