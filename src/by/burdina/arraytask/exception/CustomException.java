package by.burdina.arraytask.exception;

public class CustomException extends Throwable {

    public CustomException() {
        super();
    }

    public CustomException(String message) {
        super(message);
    }

    public CustomException(Exception e) {
        super(e);
    }

    public CustomException(String message, Exception e) {
        super(message, e);
    }

}
