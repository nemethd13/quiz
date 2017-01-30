package hu.unideb.quiz.controller;

import hu.unideb.quiz.persistence.entities.Question;
import hu.unideb.quiz.persistence.entities.Result;
import hu.unideb.quiz.persistence.entities.User;
import hu.unideb.quiz.service.QuestionService;
import hu.unideb.quiz.service.ResultService;
import hu.unideb.quiz.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/")
public class QuizController {

    @Autowired
    QuestionService questionService;

    @Autowired
    ResultService resultService;

    @Autowired
    UserService userService;

    @CrossOrigin(origins = "*")
    @RequestMapping(value = "/", method = RequestMethod.GET)
    public ResponseEntity<List<Question>> listQuestions() {
        List<Question> questions = questionService.findAllQuestions();
        if(questions.isEmpty()){
            return new ResponseEntity<List<Question>>(HttpStatus.NO_CONTENT);
        }
        return new ResponseEntity<List<Question>>(questions, HttpStatus.OK);
    }

//    @CrossOrigin(origins = "*")
//    @RequestMapping(value = "/{theme}", method = RequestMethod.GET)
//    public ResponseEntity<List<Question>> listQuestionsByTheme(@PathVariable("theme") String theme) {
//        List<Question> questions = questionService.findQuestionsByTheme(theme);
//        if(questions.isEmpty()){
//            return new ResponseEntity<List<Question>>(HttpStatus.NO_CONTENT);
//        }
//        return new ResponseEntity<List<Question>>(questions, HttpStatus.OK);
//    }

//    @RequestMapping(value = "/result", method = RequestMethod.GET)
//    public ResponseEntity<List<Result>> listResults() {
//        List<Result> results = resultService.listAllResult();
//        if(results.isEmpty()){
//            return new ResponseEntity<List<Result>>(HttpStatus.NO_CONTENT);
//        }
//        return new ResponseEntity<List<Result>>(results, HttpStatus.OK);
//    }

//    @CrossOrigin(origins = "*")
//    @RequestMapping(value = "/themes", method = RequestMethod.GET)
//    public ResponseEntity<List> listThemes() {
//        List themes = questionService.findThemes();
//        if(themes.isEmpty()){
//            return new ResponseEntity<List>(HttpStatus.NO_CONTENT);
//        }
//        return new ResponseEntity<List>(themes, HttpStatus.OK);
//    }

//    @CrossOrigin(origins = "*")
//    @RequestMapping(value = "/newuser", method = RequestMethod.POST)
//    public void saveUser(@RequestBody  User newUser) {
//        System.out.println("Creating user: " + newUser.getUserName());
//
//        newUser.setId((long) 10);
//        userService.saveUser(newUser);
//
//
//    }
}
