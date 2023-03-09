package com.example.demo.Dao;

import java.io.Serializable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.demo.model.Course;

public interface CourseDao extends JpaRepository<Course, Long> {

}
