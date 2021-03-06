package com.rsostream.storlyze.util;

public class InvalidMessageException extends Exception {

    private static final long serialVersionUID = -8763558183570745163L;

    public InvalidMessageException() {
        super();
    }

    /**
     * @param message the message for this exception
     */
    public InvalidMessageException(String message) {
        super(message);
    }

    /**
     * @param cause the root cause
     */
    public InvalidMessageException(Throwable cause) {
        super(cause);
    }

    /**
     * @param message the message for this exception
     * @param cause   the root cause
     */
    public InvalidMessageException(String message, Throwable cause) {
        super(message, cause);
    }
}
