package ra.view;

import ra.config.Config;
import ra.controller.CategoryController;
import ra.controller.ProductController;
import ra.model.Category;
import ra.model.Product;

import java.util.List;

public class ProductView {
    private static ProductController productController = new ProductController();
    private static CategoryController categoryController = new CategoryController();
   public void showProduct() {
       System.out.println("=================Product Management=======================");
       for (Product product: getList()) {
           System.out.println(product);
       }
   }

    private static List<Product> getList() {
        return productController.showProduct();
    }

    public void createProduct(){
       Product product = new Product();
       if (getList().size()==0){
           product.setProductId(1);
       }else {
           product.setProductId(getList().get(getList().size() - 1).getProductId()+1);
       }
        System.out.println(" Enter the name ");
       product.setProductName(Config.scanner().nextLine());
        for (Category category:categoryController.getListCategory()) {
            System.out.println(category);
        }
        System.out.println("Enter select category by id");
        int id  = Config.scanner().nextInt();
       product.setCategory(categoryController.detailCategory(id));
        System.out.println("Enter the price");
        product.setPrice(Config.scanner().nextFloat());
        System.out.println("Enter the status: ");
        product.setProductStatus(Config.scanner().hasNextBoolean());
        productController.createProduct(product);
   }

}
