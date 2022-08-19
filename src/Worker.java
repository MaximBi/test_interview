import java.util.Date;

public class Worker {
    private String position;
    private String name;
    private Date birthday;
    private Date startDate;

    public Worker(String position, String name, Date birthday, Date startDate) {
        this.position = position;
        this.name = name;
        this.birthday = birthday;
        this.startDate = startDate;
    }

    public void setPosition(String position) {
        this.position = position;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setBirthday(Date birthday) {
        this.birthday = birthday;
    }

    public void setStartDate(Date startDate) {
        this.startDate = startDate;
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
}

