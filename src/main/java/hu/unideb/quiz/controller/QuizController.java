package hu.unideb.quiz.controller;

import hu.unideb.quiz.persistence.entities.Question;
import hu.unideb.quiz.persistence.entities.Result;
import hu.unideb.quiz.service.QuestionService;
import hu.unideb.quiz.service.ResultService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/")
public class QuizController {

    @Autowired
    QuestionService questionService;

    @Autowired
    ResultService resultService;

    @RequestMapping(value = "/", method = RequestMethod.GET)
    public ResponseEntity<List<Question>> listQuestions() {
        List<Question> questions = questionService.findAllQuestions();
        if(questions.isEmpty()){
            return new ResponseEntity<List<Question>>(HttpStatus.NO_CONTENT);
        }
        return new ResponseEntity<List<Question>>(questions, HttpStatus.OK);
    }

    @RequestMapping(value = "/result", method = RequestMethod.GET)
    public ResponseEntity<List<Result>> listResults() {
        List<Result> results = resultService.listAllResult();
        if(results.isEmpty()){
            return new ResponseEntity<List<Result>>(HttpStatus.NO_CONTENT);
        }
        return new ResponseEntity<List<Result>>(results, HttpStatus.OK);
    }
}
