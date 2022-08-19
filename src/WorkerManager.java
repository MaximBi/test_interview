import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class WorkerManager {

    private final int EXIT_OPERATION = 4;
    List<Worker> listWorker = new ArrayList<>();

    public void startManaging() {
        int opNumber = 0;
        while(opNumber != EXIT_OPERATION) {
            opNumber = printMenu();
            switch (opNumber) {
                case 1:
                    WorkerCreater wc = new WorkerCreater();
                    Worker worker = wc.create("../Data/workers.txt");

                    break;
                case 2:

                    break;
                case 3:

                    break;
                case 4:

                    break;
                default:

            }
        }
    }

    private int printMenu(){
        Scanner in = new Scanner(System.in);

        System.out.println("Choose next operation:");
        System.out.println("1. Create worker");
        System.out.println("2. Create manager");
        System.out.println("3. Create another worker");
        System.out.println("4. Exit the system");

        return in.nextInt();
    }
}
