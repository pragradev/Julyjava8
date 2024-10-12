package io.pragra.learning.exception;

public class AgeNotMatchException extends RuntimeException{
    public AgeNotMatchException(String message) {
        super(message);
    }
}
