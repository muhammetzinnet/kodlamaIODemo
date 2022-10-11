package DataAccess;

import Entities.Category;

public class jdbcCategoryDao implements CategoryDao {

    @Override
    public void Add(Category category) {
        System.out.println("JDBC ile veri tabanına eklendi...");
    }
}
