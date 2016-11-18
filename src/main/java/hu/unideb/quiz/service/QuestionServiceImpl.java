package hu.unideb.quiz.service;


import hu.unideb.quiz.persistence.entities.Question;
import hu.unideb.quiz.persistence.repositories.QuestionRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class QuestionServiceImpl implements QuestionService {

    @Autowired
    QuestionRepository questionRepository;

    @Override
    public List<Question> findAllQuestions() {
        return questionRepository.findAll();
    }
}
