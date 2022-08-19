import java.util.Date;

public class AnotherWorker extends Worker {
    private String workerDescription = "";

    public AnotherWorker(String position, String name, Date birthday, Date startDate, String workerDescription) {
        super(position, name, birthday, startDate);
        this.workerDescription = workerDescription;
    }

    public String getWorkerDescription() {
        return workerDescription;
    }

    public void setWorkerDescription(String workerDescription) {
        this.workerDescription = workerDescription;
    }
}
