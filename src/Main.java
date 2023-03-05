import productStoree.Products;
import productStoree.MeatProduct.Fish;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
      ServiceProductImpl serviceProduct=new ServiceProductImpl();
      List<Products> list=new ArrayList<>();
        list.add(new Fish(1,"Aibek","TOIBOSS", LocalDate.of(2023,4,10)));
        list.add(new Fish(2,"Asan","TOISS", LocalDate.of(2023,4,20)));
        list.add(new Fish(3,"Bakyt","TOIBOSS", LocalDate.of(2023,4,13)));
        list.add(new Fish(4,"a","TOIBOSS", LocalDate.of(2023,4,17)));
        list.add(new Fish(5,"Lka","TOIBOSS", LocalDate.of(2023,4,15)));
        list.add(new Fish(6,"ka","Toibosgg", LocalDate.of(2022,3,14)));
//      System.out.println(list.get(0).getDate().minusMonths(1).isAfter(LocalDate.now()));
//      System.out.println(list.get(1).getDate().minusMonths(1).isAfter(LocalDate.now()));
//      System.out.println(list.get(2).getDate().minusMonths(1).isAfter(LocalDate.now()));
//      System.out.println(list.get(3).getDate().minusMonths(1).isAfter(LocalDate.now()));
//      System.out.println(list.get(4).getDate().minusMonths(1).isAfter(LocalDate.now()));
//      System.out.println(list.get(5).getDate().minusMonths(1).isAfter(LocalDate.now()));

        serviceProduct.addProduct(list);

      Scanner scanner=new Scanner(System.in);
      

    }
}