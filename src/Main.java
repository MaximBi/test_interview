import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args){
        List<Worker> workerList = new ArrayList<>();

        String fileName = "workers.txt";
        try (BufferedReader br = new BufferedReader(new FileReader(fileName))){
            String line = "";
            while((line = br.readLine()) != null) {

            }

        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}