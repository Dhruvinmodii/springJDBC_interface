package com.mvcspring.core.interface_crud.dao;

import org.springframework.jdbc.core.JdbcTemplate;

public class studentdaoimpl implements studentdao{

	private JdbcTemplate jdbc;
	public int insert(student_copy stud) {
		String query = "insert into student values (?,?)";
		int r = this.jdbc.update(query,stud.getId(),stud.getName());
		return r;
	}
	public JdbcTemplate getJdbc() {
		return jdbc;
	}
	public void setJdbc(JdbcTemplate jdbc) {
		this.jdbc = jdbc;
	}
	

	

}
