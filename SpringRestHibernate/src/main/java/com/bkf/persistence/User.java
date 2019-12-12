package com.bkf.persistence;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import com.bkf.constants.Role;

@Entity
@Table(name = "User")
public class User {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "Id")
	private Integer id;
	
	@Column(name  = "FirstName")
	private String firstName;
	
	@Column(name = "LastName")	
	private String lastName;
	
	@Column(name = "Role")
	private Role role;
	
	@Column(name = "DateOfBirth")
	private String dateOfBirth;
	
	@Column(name = "Address")
	private String address;
	
	@Column(name = "PrimaryContactNumber")
	private String primaryContactNumber;
	
	@Column(name = "SecondaryContactNumber")
	private String secondaryContactNumber;
	
	@Column(name = "UserName")
	private String userName;
	
	@Column(name = "HashedPassword")
	private String hashedPassword;
	
	@Column(name = "CreatedBy")
	private String createdBy;
	
	@Column(name = "ModifiedBy")
	private String modifiedBy;
	
	@Column(name = "CreatedAt")
	private Date createdAt;
	
	@Column(name = "ModifiedAt")
	private Date modifedAt;
	
	
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public Role getRole() {
		return role;
	}
	public void setRole(Role role) {
		this.role = role;
	}
	public String getCreatedBy() {
		return createdBy;
	}
	public void setCreatedBy(String createdBy) {
		this.createdBy = createdBy;
	}
	public String getModifiedBy() {
		return modifiedBy;
	}
	public void setModifiedBy(String modifiedBy) {
		this.modifiedBy = modifiedBy;
	}
	public Date getCreatedAt() {
		return createdAt;
	}
	public void setCreatedAt(Date createdAt) {
		this.createdAt = createdAt;
	}
	public Date getModifedAt() {
		return modifedAt;
	}
	public void setModifedAt(Date modifedAt) {
		this.modifedAt = modifedAt;
	}
	public String getDateOfBirth() {
		return dateOfBirth;
	}
	public void setDateOfBirth(String dateOfBirth) {
		this.dateOfBirth = dateOfBirth;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String getPrimaryContactNumber() {
		return primaryContactNumber;
	}
	public void setPrimaryContactNumber(String primaryContactNumber) {
		this.primaryContactNumber = primaryContactNumber;
	}
	public String getSecondaryContactNumber() {
		return secondaryContactNumber;
	}
	public void setSecondaryContactNumber(String secondaryContactNumber) {
		this.secondaryContactNumber = secondaryContactNumber;
	}
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public String getHashedPassword() {
		return hashedPassword;
	}
	public void setHashedPassword(String hashedPassword) {
		this.hashedPassword = hashedPassword;
	}
	
	
	
	
	
}
