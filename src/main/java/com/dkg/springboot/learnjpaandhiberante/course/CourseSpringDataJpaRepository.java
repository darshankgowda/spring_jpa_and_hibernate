package com.dkg.springboot.learnjpaandhiberante.course;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.dkg.springboot.learnjpaandhibernate.course.Course;



@Repository
public interface CourseSpringDataJpaRepository extends JpaRepository<Course, Long>{
	
	//spring data JPA also allows us to define our own methods for getting data in data base
	
	List<Course> findByAuthor(String author);
	
}
