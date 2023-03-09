package com.example.demo.servise;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collector;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.stereotype.Service;

import com.example.demo.Dao.CourseDao;
import com.example.demo.model.Course;

@Service
public class SreviceImpl implements CourseServise {

	@Autowired
	private CourseDao courseDao;

	@Override
	public List<Course> getCourse() {

		return courseDao.findAll();
	}

	@Override
	public Course addCourse(Course course) {

		courseDao.save(course);
		return course;
	}

	@Override
	public Course updateCourse(Course course) {

		courseDao.save(course);
		return course;
	}

	@Override
	public void deleteCourse(long StudentId) {

		Course course = courseDao.getOne(StudentId);
		courseDao.delete(course);
	}

}
