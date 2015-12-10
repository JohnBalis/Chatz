package com.score.senz.chatz.exceptions;

/**
 * Exception that need to throw when device phone no is empty
 * <p/>
 * erangaeb@gmail.com
 */
public class NoPhoneNoException extends Exception {
    private static final long serialVersionUID = 1L;

    @Override
    public String toString() {
        return "No phone no, sim card might be not inserted";
    }
}
