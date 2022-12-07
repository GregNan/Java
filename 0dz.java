import java.io.BufferedReader;
import java.lang.reflect.Array;
import java.util.Arrays;

// 1. Вычислить n-ое треугольного число(сумма чисел от 1 до n), n! (произведение чисел от 1 до n)

import java.util.Scanner;
// public class CalcNaturalNumbers {
//     public static void main(String[] args) {
//         Scanner scanner = new Scanner(System.in);
//         System.out.print("Введите число n: ");
//         int n = scanner.nextInt();
//         long sumN = 0;
//         for (int i = 1; i <= n; i++) {
//             sumN = sumN + i;
//         }
//         System.out.println("Сумма первых n натуральных чисел: " + sumN);
//     }
// }

// 2. Вывести все простые числа от 1 до 1000
// public class StupidTask {
 
//     public static void main(String[] args) {
//         for (int i = 1; i <= 100; i++) {
//             System.out.printf("%3d", i);
//         }
//     }
// }

// 3. Реализовать простой калькулятор
import java.util.Scanner;
public class Calculator {
   public static void main(String[] args) {
      double num1;
      double num2;
      double ans;
      char op;
      Scanner reader = new Scanner(System.in);
      System.out.print("Enter two numbers: ");
      num1 = reader.nextDouble();
      num2 = reader.nextDouble();
      System.out.print("\nEnter an operator (+, -, *, /): ");
      op = reader.next().charAt(0);
      switch(op) {
         case '+': ans = num1 + num2;
            break;
         case '-': ans = num1 - num2;
            break;
         case '*': ans = num1 * num2;
            break;
         case '/': ans = num1 / num2;
            break;
         default:  System.out.printf("Error! Enter correct operator");
            return;
      }
      System.out.print("\nThe result is given as follows:\n");
      System.out.printf(num1 + " " + op + " " + num2 + " = " + ans);
   }
}
// 4. *+Задано уравнение вида q + w = e, q, w, e >= 0. Некоторые цифры могут быть заменены знаком вопроса, например 1? + ?5 = 69. Требуется восстановить выражение до верного равенства. Предложить хотя бы одно решение или сообщить, что его нет.
