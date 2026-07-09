package exception;

public class CodigoNaoExisteException extends Exception{

    public CodigoNaoExisteException() {
    }

    public CodigoNaoExisteException(String message) {
        super(message);
    }

    public CodigoNaoExisteException(Throwable cause) {
        super(cause);
    }

    public CodigoNaoExisteException(String message, Throwable cause) {
        super(message, cause);
    }

    public CodigoNaoExisteException(String message, Throwable cause, boolean enableSuppression,
            boolean writableStackTrace) {
        super(message, cause, enableSuppression, writableStackTrace);
    }
    
    

}
