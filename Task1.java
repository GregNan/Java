import java.util.List;
import java.util.Random;
//Заполнить список десятью случайными числами.
//Отсортировать список методом sort() и вывести на экран    

public class Task1 {
    public static void run() {
        Random rand = new Random();
        
        List<Integer> intList = new ArrayList<>(10);
        for (int i = 0; i < 10; i++) {
            intList.add(rand.nextInt(15));
        }
        intList.sort();
        System.out.println(intList.toString());
    }
  
}
