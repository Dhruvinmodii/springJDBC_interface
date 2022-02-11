package com.mvcspring.core.interface_crud.dao;

public class student_copy {
	private int id;
	private String name;
	public student_copy() {
		
	}
	public student_copy(int id, String name) {
		super();
		this.id = id;
		this.name = name;
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
	@Override
	public String toString() {
		return "student_copy [id=" + id + ", name=" + name + "]";
	}
	
	
}
