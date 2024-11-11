package az.turing.bookapp.util;

import java.util.Scanner;

public class InputUtil {

    public String getString(String title) {
        Scanner sc = new Scanner(System.in);
        System.out.println(title + ":");
        return sc.nextLine();
    }

    public Integer getInteger(String title) {
        Scanner sc = new Scanner(System.in);
        System.out.println(title + ":");
        return sc.nextInt();
    }

    public Double getDouble(String title) {
        Scanner sc = new Scanner(System.in);
        System.out.println(title + ":");
        return sc.nextDouble();
    }
}
