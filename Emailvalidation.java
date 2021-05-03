import java.util.regex.*;

public class EmailPattern {
    public static void main (String[] args) {
        boolean uc1 = Pattern.compile("^[a-z 0-9]{0,25}").matcher("akashshevgan11").matches();
        System.out.println ("UseCase 1 is " + uc1);
        boolean uc2 = Pattern.compile("^@[a-z]{0,20}").matcher("@gmail").matches();
        System.out.println ("UseCase 2 is " + uc2);
        boolean uc3 = Pattern.compile("^.[a-z]{2,3}").matcher(".com").matches();
        System.out.println ("UseCase 3 is " + uc3);
        boolean uc4 = Pattern.compile("^[a-z 0-9]{0,30} *(.[a-z]{0,30})").matcher("akashshevgan11@gmail.duplicate").matches();
        System.out.println ("UseCase 4 is " + uc4);
        boolean uc5 = Pattern.compile("^.[a-z]{2,3} *(.[a-z]{2})").matcher(".co.in").matches();
        System.out.println ("UseCase 5 is " + uc5);
        boolean uc6 = Pattern.compile("(^[a-z 0-9]{0,30} *([.+/-]?[a-z 0-9]{1,20})@[a-z]{1,20}.([a-z]{2,3} *(.[a-z]{2,3}))$)")
                .matcher("akashshevgan11@gmail.co.in").matches();
        System.out.println ("UseCase 6 is " + uc6);
    }
}
