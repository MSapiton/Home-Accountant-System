package com.godeltech.ha.exception;

/**
 * VersionReaderException  wraps XmlPullParserException and IOException
 */
public class VersionReaderException extends RuntimeException {
    /**
     * Constructs VersionReaderException object
     * @param message error message
     * @param cause   different exception
     */

    public VersionReaderException(String message, Throwable cause) {
        super(message, cause);
    }

    public VersionReaderException(String message) {
        super(message);
    }

}
