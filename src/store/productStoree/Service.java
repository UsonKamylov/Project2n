package store.productStoree;

import store.productStoree.Products;

import java.util.List;

public interface Service {
    void addProduct(List<Products>products);
    void uppDateProducts(List<Products>list1);
    void checkToManager(List<Products> products);

    }




