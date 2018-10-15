package hello;

import java.util.concurrent.atomic.AtomicLong;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import java.util.*;
@RestController
public class GreetingController  {

    private static final String template = "Vlanid: %s!";
    private final AtomicLong counter = new AtomicLong();

    @RequestMapping("/greeting")
    public Greeting greeting(@RequestParam(value="name", defaultValue="World") String name) {
        return new Greeting(counter.incrementAndGet(),
                            String.format(template, name));
    }


    @RequestMapping("/vlan")
    public Vlan vlan(@RequestParam Map<String,String> requestParams) throws InvalidRequestException {
        if (requestParams.get("request").equals("new")) { 
          return new Vlan(counter.incrementAndGet(), requestParams.get("description") );
        }
        if (requestParams.get("request").equals("last")) {
          return new Vlan(counter.get() , "none");
        }
        else {
        throw new InvalidRequestException("Request:" + requestParams.get("request") );
        }

    }

  


}

//@ResponseStatus(HttpStatus.FORBIDDEN)
//public class ForbiddenException extends RuntimeException {}
