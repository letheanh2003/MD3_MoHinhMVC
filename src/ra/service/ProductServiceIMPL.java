package ra.service;

import ra.config.Config;
import ra.model.Product;

import java.util.List;

public class ProductServiceIMPL implements IProduct{
     List<Product> productList = new Config<Product>().readFromFile(Config.PATH_PRODUCT);
    @Override
    public List<Product> findAll() {
        return productList;
    }

    @Override
    public void save(Product product) {
        productList.add(product);
        new Config<Product>().readFromFile(Config.PATH_PRODUCT);
    }

    @Override
    public Product findByID(int id) {
        return null;
    }

    @Override
    public void deleteById(int id) {

    }
}
