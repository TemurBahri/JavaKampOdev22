package Odev3.business;

import java.util.ArrayList;
import java.util.List;

import Odev3.dataAccess.BasicDao;
import Odev3.entities.Category;
import Odev3.logging.Logger;

public class CategoryManager {
	
	private BasicDao basicDao;
    private List<Logger> loggers;

    public CategoryManager(BasicDao basicDao, List<Logger> loggers) {
        this.basicDao = basicDao;
        this.loggers = loggers;
    }

    List<Category> categories = new ArrayList<>();
    public void add(Category newCategory) throws Exception {

        for (Category category1 : categories){
            if (category1.getCategoryName().equals(newCategory.getCategoryName())){
                throw new Exception("cannot repeat the same category");
            }
        }
        categories.add(newCategory);
        basicDao.addCategory(newCategory);

        for (Logger logger : loggers){
            logger.log(newCategory.getCategoryName());
        }

    }

}
