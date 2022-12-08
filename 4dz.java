// 1. Реализуйте структуру телефонной книги с помощью HashMap, учитывая, что один человек может иметь несколько телефонов.

// import java.util.Map;
// import java.util.Set;
// import java.util.TreeMap;
// import java.util.TreeSet;

// public class PhoneBook {

//     Map<String, String> mapPhoneBook = new TreeMap<>();

//     public void addContact(String phone, String name) {

//         if (phone.matches("[\\d]{11}") && name.matches("[А-Яа-я]+")) {
//             if (mapPhoneBook.containsKey(phone)) {
//                 mapPhoneBook.replace(phone, mapPhoneBook.get(phone), name);
//             } else {
//                 mapPhoneBook.put(phone, name);
//             }
//         }
//     }


//     public String getContactByPhone(String phone) {
//         if (mapPhoneBook.containsKey(phone)) {
//             return mapPhoneBook.get(phone) + " - " + phone;
//         } else {
//             return "";
//         }
//     }


//     public Set<String> getContactByName(String name) {

//         Set<String> setPhoneBook = new TreeSet<>();
//         String namePlusTel = "";
//         if (mapPhoneBook.containsValue(name)) {
//             namePlusTel = namePlusTel.concat(name) + " - ";
//             for (String tel : mapPhoneBook.keySet()) {
//                 if (mapPhoneBook.get(tel).equals(name)) {
//                     namePlusTel = namePlusTel.concat(tel) + ", ";
//                 }
//             }
//             setPhoneBook.add(namePlusTel.substring(0, namePlusTel.length() - 2));
//             return setPhoneBook;
//         } else {
//             return new TreeSet<>();
//         }
//     }

//     public Set<String> getAllContacts() {

//         Set<String> setPhoneBook = new TreeSet<>();

//         for (String key : mapPhoneBook.keySet()) {
//             setPhoneBook.add(mapPhoneBook.get(key) + " - " + key);
//         }
//         return setPhoneBook;
//     }
// }






// 2. Пусть дан список сотрудников: Иван, Пётр, Антон и так далее. Написать программу, 
// которая найдет и выведет повторяющиеся имена с количеством повторений. Отсортировать по убыванию популярности.

// 3. Реализовать алгоритм пирамидальной сортировки (HeapSort).
public class HeapSort
{
    public void sort(int arr[])
    {
        int n = arr.length;

        // Построение кучи (перегруппируем массив)
        for (int i = n / 2 - 1; i >= 0; i--)
            heapify(arr, n, i);

        // Один за другим извлекаем элементы из кучи   
        for (int i=n-1; i>=0; i--)
        {
            // Перемещаем текущий корень в конец
            int temp = arr[0];
            arr[0] = arr[i];
            arr[i] = temp;

            // Вызываем процедуру heapify на уменьшенной куче
            heapify(arr, i, 0);
        }
    }

    // Процедура для преобразования в двоичную кучу поддерева с корневым узлом i, что является
// индексом в arr[]. n - размер кучи
     void heapify(int arr[], int n, int i)
    {
        int largest = i; // Инициализируем наибольший элемент как корень
        int l = 2*i + 1; // левый = 2*i + 1
        int r = 2*i + 2; // правый = 2*i + 2

           // Если левый дочерний элемент больше корня
        if (l < n && arr[l] > arr[largest])
            largest = l;

          // Если правый дочерний элемент больше, чем самый большой элемент на данный момент
        if (r < n && arr[r] > arr[largest])
            largest = r;
       // Если самый большой элемент не корень
        if (largest != i)
        {
            int swap = arr[i];
            arr[i] = arr[largest];
            arr[largest] = swap;

          // Рекурсивно преобразуем в двоичную кучу затронутое поддерево
            heapify(arr, n, largest);
        }
    }

    /* Вспомогательная функция для вывода на экран массива размера n */
    static void printArray(int arr[])
    {
        int n = arr.length;
        for (int i=0; i<n; ++i)
            System.out.print(arr[i]+" ");
        System.out.println();
    }

    // Управляющая программа
    public static void main(String args[])
    {
        int arr[] = {12, 11, 13, 5, 6, 7};
        int n = arr.length;

        HeapSort ob = new HeapSort();
        ob.sort(arr);

        System.out.println("Sorted array is");
        printArray(arr);
    }
}