package Odev3;

import java.util.ArrayList;
import java.util.List;

import Odev3.business.CategoryManager;
import Odev3.business.CourseManager;
import Odev3.business.InstuctorManager;
import Odev3.dataAccess.HibernateDao;
import Odev3.dataAccess.JdbcDao;
import Odev3.entities.Category;
import Odev3.entities.Course;
import Odev3.entities.Instructor;
import Odev3.logging.DbLogger;
import Odev3.logging.Logger;
import Odev3.logging.MailLogger;

public class Main {
    public static void main(String[] args) throws Exception {

        List<Logger> loggers = new ArrayList<>();
        loggers.add(new DbLogger());
        loggers.add(new MailLogger());
      

        Category category = new Category("Programming");
       
        Course course = new Course("Java", 0);
     
        Instructor instructor = new Instructor("Engin","Demirog");

        CategoryManager categoryManager = new CategoryManager(new JdbcDao(),loggers);
        CourseManager courseManager = new CourseManager(new HibernateDao(),loggers);
        InstuctorManager instructorManager = new InstuctorManager();

        categoryManager.add(category);
      
        System.out.println("----------------------------------");
        courseManager.add(course);
   
        System.out.println("----------------------------------");
        instructorManager.add(instructor);






    }
}