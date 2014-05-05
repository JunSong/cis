package cn.edu.bnuz.cis.repository;

import cn.edu.bnuz.cis.domain.Student;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.rest.core.annotation.RestResource;

/**
 * @author Closure
 */
@RestResource(rel = "student", path = "student")
public interface StudentRepository extends CrudRepository<Student, String> {
}
