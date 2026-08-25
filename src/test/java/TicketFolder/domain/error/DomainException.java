package TicketFolder.domain.error;

public class DomainException extends Exception{

    private final ErrorCode code;

    public DomainException(ErrorCode code) {
        this.code = code;
    }

    public ErrorCode getCode() {
        return code;
    }
}
