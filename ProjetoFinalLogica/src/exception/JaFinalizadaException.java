package exception;

public class JaFinalizadaException extends Exception {

    public JaFinalizadaException() {
    }

    public JaFinalizadaException(String message) {
        super(message);
    }

    public JaFinalizadaException(Throwable cause) {
        super(cause);
    }

    public JaFinalizadaException(String message, Throwable cause) {
        super(message, cause);
    }

    public JaFinalizadaException(String message, Throwable cause, boolean enableSuppression,
            boolean writableStackTrace) {
        super(message, cause, enableSuppression, writableStackTrace);
    }
    
}
