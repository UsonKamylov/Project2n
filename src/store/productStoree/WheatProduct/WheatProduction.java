package store.productStoree.WheatProduct;

import store.productStoree.Products;

import java.time.LocalDate;

public abstract class WheatProduction  extends Products {
    public WheatProduction(int id, String name, String companyName, LocalDate date) {
        super(id, name, companyName, date);
    }


}
