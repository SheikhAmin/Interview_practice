import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class ReadDataFromTextFile {
    public static void main(String[] args) throws IOException {
        //approach1 using filereader
        FileReader fr = new FileReader("G:\\file.txt");
        BufferedReader br = new BufferedReader(fr);
        String str;
        while ((str = br.readLine())!= null){
            System.out.println(str);
        }
        br.close();
        // approach 2
        File file = new File("G:\\file.txt");
        Scanner sc = new Scanner(file);
        while (sc.hasNextLine()){
            System.out.println(sc.nextLine());
        }
    }
}
