package qmxie.thoughtworks.com.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "ANSWERS")
public class Answer {
    @Id
    @GeneratedValue
    private int id;
    private String content;

    public String getContent() {
        return content;
    }

    public Answer setContent(String content) {
        this.content = content;
        return this;
    }

    @Override
    public String toString() {
        return "Answer{" +
                "content='" + content + '\'' +
                '}';
    }
}
