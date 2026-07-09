package exception;

public class codigoDuplicladoException extends Exception{

    public codigoDuplicladoException() {
    }

    public codigoDuplicladoException(String message) {
        super(message);
    }

    public codigoDuplicladoException(Throwable cause) {
        super(cause);
    }

    public codigoDuplicladoException(String message, Throwable cause) {
        super(message, cause);
    }

    public codigoDuplicladoException(String message, Throwable cause, boolean enableSuppression,
            boolean writableStackTrace) {
        super(message, cause, enableSuppression, writableStackTrace);
    }
    
}
