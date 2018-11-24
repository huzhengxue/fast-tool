package com.watermelon.scaffold.exception;

public class UserIdNullException extends RuntimeException {

    public UserIdNullException() {
        super("the userId is empty!");
    }
}
