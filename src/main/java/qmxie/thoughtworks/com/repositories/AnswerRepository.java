package qmxie.thoughtworks.com.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import qmxie.thoughtworks.com.model.Answer;


@Repository
public interface AnswerRepository extends JpaRepository<Answer, Integer> {
}
