import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class App {
    public static void main(String[] args) throws Exception {

        String[] lines = new String[] { "Good morning", "Good afternoom", "Good evening" };
        String path = "d:\\out.txt"; // caminho do arquivo

        try (BufferedWriter bw = new BufferedWriter(new FileWriter(path, true))) { // true = append lines
            for (String line : lines) {
                bw.write(line);
                bw.newLine();
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }// main
}// class
