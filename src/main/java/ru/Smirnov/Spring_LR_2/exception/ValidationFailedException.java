package ru.Smirnov.Spring_LR_2.exception;

public class ValidationFailedException extends Exception {

    public ValidationFailedException(String message) {
        super(message);
    }
}
