import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@EnableAutoConfiguration
public class FirstBoot {
    @RequestMapping("/")
    String home() {
        return "Hello World!";
    }

    @RequestMapping("/test")
    String test() {
        return "Test success!!";
    }

    @RequestMapping("/false")
    String falseResult() {
        return "Test false!";
    }

    public static void main(String[] args) {
        SpringApplication.run(FirstBoot.class, args);
    }
}
