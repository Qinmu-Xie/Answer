package qmxie.thoughtworks.com;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import qmxie.thoughtworks.com.model.Answer;
import qmxie.thoughtworks.com.repositories.AnswerRepository;

import java.util.List;

/**
 * Answer
 */
@SpringBootApplication
@RestController
public class App {
    @Autowired
    private AnswerRepository answerRepository;

    @RequestMapping("/")
    public String Home() {
        return "Here You Can Get Answers.";
    }

    @RequestMapping("/answers")
    public List<Answer> getAllAnswers() {
        return answerRepository.findAll();
    }

    public static void main(String[] args) {
        SpringApplication.run(App.class, args);
    }
}
