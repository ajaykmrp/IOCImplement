package com.test.IOCImplement;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        System.out.println( "Student List" );
        ApplicationContext context = new ClassPathXmlApplicationContext("Config.xml");
        Student stud1 = (Student)context.getBean("student1");
        Student stud2 = (Student)context.getBean("student2");
        System.out.println(stud1);
        System.out.println(stud2);
       
    }
}
