package hu.unideb.quiz.controller;

import hu.unideb.quiz.persistence.entities.User;
import hu.unideb.quiz.persistence.repositories.UserRepository;
import hu.unideb.quiz.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/")
public class LogInController {

    @Autowired
    UserService userService;

    @CrossOrigin(origins = "*")
    @RequestMapping(value = "/login", method = RequestMethod.POST)
    public ResponseEntity<User> findUser(@RequestParam("param") String username, @RequestParam("param2") String password) {
        User user = userService.getUserByUsernameAndPassword(username, password);
        //user.add(userService.getUserByUsernameAndPassword(username, password));
        System.out.println("The User is: " + user);
        if(user == null){
            return new ResponseEntity<User>(HttpStatus.NO_CONTENT);
        }
        return new ResponseEntity<User>(user, HttpStatus.OK);
    }
}
