package hu.unideb.quiz.service;

import hu.unideb.quiz.persistence.entities.Question;

import java.util.List;

public interface QuestionService {

    List<Question> findAllQuestions();

    List findThemes();

    List<Question> findQuestionsByTheme(String theme);
}
