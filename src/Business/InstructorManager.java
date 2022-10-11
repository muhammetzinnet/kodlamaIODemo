package Business;

import Core.loging.Logger;
import DataAccess.InstructorDao;
import Entities.Instructor;

import java.util.ArrayList;
import java.util.List;

public class InstructorManager {
    private InstructorDao instructorDao;
    private Logger[] loggers;

    public InstructorManager(InstructorDao instructorDao, Logger[] loggers) {
        this.instructorDao = instructorDao;
        this.loggers = loggers;
    }

    public void Add(Instructor instructor){
        List<Instructor> instructors = new ArrayList<>();
        instructors.add(instructor);
        for (Logger logger:loggers){
            logger.Log(instructor.getFirstName());
        }

    }
}
