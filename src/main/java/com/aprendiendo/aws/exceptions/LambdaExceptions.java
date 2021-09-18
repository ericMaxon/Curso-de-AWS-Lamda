package com.aprendiendo.aws.exceptions;

public class LambdaExceptions extends Throwable {
    private String message;

    public LambdaExceptions(String message) {
        this.message = message;
    }
}
