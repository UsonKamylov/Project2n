package store.productStoree;

import store.productStoree.WheatProduct.Bread;
import store.productStoree.WheatProduct.Flour;
import store.productStoree.WheatProduct.Pasta;
import store.productStoree.DairyProduct.Kefir;
import store.productStoree.DairyProduct.Milk;
import store.productStoree.DairyProduct.Yogurt;
import store.productStoree.MeatProduct.Meat;
import store.productStoree.MeatProduct.Sausage;
import store.productStoree.Products;
import store.productStoree.MeatProduct.Fish;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        ServiceProductImpl serviceProduct = new ServiceProductImpl();
        List<Products> list = new ArrayList<>();
        list.add(new Fish(1, "fi", "TOIBOSS", LocalDate.of(2023, 3, 10)));
        list.add(new Fish(3, "fish", "TOIBOSS", LocalDate.of(2023, 4, 13)));
        list.add(new Fish(4, "fis2", "TOIBOSS", LocalDate.of(2023, 4, 3)));
        list.add(new Fish(6, "fish", "Toibosgg", LocalDate.of(2022, 3, 12)));

        list.add(new Meat(1, "mest", "TOIBOSS", LocalDate.of(2023, 4, 12)));
        list.add(new Meat(2, "mest", "TOIBOS", LocalDate.of(2023, 3, 1)));
        list.add(new Meat(3, "mest", "TOIBOSS", LocalDate.of(2023, 3, 13)));
        list.add(new Meat(4, "mest", "TOIBOSS", LocalDate.of(2023, 4, 13)));

        list.add(new Sausage(1, "sausae", "TOIBOS", LocalDate.of(2023, 3, 13)));
        list.add(new Sausage(2, "sauage", "TOIOSS", LocalDate.of(2023, 4, 13)));
        list.add(new Sausage(3, "sausge", "TOIBOS", LocalDate.of(2023, 3, 13)));
        list.add(new Sausage(4, "sausa", "TOIBSS", LocalDate.of(2023, 3, 13)));
        list.add(new Sausage(5, "sausa", "TOIBOSS", LocalDate.of(2023, 3, 13)));

        list.add(new Kefir(4, "Kefir", "MILKA", LocalDate.of(2023, 3, 23)));
        list.add(new Kefir(4, "Kefir", "MILKa", LocalDate.of(2023, 4, 17)));
        list.add(new Milk(5, "Milk", "MILA", LocalDate.of(2023, 3, 26)));
        list.add(new Milk(5, "Milk", "MILKA", LocalDate.of(2022, 4, 9)));
        list.add(new Yogurt(6, "Yogurt", "MILKA", LocalDate.of(2023, 2, 4)));
        list.add(new Yogurt(6, "Yogurt", "MILKA", LocalDate.of(2023, 3, 11)));

        list.add(new Bread(7, "Bread", "NUR", LocalDate.of(2023, 3, 27)));
        list.add(new Bread(7, "Bread", "NUR", LocalDate.of(2023, 4, 20)));
        list.add(new Flour(8, "Flour", "NUR", LocalDate.of(2023, 4, 18)));
        list.add(new Flour(8, "Flour", "NUR", LocalDate.of(2022, 4, 3)));
        list.add(new Pasta(9, "Pasta", "NUR", LocalDate.of(2023, 4, 16)));
        list.add(new Pasta(9, "Pasta", "NUR", LocalDate.of(2023, 3, 5)));


//        serviceProduct.addProduct(list);
//        serviceProduct.uppDateProducts(list);


//        login : uson
//         possword: 0909

        try {
            serviceProduct.checkToManager( list);
        } catch (MyException e){
            System.out.println(e.getMessage());
        }


    }
}