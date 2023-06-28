import exceptions.WrongLoginException;
import exceptions.WrongPasswordException;

public class Main {
    public static void Security(String login, String password, String confirmPassword) {
        int maxSymbols = 20;
        if (login.length() > maxSymbols || login.contains("Пароль") || login != "Wizardry_8") {
            throw new WrongLoginException();
        } if (password.length() > maxSymbols || password.contains("Пароль") || password != "Left_4_Dead_2") {
            throw new WrongPasswordException();
        }  if (password.equals(confirmPassword) == false) {
            throw new WrongPasswordException();
        }
    }
    public static void main(String[] args) {
        try {
            Security("Wizardry_8", "Left_4_Dead_2", "Left_4_Dead_2");
        } catch (WrongLoginException e) {
            throw new WrongLoginException();
        } catch (WrongPasswordException e) {
            throw new WrongPasswordException();
        }
    }
}