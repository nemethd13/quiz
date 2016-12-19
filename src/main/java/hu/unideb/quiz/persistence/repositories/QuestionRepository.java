package hu.unideb.quiz.persistence.repositories;

import hu.unideb.quiz.persistence.entities.Question;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface QuestionRepository extends JpaRepository<Question, Long> {

    @Query("select distinct q.theme from Question q")
    List findThemes();

    List<Question> findByTheme(String theme);
}
