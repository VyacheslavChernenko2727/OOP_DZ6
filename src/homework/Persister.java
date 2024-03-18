//package homework;
//
//public class Persister{
//    private final User user;
//
//    public Persister(User user){
//        this.user = user;
//    }
//
//    public void save(){
//        System.out.println("Save user: " + user.getName());
//    }
//}

package homework;



public class Persister implements UserPersister {
    @Override
    public void save(User user) {
        System.out.println("Save user: " + user.getName());
    }
}