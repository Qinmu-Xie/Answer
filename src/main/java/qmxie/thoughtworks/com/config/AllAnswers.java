package qmxie.thoughtworks.com.config;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import qmxie.thoughtworks.com.model.Answer;
import qmxie.thoughtworks.com.repositories.AnswerRepository;

import java.util.List;

@Configuration
public class AllAnswers {

    private AnswerRepository answerRepository;

    private List<Answer> answers;

    @Autowired
    public AllAnswers(AnswerRepository answerRepository) {
        this.answerRepository = answerRepository;
        this.answers = answerRepository.findAll();
    }

    public List<Answer> getAnswers() {
        return answers;
    }

    public AllAnswers setAnswers(List<Answer> answers) {
        this.answers = answers;
        return this;
    }
}
