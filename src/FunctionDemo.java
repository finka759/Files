import java.util.function.Function;

public class FunctionDemo {
    public static void main(String[] args) {
        Function<Integer, String> function = i ->{
            String result = "Ноль";
            if (i>0){
                result = "Положительное число";
            }else if(i<0){
                result = "Отрицательное число";
            }
            return result;
        };
        System.out.println(function.apply(-9));
        System.out.println(function.apply(0));
        System.out.println(function.apply(99));
    }
}

