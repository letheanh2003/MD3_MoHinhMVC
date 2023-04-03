package ra.service;

import ra.config.Config;
import ra.model.Category;

import java.util.List;

public class CategoryServiceIMPL implements ICategoryService {
    List<Category> categoryList = new Config<Category>().readFromFile(Config.PATH_CATEGORY);

    @Override
    public List<Category> findAll() {
        return categoryList;
    }

    @Override
    public void save(Category category) {
        if (findByID(category.getId()) == null) {
            categoryList.add(category);
        } else {
            categoryList.set(categoryList.indexOf(findByID(category.getId())), category);
        }
        new Config<Category>().writeToFile(Config.PATH_CATEGORY, categoryList);
    }

    @Override
    public Category findByID(int id) {
        for (int i = 0; i < categoryList.size(); i++) {
            if (categoryList.get(i).getId() == id) {
                return categoryList.get(i);
            }
        }
        return null;
    }

    @Override
    public void deleteById(int id) {
        for (Category category : categoryList) {
            if (category.getId() == id) {
                categoryList.remove(category);
                new Config<Category>().writeToFile(Config.PATH_CATEGORY, categoryList);
                System.out.println("delete successfully!");
                return;
            }
        }
        System.out.println("In not found !");
    }
}
