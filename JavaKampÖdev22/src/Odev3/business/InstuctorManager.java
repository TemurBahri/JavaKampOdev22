package Odev3.business;

import java.util.List;

import Odev3.dataAccess.BasicDao;
import Odev3.entities.Instructor;
import Odev3.logging.Logger;

public class InstuctorManager {
	
	private BasicDao basicDao;
    private List<Logger> loggers;

    public void InstructorManager(BasicDao basicDao, List<Logger> loggers) {
        this.basicDao = basicDao;
        this.loggers = loggers;
    }

    public void add(Instructor instructor){

        basicDao.addIntructor(instructor);

        for (Logger logger : loggers){
            logger.log(instructor.getInstructorName()+" "+instructor.getInstructorLastName());
        }
    }

}
