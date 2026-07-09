package exception;

public class CodigoDuplicladoException extends Exception{

    public CodigoDuplicladoException() {
    }

    public CodigoDuplicladoException(String message) {
        super(message);
    }

    public CodigoDuplicladoException(Throwable cause) {
        super(cause);
    }

    public CodigoDuplicladoException(String message, Throwable cause) {
        super(message, cause);
    }

    public CodigoDuplicladoException(String message, Throwable cause, boolean enableSuppression,
            boolean writableStackTrace) {
        super(message, cause, enableSuppression, writableStackTrace);
    }
    
}
