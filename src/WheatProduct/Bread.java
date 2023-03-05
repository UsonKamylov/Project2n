package WheatProduct;

import java.time.LocalDate;

public class Bread extends WheatProduction {
    public Bread(int id, String name, String companyName, LocalDate date) {
        super(id, name, companyName, date);
    }
}
