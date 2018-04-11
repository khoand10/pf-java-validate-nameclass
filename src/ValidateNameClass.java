import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ValidateNameClass {
    static boolean validateAccount(String string) {
        Pattern p = Pattern.compile("^[A-Z]+[0-4]{4}[A-Z]+$");
        Matcher m = p.matcher(string);
        return m.matches();
    }

    public static void main(String[] args) {
        String[] names = {"C0123D","pt12301","7a"};
        for (String name : names) {
            System.out.println(name + ": " + validateAccount(name));
        }
    }
}
