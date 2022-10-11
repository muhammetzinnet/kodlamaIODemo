package DataAccess;

import Entities.Instructor;

public class jdbcInstructorDao implements InstructorDao{
    @Override
    public void Add(Instructor instructor) {
        System.out.println("JDBC ile veritabanına eklendi...");
    }
}
