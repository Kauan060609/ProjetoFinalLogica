package exception;

public class CampoVazioException extends Exception{

    public CampoVazioException() {
    }

    public CampoVazioException(String message) {
        super(message);
    }

    public CampoVazioException(Throwable cause) {
        super(cause);
    }

    public CampoVazioException(String message, Throwable cause) {
        super(message, cause);
    }

    public CampoVazioException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
        super(message, cause, enableSuppression, writableStackTrace);
    }
    
}
