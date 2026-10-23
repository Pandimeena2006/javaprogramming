import java.util.*;
public class string{
    public static void main(String[]args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the string:");
        String str2 = sc.nextLine();
        String name = sc.next();
        System.out.println("welcome" + name);
        System.out.println("length:" + name.length());
        System.out.println("uppercase:" + str2.toUpperCase());
        System.out.println("check=:" + name.equals(str2));
    }

    }
