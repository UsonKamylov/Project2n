import manager.Manager;
import productStoree.Products;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class ServiceProductImpl implements Service {

    private final List<Products> list = new ArrayList<>();

    @Override
    public void addProduct(List<Products> products) {
        products.stream().filter(r -> r.getCompanyName().equals("TOIBOSS")
                        || r.getCompanyName().equals("MILKA")
                        || r.getCompanyName().equals("NUR"))
                .filter(s -> s.getDate().minusMonths(1).isAfter(LocalDate.now())).forEach(System.out::println);
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
    public void uppDateProducts() {

        list.stream().filter(r-> r.getDate().plusDays(1).isBefore(LocalDate.now().)





//        for (int i = 0; i < list.size(); i++) {
//            if (LocalDate.now()
//                    .isBefore(list.get(i).getDate().plusDays(1))) {
//                list.get(i).
//
//
//            }
//
//        }

    }

    @Override
    public Products checkToManager(String login, String password) {
        Manager manager = new Manager("usonkamylov0@gmail.com", "090909kg");
        if (manager.getLogin().equals(login) || manager.getPassword().equals(password)) {
            System.out.println(manager);
        }

        return null;
    }

}
