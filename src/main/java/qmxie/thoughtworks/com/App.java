package qmxie.thoughtworks.com;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Answer
 */
@SpringBootApplication
@RestController
public class App {

    @RequestMapping("/")
    public String Home() {
        return "Here You Can Get Answers.";
    }

    public static void main(String[] args) {
        SpringApplication.run(App.class, args);
    }
}
