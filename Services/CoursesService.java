package com.RestApi.Services;

import java.util.List;

import com.RestApi.Entitirs.Course;

public interface CoursesService {
	
	public List<Course> getCourses();
   
	 public Course getCourse(long courseId);
	
	 public Course addCourse(Course course);
	 
	 public Course updateCourse(Course course);
	
	public void deleteCourse(long parseLong);

	
}
