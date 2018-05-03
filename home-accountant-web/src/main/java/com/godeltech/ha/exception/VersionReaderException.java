package com.godeltech.ha.exception;

/**
 * VersionReaderException is the custom exception class
 */
public class VersionReaderException extends RuntimeException {
    /**
     * Constructs VersionReaderException object
     * @param message error message
     * @param cause different exception
     */
    public VersionReaderException(String message, Throwable cause) {
        super(message, cause);
    }

}
