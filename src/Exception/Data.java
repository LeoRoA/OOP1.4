package Exception;

public class Data {
    public static void main(String[] args) {
        System.out.println(checkValidation("login", "password", "password"));
        System.out.println(checkValidation("log!n_", "passworD_", "passworD_"));
        System.out.println(checkValidation("LOGIN", "password!", "password"));
    }

    public static boolean checkValidation(String login, String password, String confirmPassword) {
        try {
            return CheckLogPass.checkLogPass(login, password, confirmPassword);
        } catch (WrongLoginException e) {
            System.out.println("Ошибка в логине: " + e.getMessage());
            return false;
        } catch (WrongPasswordException e) {
            System.out.println("Ошибка в пароле: " + e.getMessage());
            return false;
        }
    }
}
