public class UserRegistration {

    UserInformation storePattern =new UserInformation();
    public void validateFirstName(String firstName){
        storePattern.setFirstName("^[A-Z]{1}[a-z]{3,}$");
        String first= storePattern.getFirstName();
        storePattern.validatingInput(firstName,first,"FirstName");
    }
    public void validateLastName(String lastName){
        storePattern.setLastName("^[A-Z]{1}[a-z]{3,}$");
        String last= storePattern.getLastName();
        storePattern.validatingInput(lastName,last,"LastName");
    }

    public void validateEmail(String email){
        storePattern.setEmail("^[a-z]{3,}(.[a-z]{3,})*@[a-z]{2,}.[a-z]{2,3}([.+_-][a-z]{2})*$");
        String mail= storePattern.getEmail();
        storePattern.validatingInput(email,mail,"Email");
    }
}