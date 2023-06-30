import exceptions.WrongLoginException;
import exceptions.WrongPasswordException;

public class Main {
    public static void Security(String login, String password, String confirmPassword) throws WrongLoginException, WrongPasswordException {
        int maxSymbols = 20;
        String validCharacters ="^[a-zA-Z0-9-_]+$";
        if (login.length() > maxSymbols) {
            throw new WrongLoginException();
        } else if (!login.matches(validCharacters)){
            throw new WrongLoginException();
        }


        if (password.length() > maxSymbols) {
            throw new WrongPasswordException();
        } else if (!password.matches(validCharacters)) {
            throw new WrongPasswordException();
        }


        if (!password.equals(confirmPassword)) {
            throw new WrongPasswordException();
        }
    }
    public static void main(String[] args) {
        try {
            Security("Wizardry_8", "Left_4_Dead_2", "Left_4_Dead_2");
        } catch (WrongLoginException | WrongPasswordException e) {
            throw new RuntimeException(e);
        }
    }
}