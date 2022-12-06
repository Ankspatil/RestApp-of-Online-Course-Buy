package com.RestApi.Services;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.RestApi.Dao.CourseDao;
import com.RestApi.Entitirs.Course;


@Service
public class CourseServiceImpl implements CoursesService {

//	List<Course> list ;
	@Autowired
	private CourseDao courseDao ;
	
	public CourseServiceImpl()
	{
		
//		list = new ArrayList<>();
//		
//		list.add(new Course(123 , "java core courses" ,"this Course regarging api" , "NA"));
//		
//		list.add(new Course(124 , "Spring Boot" ,"this Course regarging api" , "hey.. print me"));
//		
//		list.add(new Course(121 , "python core courses" ,"this Course regarging api" , "author ankit"));
		
		
//
		}
	
	
	
	
	@Override
	public List<Course> getCourses() {
	  
		return courseDao.findAll();
	}

	@Override
	public Course getCourse(long courseId) {
		// TODO Auto-generated method stub
//		Course c = null ;
//		for(Course course : list)
//		{
//			if(course.getId()== courseId)
//			{
//				
//				c = course ;
//				break ;
//			}
//		}
//		return c ;
		
		return courseDao.getOne(courseId);
		
		
	}




	@Override
	public Course addCourse(Course course) {
//		// TODO Auto-generated method stub
//		list.add(course);
//		return course;
		
		courseDao.save(course);
		return course;
	}




	@Override
	public Course updateCourse(Course course) {
	    
//		list.forEach(e->{
//			
//			if(e.getId() == course.getId())
//			{
//				e.setTitle(course.getTitle());
//				e.setDescription(course.getDescription());
//				
//			}
//		});
//		return course ;
		
		courseDao.save(course);
		
		return course ;
	}
	
	@Override
	public void deleteCourse(long parseLong)
	{
//		list = this.list.stream().filter(e->e.getId()!=parseLong).collect(Collectors.toList());
		
	Course entity =	courseDao.getOne(parseLong);
	courseDao.delete(entity);
	
	}
	

}
