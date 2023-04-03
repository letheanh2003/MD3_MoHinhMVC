package ra.model;

import java.io.Serializable;

public class Product implements Serializable {
    private int productId;
    private String productName;
    private Category category;
    private float price;
    private boolean productStatus;


    public Product() {
    }

    public Product(int productId, String productName,Category category, float price, boolean productStatus) {
        this.productId = productId;
        this.productName = productName;
        this.category = category;
        this.price = price;
        this.productStatus = productStatus;
    }

    public int getProductId() {
        return productId;
    }

    public void setProductId(int productId) {
        this.productId = productId;
    }

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public float getPrice() {
        return price;
    }

    public void setPrice(float price) {
        this.price = price;
    }

    public boolean isProductStatus() {
        return productStatus;
    }

    public void setProductStatus(boolean productStatus) {
        this.productStatus = productStatus;
    }

    public Category getCategory() {
        return category;
    }

    public void setCategory(Category category) {
        this.category = category;
    }

    @Override
    public String toString() {
        return "Product{" +
                "productId=" + productId +
                ", productName='" + productName + '\'' +
                ", category=" + category +
                ", price=" + price +
                ", productStatus=" + productStatus +
                '}';
    }
}
