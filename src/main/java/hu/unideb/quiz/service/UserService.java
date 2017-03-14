package hu.unideb.quiz.service;

import hu.unideb.quiz.persistence.entities.User;
import hu.unideb.quiz.persistence.repositories.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;

public interface UserService {

    void saveUser(User newUser);

    User getUserByUsernameAndPassword(String un, String pw);
}
