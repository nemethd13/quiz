package hu.unideb.quiz.persistence.repositories;

import hu.unideb.quiz.persistence.entities.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends JpaRepository<User, Long> {

    User findByUserNameAndPassWord(String uname, String pwd);
}
