package cn.edu.bnuz.cis.repository;

import cn.edu.bnuz.cis.domain.Quiz;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.rest.core.annotation.RestResource;

/**
 * @author Closure
 */
@RestResource(rel = "quiz", path = "quiz")
public interface QuizRepository extends CrudRepository<Quiz, Integer> {
}
