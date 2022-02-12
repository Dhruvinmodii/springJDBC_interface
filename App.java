package com.mvcspring.core.interface_crud;

import org.springframework.context.ApplicationContext;
import java.util.*;
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
        //FIXED LINE
        Scanner input = new Scanner(System.in);
        studentdao s1 = context.getBean("studentdao",studentdao.class);
        
        //-----------------INSERT DATA-----------------
        
//           
//           
//           System.out.println("Enter ID : ");
//           int user_id =input.nextInt();
//           
//           System.out.println("Enter Name : ");
//           String user_name =input.next();
//           
//           
//           student_copy stud1 = new student_copy();
//           stud1.setId(user_id);
//           stud1.setName(user_name);
//           
//           int result = s1.insert(stud1);
//           System.out.println(result);
        
//  		--------------------------------------------------------        
           
           //-----------------UPDATE DATA -----------------------------
        
//        	student_copy stud1 = new student_copy();
//        	stud1.setId(1);
//        	stud1.setName("Ria");
//        	
//        	int result = s1.change(stud1);
//        	System.out.println("Data Changed : "+result);
        
        
        	//-----------------DELETE DATA -----------------------------
//           int result = s1.delete(1);
//           System.out.println("Data Deleted : " +result);
        
        	//-----------------SELECT DATA -----------------------------
        
        List<student_copy> getallstudent = s1.getallstudent();
        for(student_copy s:getallstudent)
        {
        	System.out.println(s);
        }
    }
}
