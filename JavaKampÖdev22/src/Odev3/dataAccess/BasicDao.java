package Odev3.dataAccess;

import Odev3.entities.Category;
import Odev3.entities.Course;
import Odev3.entities.Instructor;

public interface BasicDao {
	
	 void addCategory(Category category);
	    void addCourse(Course course);
	    void addIntructor(Instructor instructor);

}
