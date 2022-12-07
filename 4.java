import java.util.*;

// class MergeSort {
//     public static void main(String[] args) {
//         int[] numbers = new int[] { 5, 1, 2, 3, 7, 0, 9, 3, 8, 7};
//         int[] sorted = mergeSort (numbers, 0, numbers.length - 1);
//         System.out.println(Arrays.toString (sorted));
//     }

//     private static int[] mergeSort (int[] numbers, int begin, int end) {
//         if (begin == end)
//             return new int[] { numbers[begin]};
//         int mid = (begin + end) / 2;
//         int[] left = mergeSort (numbers, begin, mid);
//         int[] right = mergeSort (numbers, mid + 1, end);

//         int[] result = new int[end - begin +1];

//         int leftIndex = 0;
//         int rightIndex = 0;
//         for (int resultIndex = 0; resultIndex < result.length; resultIndex++) {
//             if (leftIndex >= left.length)
//             {
//                 result[resultIndex] = right[rightIndex];
//                 rightIndex++;
//             }
//             else if (rightIndex >= right.length)
//             {
//                 result[resultIndex] = left[leftIndex];
//                 leftIndex++;

//             }
//             else if (left[leftIndex] < right[rightIndex]) {
//                 result[resultIndex] = left[leftIndex];
//                 leftIndex++;
//             }
//             else{
//                 result[resultIndex] = right[rightIndex];
//                 rightIndex++;

//             }
//         }
//         return result;
//     }
// }


import java.util.ArrayList;
import java.util.LinkedList;


// public class ListTime {
//     public static void main(String[] args) {
//         long start = System.nanoTime();

//         int repeat = 10_000;

//         ArrayList<Integer> arrayList = new ArrayList<Integer> ();
//         for (int i = 0; i < repeat; i++)
//             arrayList.add (i);
//         long middle = System.nanoTime ();

//         LinkedList<Integer> linkedList = new LinkedList<> ();
//         for (int i = 0; i < repeat; i++)
//             linkedList.add (i);
//         long end = System.nanoTime ();

//         System.out.printf("ArrayList: %f, LinkedList: %f", (middle - start) / 1e+9, (end - middle) / 1e+9);
//     }
// } 
import java.util.LinkedList;
import java.util.Scanner;
// разделить строку по знаку 
// public class main {
//     public static void main(String[] args) {
//         Scanner scanner = new Scanner(System.in);
//         LinkedList<String> strings = new LinkedList<>();
//         while(true){
//             System.out.printf("vved text~index, ind <= %d", strings.size());
//             System.out.println();
            
//             String userInput = scanner.nextLine();
//             if(userInput.equals("quit")) return;
//             String[] parts = userInput.split("~");
//             if(parts.length != 2) throw new IllegalStateException("Wrong text");
//             if (parts[0].equals("print")) {
//                 System.out.println(strings.get(Integer.parseInt(parts[1])));
//                 strings.remove(Integer.parseInt(parts[1]));
//             } else {
//                 strings.add(Integer.parseInt(parts[1]), parts[0]);
//             }
//             System.out.println(strings);
    
//         }
//     }
// }

// // Реализовать консольное приложение, котор принимает от пользователя и "запоминает" строки.
// усли введено принт, выводит строки так, чтобы последняя была в списке, а первая последней.
// если реверт удаляет предыдущую введеную строку из памяти.

import java.utill.ArrayDeque;
import java.utill.Deque;
import java.utill.linkedList;
import java.util.Scanner;

public class task2 {
    public static void main(String[] args) {
        System.setProperty("console.encoding", "cp866");
        Scanner scanner = new Scanner(System.in, "cp866");
        ArrayDeque<String> lst = new ArrayDeque<>();

        while(true) {
            System.out.println("vved znach elem");
            String input = scanner.nextLine();
            if (input.equals("print"))
                break;
            
            if (input.equals("print")) {
                if (lst.size() > 1) {
                    String first = lst.pollFirst();
                    String last = lst.pollLast();

                    lst.addFirst(last);
                    lst.addLast(first);
                } else {
                    System.out.println("Razmer spiska mal dly operacii");
                }
            } else if (input.equals("revert")) {
                lst.pollLast();
            } else {
                lst.addLast(input);
            }
            System.out.println(lst);
        }
        scanner.close();
    }
}






