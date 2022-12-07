package com.example;

import java.util.Arrays;

// import java.util.Date;
// import java.time.LocalDate;
// import java.time.LocalDateTime;
// import java.time.format.DateTimeFormatter;;
// public class app 
// {
//     public static void main( String[] args )
//     {
//         System.out.println( "hello world");
//         LocalDateTime now = LocalDateTime.now();
//         DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd.MM.yyyy");
//         System.out.println(now.format(formatter));
//     }
    
// }

public class app 
{
    public static void main( String[] args )
    {
        int[] numbers = new int[] {1,1,1,0,1,0,1,1,1,1,1};
        System.out.println(Arrays.toString(numbers));

        int counter = 0, max = 0;
        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] == 1)
                counter++;
            else {
                if (counter > max)
                    max = counter;
                counter = 0;

            }
        }
        if (counter > max)
            max = counter;
        System.out.println(counter);
    }    
}
