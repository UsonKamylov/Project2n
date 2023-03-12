package store.productStoree;

import store.productStoree.MyException;
import store.productStoree.Service;
import store.productStoree.manager.Manager;
import store.productStoree.Products;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ServiceProductImpl implements Service {

    private final List<Products> list = new ArrayList<>();
    private final List<Products> list1 = new ArrayList<>();
    Manager manager = new Manager();
    public static final String ANSI_BLUE = "\u001B[34m";
    public static final String ANSI_RED = "\u001B[31m";
    public static final String ANSI_RESET = "\u001B[0m";
    public static final String ANSI_WHITE = "\u001B[37m";
    public static final String ANSI_GREEN = "\u001B[32m";
    public static final String ANSI_YELLOW = "\u001B[33m";
    public static final String ANSI_CYAN = "\u001B[36m";


    @Override
    public void addProduct(List<Products> products) {
        System.out.println(ANSI_CYAN + "ACCEPTED GOODS : " + ANSI_RESET);
        products.stream().filter(r -> r.getCompanyName().equals("TOIBOSS")
                        || r.getCompanyName().equals("MILKA")
                        || r.getCompanyName().equals("NUR"))
                .filter(s -> s.getDate().minusMonths(1)

                        .isAfter(LocalDate.now())).forEach(System.out::println);

        list.addAll(products);


//        for (int i = 0; i < products.size(); i++) {
//            if (products.get(i).getCompanyName().equals("TOIBOSS")
//                    || products.get(i).getCompanyName().equals("NUR")
//                    || products.get(i).getCompanyName().equals("MILKA")) {
//                if (products.get(i).getDate().minusMonths(1).isAfter(LocalDate.now())) {
//                    list.add(products.get(i));
//
//                }
//            }
//        }
//        System.out.println(list);

    }


    @Override
    public void uppDateProducts(List<Products> list1) {
        List<Products> productsl = list1.stream().filter(x -> x.getCompanyName().equals("TOIBOSS")
                        || x.getCompanyName().equals("NUR") || x.getCompanyName().equals("MILKA"))
                .filter(y -> y.getDate().isBefore(LocalDate.now())).toList();
        System.out.println(ANSI_RED + "EXPIRED PRODUCTS " + ANSI_RESET);
        productsl.forEach(System.out::println);
        list1.removeIf(p -> p.getDate().isBefore(LocalDate.now()));
        List<Products> productsList = list1.stream().filter(x -> x.getCompanyName().equals("TOIBOSS")
                        || x.getCompanyName().equals("NUR") || x.getCompanyName().equals("MILKA"))
                .filter(c -> !c.getDate().isAfter(LocalDate.now().plusDays(7))).toList();
        System.out.println(ANSI_BLUE + "DISCOUNT" + ANSI_RESET);
        productsList.forEach(System.out::println);


    }

    @Override
    public void checkToManager(List<Products> products) {
        Scanner scanner = new Scanner(System.in);
        System.out.println(ANSI_YELLOW + "Введите логин пороль :" + ANSI_RESET);
        String login = scanner.nextLine();
        System.out.println(ANSI_YELLOW + "Напишите пароль: " + ANSI_RESET);
        String password = scanner.nextLine();
        if (login.equals(manager.getLogin()) && password.equals(manager.getPassword())) {
            System.out.println(ANSI_GREEN + "Welcome : " + login + ANSI_GREEN);
            addProduct(products);
            uppDateProducts(products);

        } else {
            throw new MyException("Wrong login and password");
        }

    }

}



