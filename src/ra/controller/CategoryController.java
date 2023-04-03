package ra.controller;

import ra.model.Category;
import ra.service.CategoryServiceIMPL;
import ra.service.ICategoryService;

import java.util.List;

public class CategoryController {
    public ICategoryService categoryService = new CategoryServiceIMPL();
    public List<Category> getListCategory(){
        return categoryService.findAll();
    }
    public void createCategoryToDB(Category category){
        categoryService.save(category);
    }
    public void updateCategory(Category category){
        categoryService.save(category);
    }
    public Category detailCategory(int id ){
        return categoryService.findByID(id);
    }
    public void deleteCategory(int id){
        categoryService.deleteById(id);
    }
}
