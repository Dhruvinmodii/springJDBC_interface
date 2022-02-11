package com.mvcspring.core.interface_crud;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.jdbc.core.JdbcTemplate;

import com.mvcspring.core.interface_crud.dao.student_copy;
import com.mvcspring.core.interface_crud.dao.studentdao;


public class App 
{
    public static void main( String[] args )
    {
        System.out.println( "Hello World!" );
        ApplicationContext context = new ClassPathXmlApplicationContext("com/mvcspring/core/interface_crud/config.xml");
        
//        JdbcTemplate template = (JdbcTemplate)context.getBean("jdbctemp");
//        
//        String query = "insert into student values (?,?)";
//        int result = template.update(query,1,"Dhruvin");
//        System.out.println(result);
        
        //method 2 using interfase
           studentdao s1 = context.getBean("studentdao",studentdao.class);
           student_copy stud1 = new student_copy();
           stud1.setId(17);
           stud1.setName("Ria");
           
           int result = s1.insert(stud1);
           System.out.println(result);
    }
}
