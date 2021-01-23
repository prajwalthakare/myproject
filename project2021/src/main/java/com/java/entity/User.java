package com.java.entity;
// default package
// Generated 21 Jan, 2021 10:00:49 PM by Hibernate Tools 5.2.3.Final

import static javax.persistence.GenerationType.IDENTITY;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * User generated by hbm2java
 */
@Entity
@Table(name = "user", catalog = "springmvc")
public class User implements java.io.Serializable {

	private Integer id;
	private String studentname;
	private String studDob;
	private String studDoj;
	private String password;
	

	public User() {
	}

	public User(String studentname, String studDob, String studDoj, String password) {
		this.studentname = studentname;
		this.studDob = studDob;
		this.studDoj = studDoj;
		this.password = password;
	}

	@Id
	@GeneratedValue(strategy = IDENTITY)

	@Column(name = "Id")
	public Integer getId() {
		return this.id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	@Column(name = "Studentname")
	public String getStudentname() {
		return this.studentname;
	}

	public void setStudentname(String studentname) {
		this.studentname = studentname;
	}

	@Column(name = "StudDob")
	public String getStudDob() {
		return this.studDob;
	}

	public void setStudDob(String studDob) {
		this.studDob = studDob;
	}

	@Column(name = "StudDoj")
	public String getStudDoj() {
		return this.studDoj;
	}

	public void setStudDoj(String studDoj) {
		this.studDoj = studDoj;
	}

	@Column(name = "Password")
	public String getPassword() {
		return this.password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	

}
