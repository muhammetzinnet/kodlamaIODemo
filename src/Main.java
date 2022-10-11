import Business.CategoryManager;
import Business.CourseManager;
import Entities.Category;
import Entities.Course;

public class Main {
    public static void main(String[] args) throws Exception {
        Category category = new Category(1,"java");
        Category category_1 = new Category(2,"java");
        CategoryManager categoryManager = new CategoryManager();
        categoryManager.Add(category);
        categoryManager.Add(category_1);



    }
}