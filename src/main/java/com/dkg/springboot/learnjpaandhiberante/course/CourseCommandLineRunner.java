package com.dkg.springboot.learnjpaandhiberante.course;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import com.dkg.springboot.learnjpaandhibernate.course.Course;

@Component
public class CourseCommandLineRunner implements CommandLineRunner {

    @Autowired
    private CourseSpringDataJpaRepository repository;

    @Override
    public void run(String... args) throws Exception {
        repository.save(new Course(1, "learn Devops", "in28minutes"));
        repository.save(new Course(2, "learn Aws", "in28minutes"));
        repository.save(new Course(3, "learn Azure", "in28minutes"));
        repository.save(new Course(4, "learn GCP", "in28minutes"));

        repository.deleteById(1l);
        System.out.println(repository.findById(3l));
        System.out.println(repository.findAll());
        System.out.println(repository.count());//gives the count of number of rows in db
        System.out.println(repository.findByAuthor("in28minutes"));
    }
}
