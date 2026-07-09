package exception;

public class ManutencaoAbertaException extends Exception{

    public ManutencaoAbertaException() {
    }

    public ManutencaoAbertaException(String message) {
        super(message);
    }

    public ManutencaoAbertaException(Throwable cause) {
        super(cause);
    }

    public ManutencaoAbertaException(String message, Throwable cause) {
        super(message, cause);
    }

    public ManutencaoAbertaException(String message, Throwable cause, boolean enableSuppression,
            boolean writableStackTrace) {
        super(message, cause, enableSuppression, writableStackTrace);
    }
    
}
