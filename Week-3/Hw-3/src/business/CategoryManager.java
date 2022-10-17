package business;

import java.util.List;

import dataAccess.CategoryDao;
import entities.Category;
import logging.Logger;

public class CategoryManager {
	private CategoryDao categoryDao;
    private  Logger[] loggers;
    private final List<Category> categories;

    public CategoryManager(CategoryDao categoryDao, Logger[] loggers, List<Category> categories) {
        this.categoryDao = categoryDao;
        this.loggers = loggers;
        this.categories = categories;
    }
    
    public void add(Category category) throws Exception{
        for(Category categories : categories){
            if (categories.getCategoryName() == category.getCategoryName()){
                throw  new Exception("Ayný kategori ismi kullanýlamaz");
            }
        }
        
        categoryDao.add(category);
    }
}
