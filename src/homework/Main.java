package homework;

public class Main {
    public static void main(String[] args) {
        UserPersister userPersister = new Persister();
        UserReport userReport = new UserReport();
        User user = new User("Bob", userPersister, userReport);
        user.report();
        user.save();
    }
}