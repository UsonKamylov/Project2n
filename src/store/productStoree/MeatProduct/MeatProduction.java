package store.productStoree.MeatProduct;

import store.productStoree.Products;

import java.time.LocalDate;

public abstract class MeatProduction  extends Products {
    public MeatProduction(int id, String name, String companyName, LocalDate date) {
        super(id, name, companyName, date);
    }
}
