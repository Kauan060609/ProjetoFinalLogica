package exception;

public class CodigoNaoExiste extends Exception{

    public CodigoNaoExiste() {
    }

    public CodigoNaoExiste(String message) {
        super(message);
    }

    public CodigoNaoExiste(Throwable cause) {
        super(cause);
    }

    public CodigoNaoExiste(String message, Throwable cause) {
        super(message, cause);
    }

    public CodigoNaoExiste(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
        super(message, cause, enableSuppression, writableStackTrace);
    }
    
}
