import java.util.HashMap;
import java.util.Map;

public class program {
    public static void main(String[] args) {
        int size = methods.inputNum("Введите размер массива: ");

        int[] numbers = methods.fillArray(size);

        System.out.println("Массив целых чисел:");
        methods.showArray(numbers);

        System.out.println("\n");

        System.out.println("Словарь частот: ");
        Map<Integer,Integer> dictionary = new HashMap<Integer,Integer>();
        dictionary = methods.fillDict(dictionary, numbers);
        System.out.println(dictionary.toString());

        System.out.println("\n");


        System.out.println("Или в более красивом виде:");
        methods.showDict(dictionary);
    }
}