import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Homework_5 {
/**
 * Есть тест. Нужно извлечь из него все слова и отсортировать по длине.
 * Мороз и солнце день чудесный Еще ты дремлешь друг прелестный Пора красавица проснись
 *
 * и
 * ты
 * Еще
 * день друг Пора
 */
//static void collectStats(String text) {
// Map<Integer, List<String>> stats = new HashMap<>();

    public static void main(String[] args) {

        collectStats("Мороз и солнце день чудесный Еще ты дремлешь друг прелестный Пора красавица проснись");
    }
    static void collectStats(String text) {
        String [] spl = text.split(" ");
        System.out.println(Arrays.toString(spl));
        Map<Integer, List<String>> stats = new HashMap<>();

        for (int i = 0; i < spl.length; i++){
            int len = spl[i].length();

            stats.computeIfAbsent(len, k -> new ArrayList<>()).add(spl[i]); // лямда
        }

        //System.out.println(stats);
        for (Integer key: stats.keySet()){
            System.out.println(key +" = "+stats.get(key));
        }

    }   
}
