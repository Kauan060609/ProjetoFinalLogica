package exception;

public class SituacaoInvalidaException extends Exception{

    public SituacaoInvalidaException() {
    }

    public SituacaoInvalidaException(String message) {
        super(message);
    }

    public SituacaoInvalidaException(Throwable cause) {
        super(cause);
    }

    public SituacaoInvalidaException(String message, Throwable cause) {
        super(message, cause);
    }

    public SituacaoInvalidaException(String message, Throwable cause, boolean enableSuppression,
            boolean writableStackTrace) {
        super(message, cause, enableSuppression, writableStackTrace);
    }
    
}
