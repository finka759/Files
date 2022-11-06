import java.util.Arrays;

public class Phone {
    String number;
    String model;
    double weight;
    static int count = 0;

    public Phone(String number, String model, double weight) {
        this(number, weight);
        this.model = model;

    }

    public Phone(String number, double weight) {
        this.number = number;
        this.weight = weight;
        count++;
    }

    public Phone() {
        count++;
    }

    static int getCount(){
        return count;
    }

    void receiveCall(String name) {
        System.out.println("Calling " + name);
    }

    void receiveCall(String name, String number) {
        System.out.println("Calling " + name + "with number" + number);
        System.out.println("My phone number" + this.number);
    }

    String getNumber() {
        return number;
    }

    void sendMessage(String mesage, String... number) {
        System.out.println(mesage + "number = " + Arrays.toString(number));
    }

    @Override
    public String toString() {
        return "Phone{" +
                "number='" + number + '\'' +
                ", model='" + model + '\'' +
                ", weight=" + weight +
                '}';
    }
}