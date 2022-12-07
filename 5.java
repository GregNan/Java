import java.util.HashMap;
import java.util.Map;
// public class maiqn {
//     /**
//      * @param args
//      */
//     public static void main(String[] args) {
//         HashMap<Integer, String> lastNameByPassport = new HashMap<> ();
//         lastNameByPassport.put (123456, "Ivanov");
//         lastNameByPassport.put (321456, "Vasilyev");
//         lastNameByPassport.put (234561, "Petrov");
//         lastNameByPassport.put (234432, "Ivanov");

//         // String lastName = lastNameByPassport.get (123456);
//         // System.out.println(lastName);
        
//         System.out.println(lastNameByPassport);

//         for (Map.Entry<Integer, String> entry : lastNameByPassport.entrySet())
//             if (entry.getValue().equals("Ivanov"))
//                 System.out.println(entry);
//     }
    
// }
import java.util.*;

// public class task1 {
//     public static void main(String[] args) {
//         Scanner scanner = new Scanner(System.in);
//         System.out.println("vhodnaya stroka");
//         String strIn = scanner.nextLine();
//         System.out.println("vyhodnaya stroka");
//         String strOut = scanner.nextLine();
        
//         if (strIn.length() != strOut.length()){
//             throw new IllegalStateException("dlina strok ne ravna");
//         }

//         // Map<Character, Character> encoding = new HashMap<>();
//         // for(int i=0; i<strIn.length(); i++) {
//         //     encoding.put(strIn.charAt(i), strOut.charAt(i));
//         // }
//         System.out.println(isIsomorphic(strIn, strOut));
        
//         scanner.close();
//     }

//     public static boolean isIsomorphic(String strIn, String strOut) {
//         if (strIn.length() != strOut.length()) {
//             return false;
//         }
//         Map<Character, Character> encoding = new HashMap<>();
//         for(int i=0; i<strIn.length(); i++){
//             if (encoding.containsKey(strIn.charAt(i))) {
//                 if (!encoding.get(strIn.charAt(i)).equals( strOut.charAt(i)))
//                     return false;
//             } else {
//                 encoding.put(strIn.charAt(i), strOut.charAt(i));
//             }

//         }
//         return true;
//     }
// }
//задача на расстановку строк верно/неверно
import java.util.*;

public class task1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("vhodnaya stroka");
        String strIn = scanner.nextLine();

        Map<Character, Character> brackets = new HashMap<>();
        brackets.put('[', ']');
        brackets.put('<', '>');
        brackets.put('(', ')');
        brackets.put('{', '}');
        
        

        System.out.println(checkBrackets(strIn, brackets));

        scanner.close();
    }

    public static boolean checkBrackets(String strIn, Map<Character, Character> brackets) {
        Deque<Character> stack = new ArrayDeque<>();
        for (int i = 0; i < strIn.length(); i++) {
            if (brackets.containsKey(strIn.charAt(i))) {
                stack.add(strIn.charAt(i));
            }
            else if (brackets.containsValue(strIn.charAt(i))) {
                if (stack.isEmpty())
                    return false;
                char openingBracket = stack.pollLast();
                if (strIn.charAt(i) != brackets.get(openingBracket)) {
                    return false;
                }
            }
        }
        if (stack.isEmpty());
            return true;
        return false;
    }
}





