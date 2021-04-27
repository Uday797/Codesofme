package com.uday.srpring_orm.entities;


import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "emptable")
public class Employee {
	
	@Id
	@Column(name= "empid")
	private int id;
	
	@Column(name = "empname")
	private String name;
	
	@Column(name = "empemail")
	private String email;
	
	public Employee() {
		
	}

	public Employee(int id, String name, String email) {
		super();
		this.id = id;
		this.name = name;
		this.email = email;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}
	
	@Override
	public String toString() {
		return "Employee [Id=" + id + ", name=" + name + ", email=" + email + "]";
	}
	

}
