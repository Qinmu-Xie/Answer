package qmxie.thoughtworks.com;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.orm.jpa.HibernateJpaAutoConfiguration;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Answer
 *
 */
@SpringBootApplication
@RestController
@EnableAutoConfiguration(exclude = HibernateJpaAutoConfiguration.class)
public class App 
{
    @RequestMapping("/")
    public String Home() {
        return "Here You Can Get Answers.";
    }

    public static void main( String[] args )
    {
        SpringApplication.run(App.class, args);
    }
}
