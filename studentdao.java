package com.mvcspring.core.interface_crud.dao;

import java.util.List;

public interface studentdao {
	public int insert(student_copy stud);
	public int change(student_copy stud);
	public int delete(int studentid);
	public List<student_copy> getallstudent();
}
