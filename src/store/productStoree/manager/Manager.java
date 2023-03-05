package store.productStoree.manager;

public class Manager {
    private final String login="uson";
    private  final String password="0909";


    public Manager() {
    }

    public String getLogin() {
        return login;
    }


    public String getPassword() {
        return password;
    }


    @Override
    public String toString() {
        return "Manager{" +
                "login='" + login + '\'' +
                ", password='" + password + '\'' +
                '}';
    }
}
