import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class UserInformation {
    private String firstName;
    private String lastName;
    private String email;

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void validatingInput(String input, String checkPattern, String option){
        Pattern pattern = Pattern.compile(checkPattern);
        Matcher matcher = pattern.matcher(input);
        if (matcher.matches())
            System.out.println("Entered "+option+ " : " +input+" is valid");
        else
            System.out.println("Entered "+option+ " : " +input+" is invalid");
    }
}

