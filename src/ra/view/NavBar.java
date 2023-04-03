package ra.view;

import ra.config.Config;

public class NavBar {
    public NavBar() {
        System.out.println("*************************CATEGORY MANAGER*****************************");
        System.out.println("1.Show List Category");
        System.out.println("2.Create Category");
        System.out.println("3.Update Category");
        System.out.println("4.Delete Category");
        System.out.println();
        int chooseMenu = Config.scanner().nextInt();
        switch (chooseMenu) {
            case 1:
                new CategoryView().showFormCategoryList();
                break;
            case 2:
                new CategoryView().formCreateCategory();
            case 3:
                new CategoryView().formUpdateCategory();
            case 4:
                new CategoryView().formDeleteCategory();
        }
    }
    public static void productManager(){
        while (true) {
            System.out.println("=====================Product Management===============================");
            System.out.println("1.Show List Product");
            System.out.println("2.Create Product");
            System.out.println();
            System.out.println(" nhap lua chon: ");
            int chooseMenu = Config.scanner().nextInt();
            switch (chooseMenu) {
                case 1:
                    new ProductView().showProduct();
                    break;
                case 2:
                    new ProductView().createProduct();
                    break;
            }
        }
    }

    public static void main(String[] args) {
        NavBar.productManager();























    }
}