//список с названием планет в произв. вывестиназвание каждой и количество повторений
// public class Task2 {
//     public static void run() {
//         String[] planetsName = new String[] {"Земля", "Merc", "Venera", "Mars", "Upiter", "Saturn", 
//         "Neptun"};
//         Random rand = new Random();
//         ArrayList<String> repeatPlanetName = new ArrayList<>(10);
//         for (int i = 0; i < 10; i++) {
//         repeatPlanetsName.add(planetsName[rand.nextInt(6)]);
//         }
//     System.out.println(repeatPlanetsName.toString());

    
//     }
// }
//создать список. поместить в него строки, так и целые числа. пройти и удалить целые числа.
public class Task3 {
    public static void run() {
        ArrayList<String> strList = new ArrayList<String>();
        strList.add("lorem");
        strList.add("lorem");
        strList.add("lorem");
        strList.add("lorem");
        strList.add("500");
        strList.add(500);

        for (int i=0; i < strList.size(); i++){
            if(strList.get(i) instanceof Integer) 
            {
                strList.remove(i);
                i--;
            }
        }

        System.out.println(strList);
    }
}