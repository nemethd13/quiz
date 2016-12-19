package hu.unideb.quiz.service;

import hu.unideb.quiz.persistence.entities.User;
import hu.unideb.quiz.persistence.repositories.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements UserService{

    @Autowired
    UserRepository userRepository;

    @Override
    public void saveUser(User newUser) {
        userRepository.saveAndFlush(newUser);
    }
}
