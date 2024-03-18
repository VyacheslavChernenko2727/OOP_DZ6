package homework;

public class User {
    private final String name;
    private final UserPersister userPersister;
    private final UserReport userReport;

    public User(String name, UserPersister userPersister, UserReport userReport) {
        this.name = name;
        this.userPersister = userPersister;
        this.userReport = userReport;
    }

    public String getName() {
        return name;
    }

    public void save() {
        userPersister.save(this);
    }

    public void report() {
        userReport.report(this);
    }
}
