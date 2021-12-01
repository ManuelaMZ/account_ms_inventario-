package com.misionticmanu.Account_ms_M.exceptions;
public class InsufficientBalanceException extends RuntimeException {
    public InsufficientBalanceException(String message) {
        super(message);
    }
}