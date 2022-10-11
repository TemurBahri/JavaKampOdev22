package Odev3.dataAccess;

import Odev3.entities.Category;
import Odev3.entities.Course;
import Odev3.entities.Instructor;

public class HibernateDao implements BasicDao {

	@Override
	public void addCategory(Category category) {
		 System.out.println(("Added with Hibernate = " + "category name = " + category.getCategoryName()));
		
	}

	@Override
	public void addCourse(Course course) {
		System.out.println("Added with Hibernate = " + "course name = " + course.getCourseName() + "\n" +
                "course price = " + course.getCoursePrice());
	}

	@Override
	public void addIntructor(Instructor instructor) {
		System.out.println("Added with Hibernate = " + "instructor name = " + instructor.getInstructorName());
		
	}

}
