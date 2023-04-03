package ra.controller;

import ra.model.Product;
import ra.service.ProductServiceIMPL;

import java.util.List;

public class ProductController {
    private static ProductServiceIMPL productService = new ProductServiceIMPL();
    public List<Product> showProduct(){
        List<Product> productList = productService.findAll();
        return productList;
    }
    public void createProduct(Product product){
        productService.save(product);
    }
}
