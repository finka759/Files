import java.util.*;
import java.util.function.Consumer;

public class ConsumerDemo {
    public static void main(String[] args) {
        Consumer<Phone> consumer1 = phone -> System.out.println("Продали телефон" + phone);
        Consumer<Phone> consumer2 = phone -> System.out.println("Отправляем телефон" + phone);
        consumer1.andThen(consumer2).accept(new Phone("0057603", "model", 32));

    }
}
