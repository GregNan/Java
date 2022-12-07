// 1/ import java.util.ArrayList;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;
 
// class Main
// {
//     public static<T> List<T> reverseList(List<T> list)
//     {
//         List<T> reverse = new ArrayList<>(list.size());
 
//         new LinkedList<>(list)
//                 .descendingIterator()
//                 .forEachRemaining(reverse::add);
 
//         return reverse;
//     }
 
//     public static void main(String[] args)
//     {
//         List<Integer> list = Arrays.asList(1, 2, 3, 4, 5);
 
//         List<Integer> reverse = reverseList(list);
//         System.out.println(reverse);
//     }
// }
// 2/ Реализуйте очередь с помощью LinkedList со следующими методами:
// enqueue() - помещает элемент в конец очереди, dequeue() - возвращает первый элемент из очереди и удаляет его, first() - 
// возвращает первый элемент из очереди, не удаляя.
public class Deque
{
    LinkedList _items = new LinkedList();

    public void EnqueueFirst(T value)
    {
        throw new NotImplementedException();
    }

    public void EnqueueLast(T value)
    {
        throw new NotImplementedException();
    }

    public T DequeueFirst()
    {
        throw new NotImplementedException();
    }

    public T DequeueLast()
    {
        throw new NotImplementedException();
    }

    public T PeekFirst()
    {
        throw new NotImplementedException();
    }

    public T PeekLast()
    {
        throw new NotImplementedException();
    }

    public int Count
    {
        get;
    }
}