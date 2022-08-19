import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class WorkerCreater {
    public Worker create(String path) {
        String[] workerDate = extractWorkerData(path);
        if(workerDate.length == 3) {
            return new Worker(
                    "Worker",
                    workerDate[0],
                    stringToDateConverter(workerDate[1]),
                    stringToDateConverter(workerDate[2])
            );
        }
        return null;
    }

    private Date stringToDateConverter (String date) {
        SimpleDateFormat formatter = new SimpleDateFormat("dd.MM.yyyy");
        try {
            return formatter.parse(date);
        } catch (ParseException e) {
            throw new RuntimeException(e);
        }
    }

    private String[] extractWorkerData(String path) {
        String[] workerData = null;
        try (BufferedReader br = new BufferedReader(new FileReader(path))) {
            String line = br.readLine();
            workerData = line.split(" ");
        } catch (IOException e) {
            e.printStackTrace();
        }
        return workerData;
    }
}