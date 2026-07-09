package exception;

public class MatriculaInvalidaException extends Exception{

    public MatriculaInvalidaException() {
    }

    public MatriculaInvalidaException(String message) {
        super(message);
    }

    public MatriculaInvalidaException(Throwable cause) {
        super(cause);
    }

    public MatriculaInvalidaException(String message, Throwable cause) {
        super(message, cause);
    }

    public MatriculaInvalidaException(String message, Throwable cause, boolean enableSuppression,
            boolean writableStackTrace) {
        super(message, cause, enableSuppression, writableStackTrace);
    }
    
}
