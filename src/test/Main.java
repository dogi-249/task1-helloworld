package test;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        System.out.println("'a'か'b'を入力してください。");

        Scanner scanner = new Scanner(System.in);
        String str = scanner.next();

        if (str.equals("a")) {
            System.out.println("Hello World!");
        }
        else if (str.equals("b")) {
            for (int i = 1; i <= 11; i++) {
                if (i < 11) {
                    System.out.println(i + "回目：" + "Hello world!");
                } else {
                    System.out.println(i + "回目：" + "Hello!");
                }
            }
        }
    }
}
