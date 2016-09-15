package qmxie.thoughtworks.com.web;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import qmxie.thoughtworks.com.config.AllAnswers;
import qmxie.thoughtworks.com.model.Answer;

import java.util.List;
import java.util.Random;

@RestController
public class AnswerController {
    @Autowired
    private AllAnswers allAnswers;

    @RequestMapping("/answers")
    public List<Answer> getAllAnswers() {
        return allAnswers.getAnswers();
    }

    @RequestMapping("/answer")
    public Answer getAnswer() {
        Random random = new Random();
        return allAnswers.getAnswers().get(random.nextInt(allAnswers.getAnswers().size()));
    }
}


