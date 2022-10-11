package DataAccess;

import Entities.Course;

public class jdbcCourseDao implements CourseDao{
    @Override
    public void Add(Course course) {
        System.out.println("JDBC ile veritabanına eklendi...");
    }
}
