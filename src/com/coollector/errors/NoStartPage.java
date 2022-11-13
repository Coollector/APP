package com.coollector.errors;

public class NoStartPage extends Exception {
    public NoStartPage(String errorMessage, Throwable err) {
        super(errorMessage, err);
    }
}
