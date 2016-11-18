package hu.unideb.quiz.persistence.repositories;

import hu.unideb.quiz.persistence.entities.Question;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface QuestionRepository extends JpaRepository<Question, Long> {
}