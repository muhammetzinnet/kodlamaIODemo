package Business;

import Core.loging.Logger;
import DataAccess.CategoryDao;
import Entities.Category;

import java.util.ArrayList;
import java.util.List;

public class CategoryManager {

    private CategoryDao categoryDao;
    private Logger[] loggers;

    public CategoryManager(CategoryDao categoryDao, Logger[] loggers) {
        this.categoryDao = categoryDao;
        this.loggers = loggers;
    }

    public void Add(Category category) throws Exception {

        List<Category> categories = new ArrayList<>();

        for (Category catg:categories){
            if (catg.getCategoryName().equals(category.getCategoryName())){
                throw new Exception("Aynı isimde iki categori olmaz");
            }
        }

        categoryDao.Add(category);

        for (Logger logger:loggers){
            logger.Log(category.getCategoryName());
        }

    }
}
