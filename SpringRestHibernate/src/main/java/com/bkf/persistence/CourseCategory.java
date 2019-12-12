package com.bkf.persistence;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name = "CourseCategory")
public class CourseCategory {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "CourseCategoryId")
	private Integer courseCategoryId;
	
	@Column(name = "CourseCategoryName")
	private String courseCategoryName;
	
	@OneToMany(mappedBy = "courseCategory")
	private List<CourseCatalog> catalogs;

	
	

	public Integer getCourseCategoryId() {
		return courseCategoryId;
	}

	public void setCourseCategoryId(Integer courseCategoryId) {
		this.courseCategoryId = courseCategoryId;
	}

	public List<CourseCatalog> getCatalogs() {
		return catalogs;
	}

	public void setCatalogs(List<CourseCatalog> catalogs) {
		this.catalogs = catalogs;
	}

	public String getCourseCategoryName() {
		return courseCategoryName;
	}

	public void setCourseCategoryName(String courseCategoryName) {
		this.courseCategoryName = courseCategoryName;
	}
	
	
	
}
