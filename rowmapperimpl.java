package com.mvcspring.core.interface_crud.dao;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

public class rowmapperimpl implements RowMapper<student_copy>	
{

	public student_copy mapRow(ResultSet rs, int rowNum) throws SQLException {
		student_copy stud = new student_copy();
		stud.setId(rs.getInt(1));
		stud.setName(rs.getString(2));
		
		return stud;
	}

}
