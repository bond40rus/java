import java.nio.file.Path;
import java.nio.file.StandardOpenOption;
//mport java.io.File;
import java.io.IOException;
import java.nio.file.Files;


public class homework_2 {

    public static void main(String[] args) throws IOException{
        System.out.println(buildString(6, 'a', 'b'));


        Path of = Path.of("files" ,"file.txt");
        if (Files.exists(of) != true){
            Files.createFile(of);
        }
        String t = " - text\n";
        for (int i = 0; i < 10; i ++){
            Files.writeString(of, i+1 + t, StandardOpenOption.APPEND);
        }
        
    }
        
    

    public static String buildString(int n, char c1, char c2) {
        // возвращает длину строки n  которая состоит из чередующихся символов с1 и с2 начиная с с1
        String result = "";
        
        if (n % 2 != 0){
            n++;
        }
        for(int i = 0; i < n; i++ ){
            result = result + c1 +c2;
        }
        return result;

    }
    
}
