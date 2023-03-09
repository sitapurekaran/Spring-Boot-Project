package com.example.demo.servise;

import java.util.List;

import com.example.demo.model.Course;

public interface CourseServise {
	public List<Course> getCourse();

	public Course addCourse(Course course);

	public Course updateCourse(Course course);

	public void deleteCourse(long StudentId);
}
