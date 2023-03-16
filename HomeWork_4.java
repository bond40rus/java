import java.util.Scanner;
import java.util.ArrayList;
import java.util.List;
 
public class HomeWork_4 {

    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        int mesto = 0;
        boolean exi = true;

        while (exi) {
            Scanner sc = new Scanner(System.in);
            String s = sc.nextLine();
            String [] split = s.split("~"); 
            //System.out.println(Arrays.toString(split));
            String str = split[0];
            int num = Integer.parseInt(split[1]);

            // try{  почему - то не получается  трай сделать так как если вписываю То потом  не видит переменнюу нам
            //     int num = Integer.parseInt(split[1]);
                
            // } catch (Exception e){
            //     System.out.println("Не число");
            //     break;

            // }
            if(str == "exit"){
                exi = false;
            }

            if(str == "string"){
                mesto = num;

            }

            switch (str) {
                case "string":
                    mesto = num;
                    sizeArr(list, num);
                    System.out.println(list);  
                    break;

                case "num":
                    setArr(list, mesto, num);
                    System.out.println(list);
                    break;
                case "print":
                    prntArr(list, num);
                    break;
                case "my_value":
                    System.out.println(mesto);
                    break;

            }
        }   
    }

    public static void sizeArr(List ls,int sz) {
        while (ls.size() < sz){
            ls.add(null);
        }  
    }

    public static void setArr(List ls,int m, int val) {
        try{
            ls.set(m-1, val);  // -1 для удобства пользователя

        } catch (Exception e){
            System.out.println("Нет Индекса");
        }  
    }

    public static void prntArr(List ls,int val) {
        try{
            System.out.println(ls.get(val-1)); // -1 для удобства пользователя
        } catch (Exception e){
            System.out.println("Нет Индекса");
        }
    }
}

