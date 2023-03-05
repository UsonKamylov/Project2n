import productStoree.Products;

import java.util.List;

public interface Service {
    void addProduct(List<Products>products);
    void uppDateProducts();
    Products checkToManager(String login,String password);

    }




