package hu.unideb.quiz.service;

import hu.unideb.quiz.persistence.entities.Result;
import hu.unideb.quiz.persistence.repositories.ResultRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ResultServiceImpl implements ResultService {

    @Autowired
    ResultRepository resultRepository;

    @Override
    public List<Result> listAllResult() {
        return resultRepository.findAll();
    }
}
