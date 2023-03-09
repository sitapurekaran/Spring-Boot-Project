package com.example.demo.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "StudentInformation")
public class Course {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="StudentId")
	private long StudentId;
	@Column(name="StudentName")
	private String StudentName;
	@Column(name="StudentCity")
	private String StudentCity;
	 @Column(name="StudentBranch")
	private String StudentBranch;
	
	public Course() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Course(long studentId, String studentName, String studentCity, String studentBranch) {
		super();
		StudentId = studentId;
		StudentName = studentName;
		StudentCity = studentCity;
		StudentBranch = studentBranch;
	}

	public long getStudentId() {
		return StudentId;
	}

	public void setStudentId(long studentId) {
		StudentId = studentId;
	}

	public String getStudentName() {
		return StudentName;
	}

	public void setStudentName(String studentName) {
		StudentName = studentName;
	}

	public String getStudentCity() {
		return StudentCity;
	}

	public void setStudentCity(String studentCity) {
		StudentCity = studentCity;
	}

	public String getStudentBranch() {
		return StudentBranch;
	}

	public void setStudentBranch(String studentBranch) {
		StudentBranch = studentBranch;
	}

	@Override
	public String toString() {
		return "Course [StudentId=" + StudentId + ", StudentName=" + StudentName + ", StudentCity=" + StudentCity
				+ ", StudentBranch=" + StudentBranch + "]";
	}

}
