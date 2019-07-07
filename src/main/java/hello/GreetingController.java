package hello;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class GreetingController {
    @RequestMapping("/sum")
    public Greeting greeting(@RequestParam(value= "num", defaultValue = "0") String num1,@RequestParam(value= "num_2", defaultValue = "0") String num2){
        return new Greeting(num1,num2);
    }
}
