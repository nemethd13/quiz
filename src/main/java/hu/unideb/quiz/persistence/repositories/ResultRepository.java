package hu.unideb.quiz.persistence.repositories;

import hu.unideb.quiz.persistence.entities.Result;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ResultRepository extends JpaRepository<Result, Long> {
}
