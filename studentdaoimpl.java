package com.mvcspring.core.interface_crud.dao;

import java.util.List;

import org.springframework.jdbc.core.JdbcTemplate;

public class studentdaoimpl implements studentdao{

	private JdbcTemplate jdbc;
	public int insert(student_copy stud) {
		String query = "insert into student values (?,?)";
		int r = this.jdbc.update(query,stud.getId(),stud.getName());
		return r;
	}
	
	public int change(student_copy stud) {
		String update = "update student set name=? where id=?";
		int update_re = this.jdbc.update(update,stud.getName(),stud.getId());
		return update_re;
	}
	
	public int delete(int studentid) {
		String delete = "delete from student where id=?";
		int delete_re = this.jdbc.update(delete,studentid);
		return delete_re;
	}
	
	public List<student_copy> getallstudent() {
		//select all
		String select = "select * from student";
		List<student_copy> students = this.jdbc.query(select, new rowmapperimpl());
		return students;
	}
	
	public JdbcTemplate getJdbc() {
		return jdbc;
	}
	public void setJdbc(JdbcTemplate jdbc) {
		this.jdbc = jdbc;
	}

	

	

	

	

}
