package in.ac.charusat.studentmanagementsystem.Repository;

import in.ac.charusat.studentmanagementsystem.Model.Student;
import org.springframework.data.jpa.repository.JpaRepository;

public interface StudentRepository extends JpaRepository<Student, Integer> {
}
