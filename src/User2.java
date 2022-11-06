import java.util.*;

public class User2 {
    private String login, password;



    public User2(String login, String password) {
        this.login = login;
        this.password = password;
    }

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public void createQuery() {
        class Query {
            public void printToLog() {
                System.out.printf("User with login %s and password %s sent query\n",
                        login, password);
            }
        }
        Query query = new Query();
        query.printToLog();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        User2 user1 = (User2) o;
        return Objects.equals(login, user1.login) && Objects.equals(password, user1.password);
    }

    @Override
    public int hashCode() {
        return Objects.hash(login, password);
    }

    @Override
    public String toString() {
        return "User2{" +
                "login='" + login + '\'' +
                ", password='" + password + '\'' +
                '}';
    }


    public static void main(String[] args) {
        User2 user = new User2("login1", "password1");


        user.createQuery();

    }

}
