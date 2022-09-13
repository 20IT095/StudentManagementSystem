package in.ac.charusat.studentmanagementsystem.Repository;

import in.ac.charusat.studentmanagementsystem.Repository.Course;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CourseRepository extends JpaRepository<Course,Integer> {
}