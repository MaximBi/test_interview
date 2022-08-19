import java.util.Date;

public class Worker {
    private String position;
    private final String name;
    private final Date birthday;
    private final Date startDate;

    public Worker(String position, String name, Date birthday, Date startDate) {
        this.position = position;
        this.name = name;
        this.birthday = birthday;
        this.startDate = startDate;
    }

    public void setPosition(String position) {
        this.position = position;
    }

    public String getPosition() {
        return position;
    }

    public String getName() {
        return name;
    }

    public Date getBirthday() {
        return birthday;
    }

    public Date getStartDate() {
        return startDate;
    }

    @Override
    public String toString() {
        return this.position + " " + this.name  + " " + this.startDate;
    }
}

