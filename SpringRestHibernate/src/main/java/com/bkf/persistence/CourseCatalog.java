package com.bkf.persistence;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "CourseCatalog")
public class CourseCatalog {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "Id")
	private Integer id;
	
	@Column(name = "CourseCatalogName")
	private String courseCatalogName;

	@ManyToOne(cascade = CascadeType.ALL)
	@JoinColumn(name = "courseCategoryId")
	private CourseCategory courseCategory;
	
	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getCourseCatalogName() {
		return courseCatalogName;
	}

	public void setCourseCatalogName(String courseCatalogName) {
		this.courseCatalogName = courseCatalogName;
	}
	
	
	
	
}
