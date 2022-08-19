import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Manager extends Worker {
    private List<Worker> workerList = null;

    public Manager(String position, String name, Date birthday, Date startDate, List<Worker> workerList) {
        super(position, name, birthday, startDate);
        this.workerList = new ArrayList<>(workerList);
    }

    public void addWorker(Worker worker) {
        if (worker != null) {
            this.workerList.add(worker);
        }
    }

    public void removeWorker(Worker worker) {
        if (workerList.contains(worker)) {
            this.workerList.remove(worker);
        }
    }
}
