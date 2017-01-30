package hu.unideb.quiz.persistence.entities;

import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import lombok.ToString;

import javax.persistence.*;
import javax.validation.constraints.Size;

@NoArgsConstructor
@AllArgsConstructor
@ToString
@Entity
@Table( name = "question")
public class Question {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @Size(max=1000)
    @Column(name = "question", nullable = false)
    private String question;

    @Size(max=100)
    @Column(name = "theme", nullable = false)
    private String theme;

    @Size(max=200)
    @Column(name = "answerA", nullable = false)
    private String ansA;

    @Size(max=200)
    @Column(name = "answerB", nullable = false)
    private String ansB;

    @Size(max=200)
    @Column(name = "answerC", nullable = false)
    private String ansC;

    @Size(max=200)
    @Column(name = "answerD", nullable = false)
    private String ansD;

    @Size(max=200)
    @Column(name = "answerR", nullable = false)
    private String rightAnswer;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getQuestion() {
        return question;
    }

    public void setQuestion(String question) {
        this.question = question;
    }

    public String getTheme() {
        return theme;
    }

    public void setTheme(String theme) {
        this.theme = theme;
    }

    public String getAnsA() {
        return ansA;
    }

    public void setAnsA(String ansA) {
        this.ansA = ansA;
    }

    public String getAnsB() {
        return ansB;
    }

    public void setAnsB(String ansB) {
        this.ansB = ansB;
    }

    public String getAnsC() {
        return ansC;
    }

    public void setAnsC(String ansC) {
        this.ansC = ansC;
    }

    public String getAnsD() {
        return ansD;
    }

    public void setAnsD(String ansD) {
        this.ansD = ansD;
    }

    public String getRightAnswer() {
        return rightAnswer;
    }

    public void setRightAnswer(String rightAnswer) {
        this.rightAnswer = rightAnswer;
    }
}
