import java.util.*;

public class UserRegistrationMain {

    public static void main(String[] args) {
        System.out.println("Welcome to User Registration using regex program");
        UserRegistration validate= new UserRegistration();
        Scanner scanner = new Scanner(System.in);
        String firstName = scanner.next();
        validate.checkFirstName(firstName);
    }
}