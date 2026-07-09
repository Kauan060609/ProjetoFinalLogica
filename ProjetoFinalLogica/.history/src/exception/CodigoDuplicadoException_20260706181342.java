package exception;

public class CodigoDuplicadoException extends Exception{

    public CodigoDuplicadoException() {
    }

    public CodigoDuplicadoException(String message) {
        super(message);
    }

    public CodigoDuplicadoException(Throwable cause) {
        super(cause);
    }

    public CodigoDuplicadoException(String message, Throwable cause) {
        super(message, cause);
    }

    public CodigoDuplicadoException(String message, Throwable cause, boolean enableSuppression,
            boolean writableStackTrace) {
        super(message, cause, enableSuppression, writableStackTrace);
    }
    
}
