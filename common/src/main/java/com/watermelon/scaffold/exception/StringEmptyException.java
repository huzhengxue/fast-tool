package com.watermelon.scaffold.exception;

public class StringEmptyException extends RuntimeException {

    public StringEmptyException() {
        super("the string is empty!");
    }
}
