package hello;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(HttpStatus.NOT_IMPLEMENTED )
public class InvalidRequestException extends Exception {

    public InvalidRequestException (String message) {
        super(message);
    }
}
