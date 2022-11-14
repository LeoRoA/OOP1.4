package Exception;

public class CheckLogPass {


    public static boolean checkLogPass(String login, String password, String confirmPassword) {
        boolean checkLogin = isValidLength(login, 1, 20) && isValidData(login);
        if (!checkLogin) {
            throw new WrongLoginException("Неправильный логин");
        }

        boolean checkPass = isValidLength(password, 1, 20) && isValidData(password);
        if (!checkPass) {
            throw new WrongPasswordException("Неправильный пароль");
        }

        if (!password.equals(confirmPassword)) {
            throw new WrongLoginException("Пароли не совпадают");
        }
        return true;
    }

    public static boolean isValidLength(String value, int min, int max) {
        return (value.length() <= max) && (value.length() >= min);
    }

    public static boolean isValidData(String value) {
        for (char c : value.toCharArray()) {
            if (c >= 'a' && c <= 'z' ||
                    c >= 'A' && c <= 'Z' ||
                    c >= '0' && c <= '9' ||
                    c == '_') {
                continue;
            } else {
                return false;
            }
        }
        return true;
    }

    @Override
    public boolean equals(Object obj) {
        return super.equals(obj);
    }
}
