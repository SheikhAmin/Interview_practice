import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class WriteDataIntoTextFile {
    public static void main(String[] args) throws IOException {
        FileWriter fw = new FileWriter("G:\\file1.txt");
        BufferedWriter bw = new BufferedWriter(fw);

        bw.write("hello! World");
        System.out.println("Finished!!!!!!!!");
        bw.close();
    }
}
