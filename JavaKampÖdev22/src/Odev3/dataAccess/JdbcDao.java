package Odev3.dataAccess;

import Odev3.entities.Category;
import Odev3.entities.Course;
import Odev3.entities.Instructor;

public class JdbcDao implements BasicDao{

	@Override
	public void addCategory(Category category) {
		System.out.println(("Added with JDBC = " + "category name = " + category.getCategoryName()));
		
	}

	@Override
	public void addCourse(Course course) {
		System.out.println("Added with JDBC = " + "course name = " + course.getCourseName() + "\n" +
                "course price = " + course.getCoursePrice());
		
	}

	@Override
	public void addIntructor(Instructor instructor) {
		 System.out.println("Added with JDBC = " + "instructor name = " + instructor.getInstructorName());
		
	}
	
	

}
