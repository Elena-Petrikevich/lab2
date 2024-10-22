import java.util.regex.*;
import java.util.Scanner;
public class lab2 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Введите строку с щестнадцатиричным идентификатором цвета в HTML.");
        String s =sc.nextLine();
        String regex = "()#(\\w{6})" ;
        Pattern p = Pattern. compile (regex);
        Matcher m = p.matcher(s);
        while (m.find()) {
            System.out.println("Идентификатор цвета: " + m.group());

        }
    }
}
