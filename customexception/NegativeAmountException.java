package com.aurionpro.customexception;

public class NegativeAmountException extends Exception {
    public NegativeAmountException(String message) {
        super(message);
    }
}