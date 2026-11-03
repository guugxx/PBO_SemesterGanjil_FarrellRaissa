public class UserDemo {
    public static void main(String[] args) {
        User user1 = new User("annisa.nadya","annisa.nadya@gmail.com");
        user1.displayInfo()
    }
    public User(String username, String email){
        this.username = username;
        this.email = email;
        this.password = "polinema123"

    }
}