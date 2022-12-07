// 1.Реализовать алгоритм сортировки слиянием.
// import java.util.Arrays;

// public class Main {
//     public static int[] mergeSort(int[] sortArr) {
//         int[] buffer1 = Arrays.copyOf(sortArr, sortArr.length);
//         int[] buffer2 = new int[sortArr.length];
//         int[] result = mergeSortInner(buffer1, buffer2, 0, sortArr.length);
//         return result;
//     }

//     public static int[] mergeSortInner(int[] buffer1, int[] buffer2, int startIndex, int endIndex) {
//         if (startIndex >= endIndex - 1) {
//             return buffer1;
//         }

//         //уже отсортирован
//         int middle = startIndex + (endIndex - startIndex) / 2;
//         int[] sorted1 = mergeSortInner(buffer1, buffer2, startIndex, middle);
//         int[] sorted2 = mergeSortInner(buffer1, buffer2, middle, endIndex);

//         //слияние
//         int index1 = startIndex;
//         int index2 = middle;
//         int destIndex = startIndex;
//         int[] result = sorted1 == buffer1 ? buffer2 : buffer1;
//         while (index1 < middle && index2 < endIndex) {
//             result[destIndex++] = sorted1[index1] < sorted2[index2]
//                     ? sorted1[index1++] : sorted2[index2++];
//         }
//         while (index1 < middle) {
//             result[destIndex++] = sorted1[index1++];
//         }
//         while (index2 < endIndex) {
//             result[destIndex++] = sorted2[index2++];
//         }
//         return result;
//     }
//     public static void main(String args[]) {
//         int[] sortArr = {12, 6, 4, 1, 15, 10};
//         int[] result = mergeSort(sortArr);
//         System.out.println(Arrays.toString(result));
//     }
// }

// 2.import java.util.Arrays;
// import java.util.Random;
// import java.util.Scanner;
 
// public class Task010 {
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         int n;
//         do {
//             System.out.print("Введите длинну массива (n >= 2): ");
//             n = sc.nextInt();
//         } while (n < 2);
//         int[] array = createRandomArray(n, 1, 9);
 
//         System.out.println("Дан массив: " + Arrays.toString(array));
 
//         int[] arrayZero = evenElementsMakeZero(Arrays.copyOf(array, array.length));
//         System.out.println("Обнуляем чётные элементы: " + Arrays.toString(arrayZero));
 
//         int[] arrayDelete = deleteEvenElement(Arrays.copyOf(array, array.length));
//         System.out.println("Удаляем чётные элементы массива: " + Arrays.toString(arrayDelete));
//     }
 
//     //СОЗДАЁМ МАССИВ ЗАДАННОЙ ДЛИННЫ И ЗАПОЛНЯЕМ СЛУЧАЙНЫМИ ЧИСЛАМИ ОТ MIN ДО MAX (ВКЛЮЧИТЕЛЬНО)
//     public static int[] createRandomArray(int length, int min, int max) {
//         int[] result = length > 0 ? new int[length] : new int[0];
//         if (length > 0) {
//             Random rand = new Random();
//             for (int index = 0; index < length; index++) {
//                 result[index] = rand.nextInt(Math.abs(max - min) + 1) + min;
//             }
//         }
//         return result;
//     }
 
//     public static int[] evenElementsMakeZero(int[] array) {
//         int index = 0;
//         while (index < array.length) {
//             array[index] = 0;
//             index += 2;
//         }
//         return array;
//     }
 
//     public static int[] deleteEvenElement(int[] array) {
//         int[] result = new int[array.length / 2];
//         int index = 1;
//         for (int i = 0; i < result.length; i++) {
//             result[i] = array[index];
//             index += 2;
//         }
//         return result;
//     }
// }
// 3.Задан целочисленный список ArrayList. Найти минимальное, максимальное и среднее арифметичское этого списка.
// class MinMaxExample { 
 
//     public static void main(String args[]){
//       int array[] = new int[]{10, 2, 28, 120};
   
//       // Вызов метода getMax () для получения максимального значения
//       int max = getMax(array);
//       System.out.println("Maximum Value is: "+max);
   
//       // Вызов метода getMin () для получения минимального значения
//       int min = getMin(array);
//       System.out.println("Minimum Value is: "+min);

//       int med = getMed(array);
//       System.out.println("Medium Value is: "+med);
//     }

//     public static int getMed(int[] inputArray){ 
//         int MedValue = 0;
//         int maxValue = 0; 
//         for(int i=0;i < inputArray.length;i++){ 
//             MedValue +=inputArray[i]; 
          
//         } 
//         maxValue = MedValue / inputArray.length; 
//         return maxValue; 
//       }
   
//     //здесь находим максимум
//     public static int getMax(int[] inputArray){ 
//       int maxValue = inputArray[0]; 
//       for(int i=1;i < inputArray.length;i++){ if(inputArray[i] > maxValue){ 
//            maxValue = inputArray[i]; 
//         } 
//       } 
//       return maxValue; 
//     }
   
//     // здесь находим минимум
//     public static int getMin(int[] inputArray){ 
//       int minValue = inputArray[0]; 
//       for(int i=1;i<inputArray.length;i++){ 
//         if(inputArray[i] < minValue){ 
//           minValue = inputArray[i]; 
//         } 
//       } 
//       return minValue; 
//     } 
//   }











