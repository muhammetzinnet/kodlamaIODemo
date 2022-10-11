package Business;

import Core.loging.Logger;
import DataAccess.CourseDao;
import Entities.Course;

import java.util.ArrayList;
import java.util.List;

public class CourseManager {
    private CourseDao courseDao;
    private Logger[] loggers;

    public CourseManager(CourseDao courseDao, Logger[] loggers) {
        this.courseDao = courseDao;
        this.loggers = loggers;
    }

    public void Add(Course course){
        List<Course> courses = new ArrayList<>();
        if (course.getCoursePrice() < 0){
            System.out.println("Kursun fiyatı sıfırdan küçük olamaz..");
        }
        for (Course cou:courses){
            if (cou.getCourseName().equals(course.getCourseName())){
                System.out.println("Aynı isimli kurs olamaz...");
            }
        }

        courseDao.Add(course);
        for (Logger logger:loggers){
            logger.Log(course.getCourseName());
        }

    }
}
