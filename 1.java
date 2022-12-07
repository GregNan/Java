// import java.util.*;

// class Homework {
//     public static void main(String[] args) {
//         System.out.println(alternatingCharacters(10, '!', '-'));
//     }
//     private static String alternatingCharacters (int length, char c1, char c2) {
//         StringBuilder builder = new StringBuilder();
//         for (int i = 0; i < length; i++)
//             if (i % 2 ==0)
//                 builder.append (c1);
//             else
//                 builder.append (c2);
//         return builder.toString();
//     }
// }




// //сжимет строку
// public class les1 {
//     private static String Scetch(String arg){
//         StringBuilder Newstr = new StringBuilder();
//         int count = 1;
//         int i =0;
//         for(i = 0; i < arg.length()-1; i++){
//             if(arg.charAt(i) == arg.charAt(i+1)){
//                 count++;
//             }else {
//                 if(count>1){
//                     Newstr.append(arg.charAt(i));
//                     Newstr.append(count);
//                     count = 1;
//                 }else Newstr.append(arg.charAt(i));
//             }
//         }
//         if(count>1){
//             Newstr.append(arg.charAt(i));
//             Newstr.append(count);
//             count = 1;
//         }else Newstr.append(arg.charAt(i));

//         return Newstr.toString();
//     }
//     public static void main(String[] args) {
//         String s = "aaaabbbcdd";
//         System.out.println(Scetch(s));
//     }
// }




// // определяет палиндром
// public class les2 {
//     public static boolean Polindrom(String str){
//         if(str.equals(new StringBuilder(str).reverse().toString()))
//         return true;
//         else return false;
//     }
//     public static void main(String[] args) {
//         String str = "12321";
//         String str1 = "1224345";
//         System.out.println(Polindrom(str));
//     }
// }






// import java.io.File;
// import java.io.FileOutputStream;
// import java.io.IOException;
// import java.io.FileWriter;
// import java.io.FilenameFilter;
// //строка из 100 символов ТЕСТ и метод, который запишет эту строку в простой текстовый файл
// public class les3 {
//     public static String theOneHandredStr(String str, int number){
//         StringBuilder Newstr = new StringBuilder();
//         for(int index = 0; index < number; index++)
//             Newstr.append(str);
//         return Newstr.toString();
//     }
//     public static void writerTxt(String str){
//     //     File f = new File(pathname: "Txt1.txt");
//     //     try
//     //     {
//     //         FileOutputStream outF = new FileOutputStream(f);
//     //     }
//     // catch(IOException ex)
//     // {System.out.println("Ошибка"+ex);}
//         try(FileWriter writer = new FileWriter("txtre.txt", false))
//         {
        
//             writer.write(str);
//             // writer.append(c: '\n');
//             // writer.append(c: 'E');
//             writer.flush();
//         }
//         catch(IOException ex){
//         }

//     }
//     public static void main(String[] args) {
//     String str = theOneHandredStr("TEST",  100);
//     writerTxt(str);
//     }
// }

// Напишите метод, кот вернёт содержим текущей папки в виде массива строк.
// трай кэтч конструкции
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.Files;
import java.io.File;
import java.io.IOException;

public class les4 {
    private static String[] getCdStrArr(File f) {
        File[] newF = f.listFiles();
        String[] str = new String[newF.length];
        for(int i = 0; i < newF.length; i++)
            str[i] = newF[i].toString();
        return str;

    }
    public static void main(String[] args) {
        File dir = new File( "C:/C#/Java/Hello-world/hello-world");
        String[] grt = getCdStrArr(dir);
        for(int i = 0; i < grt.length; i++)
            System.out.println(grt[i]);
    }
}