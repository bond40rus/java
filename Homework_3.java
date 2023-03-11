import java.util.ArrayList;
//import java.util.Arrays;
import java.util.Random;
import java.util.List;

public class Homework_3 {

    public static void main(String[] args) {
        
        // Дан список ArrayList<Integer> целых чисел. Удалить из него нечетные числа.
        ArrayList<Integer> arr = RandomArray(10);
        System.out.println(arr);
        int i = 0;
        while(i < arr.size()){
            if (arr.get(i) % 2 != 0 || arr.get(i) == 0){
                arr.remove(i);
            }
            else{
                i++;
            }
        }
        System.out.println(arr);
        System.out.println();

        // Дан список ArrayList<String>. Удалить из него все строки, которые являются числами 
        // Пример: ArrayList<String> list = new ArrayList<>(List.of("string", "s", "5", "10", "-12", "my_value")); ["string", "s", "my_value"]
        
        ArrayList<String> list = new ArrayList<>(List.of("string", "s", "5", "10", "-12", "my_value"));
        System.out.println(list);
        int k = 0;
        while (k < list.size()){
            if (isNum(list.get(k))){
                list.remove(k);
            } else {
                k++;
            }  
        }
        System.out.println(list);
        }



    private static  ArrayList<Integer> RandomArray(int lenArray){
        ArrayList<Integer> list = new ArrayList<>();
        Random rnd = new Random();
        for (int i = 0; i < lenArray; i++)
        {
            list.add(rnd.nextInt(20 ));
        }
       return list;
    }


    private static boolean isNum(String st){
        try{
            Double.parseDouble(st);
            return true; 
        } catch (Exception e){
            return false;
        }
    }
}

