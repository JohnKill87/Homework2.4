import exceptions.WrongLoginException;
import exceptions.WrongPasswordException;

public class Main {
    public static void Security(String login, String password, String confirmPassword) throws WrongLoginException, WrongPasswordException {
        int maxSymbols = 20;
        if (login.length() > maxSymbols) {
            throw new WrongLoginException();
        } else if ( login.contains("Пароль!&?./'")) {
            throw new WrongLoginException();
        } else if (!login.contains("ry_8")) {
            throw new WrongLoginException();
        }


        if (password.length() > maxSymbols) {
            throw new WrongPasswordException();
        } else if (password.contains("Пароль!&?./'")) {
            throw new WrongPasswordException();
        } else if (!password.contains("Left_4")) {
            throw new WrongPasswordException();
        }


        if (!password.equals(confirmPassword)) {
            throw new WrongPasswordException();
        }
    }
    public static void main(String[] args) {
        try {
            Security("Wizard_ry_8", "Left_4_Dead_2", "Left_4_Dead_2");
        } catch (WrongLoginException | WrongPasswordException e) {
            throw new RuntimeException(e);
        }
    }
}