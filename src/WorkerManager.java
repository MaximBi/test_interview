import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class WorkerManager {

    List<Worker> listWorker = new ArrayList<>();

    public void startManaging() {
        int opNumber = 0;
        int EXIT_OPERATION = 4;
        while(opNumber != EXIT_OPERATION) {
            opNumber = printMenu();
            switch (opNumber) {
                case 1:
                    WorkerCreater wc = new WorkerCreater();
                    Worker worker = wc.create("C:\\Users\\Maxim\\IdeaProjects\\untitled\\Data\\workers.txt");
                    listWorker.add(worker);
                    break;
                case 2:
                    ManagerCreater mc = new ManagerCreater();
                    Manager manager = mc.create("C:\\Users\\Maxim\\IdeaProjects\\untitled\\Data\\manager.txt");
                    listWorker.add(manager);
                    break;
                case 3:
                    AnotherWorkerCreator awc = new AnotherWorkerCreator();
                    AnotherWorker anotherWorker = awc.create("C:\\Users\\Maxim\\IdeaProjects\\untitled\\Data\\another_worker.txt");
                    listWorker.add(anotherWorker);
                    break;
                case 4:
                    System.out.println("Does not work yet");
                    //todo: delete employee
                    break;
                case 5:
                    System.out.println("Does not work yet");
                    //todo: change type of employee
                    break;
                case 6:
                    System.out.println("Does not work yet");
                    //todo: refer employee to manager
                    break;
                case 7:
                    System.out.println("Does not work yet");
                    //todo: order employee by name
                    break;
                case 8:
                    System.out.println("Does not work yet");
                    //todo: order employee by startDate
                    break;
                default:
                    System.out.println("The option " + opNumber + " does not exist. Please try it again.");
            }
        }
    }

    private int printMenu(){
        Scanner in = new Scanner(System.in);

        System.out.println("Choose next operation:");
        System.out.println("1. Create employee");
        System.out.println("2. Create manager");
        System.out.println("3. Create another employee");
        System.out.println("4. Remove employee");
        System.out.println("5. Change type of employee");
        System.out.println("6. Refer employee to manager");
        System.out.println("7. Order employee by name");
        System.out.println("8. Order employee by startDate");
        System.out.println("9. Exit the system");

        return in.nextInt();
    }
}
