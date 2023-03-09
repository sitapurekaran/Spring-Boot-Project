package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.model.Course;
import com.example.demo.servise.CourseServise;

@RestController
@RequestMapping("/Course")
public class Controller {
	@Autowired
	private CourseServise courseServise;

	@GetMapping("/courses")
	public List<Course> getCourse() {
		return this.courseServise.getCourse();

	}
	
	@PostMapping("/courses")
	public Course addCourse(@RequestBody Course course) {
		return this.courseServise.addCourse(course);

	}

	@PutMapping("courses")
	public Course updateCourse(@RequestBody Course course) {
		return this.courseServise.updateCourse(course);
	}

	@DeleteMapping("courses/{StudentId}")
	public void deleteCourse(@PathVariable("StudentId") long StudentId) {
		this.courseServise.deleteCourse(StudentId);

	}
}
