package com.RestApi.Dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.RestApi.Entitirs.Course;

public interface CourseDao extends JpaRepository<Course, Long> {
	
	

}
