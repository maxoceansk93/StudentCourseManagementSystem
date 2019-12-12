package com.bkf.persistence;

import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name = "Course")
public class Course {

	private Integer id;
	
	private String courseName;
	
	private String courseDescription;
	
	
	
}
