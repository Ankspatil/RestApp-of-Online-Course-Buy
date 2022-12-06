package com.RestApi.Contoller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.RestApi.Entitirs.Course;
import com.RestApi.Services.CoursesService;

@RestController
@CrossOrigin
public class Controller {
     
	
	@Autowired
	private CoursesService cs ;
	
	
	
@GetMapping("/home")
public String home()
{
	return "Welcome to courses application";
}

@GetMapping("/courses")
public List<Course> getCourse()
{
	return this.cs.getCourses();
}

@GetMapping("/courses/{courseId}")
public Course getCourses(@PathVariable String courseId)
{
	return this.cs.getCourse(Long.parseLong(courseId));
}


@PostMapping("/courses")
public Course addCourse( @RequestBody Course course)
{
	return this.cs.addCourse(course);
}

@PutMapping("/courses")
public Course updateCourse( @RequestBody Course course)
{
	return this.cs.updateCourse(course);
}


@DeleteMapping("/courses/{courseId}")
public ResponseEntity<HttpStatus> deleteCourse(@PathVariable String courseId)
{
	try {
		this.cs.deleteCourse(Long.parseLong(courseId));
		return new ResponseEntity<>(HttpStatus.OK);
	}
	catch(Exception e)
	{
		return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
	}
}

}
