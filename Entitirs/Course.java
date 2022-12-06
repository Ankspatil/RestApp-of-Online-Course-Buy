package com.RestApi.Entitirs;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class Course {

	@Id
	private long id ;
	private String name ;
	private String title;
	private String description ;
	public Course(long id, String name, String title, String description) {
		super();
		this.id = id;
		this.name = name;
		this.title = title;
		this.description = description;
	}
	public Course() {
		super();
		// TODO Auto-generated constructor stub
	}
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	@Override
	public String toString() {
		return "Course [id=" + id + ", name=" + name + ", title=" + title + ", description=" + description + "]";
	}
	//<dependency>
	//<groupId>org.springframework.boot</groupId>
	//<artifactId>spring-boot-starter-data-jpa</artifactId>
//</dependency>
}
