package test.program9;

import java.util.Scanner;

public class Mondai1 {
    public static void main(String[] args) {
        Scanner stdIn = new Scanner(System.in);
        String school = stdIn.nextLine();
        String name = stdIn.nextLine();
        ///System.out.println("学校名 : " + school);
        ///System.out.println("名前 : " + name);
        display(school, name);
    }

    static void display(String school, String name) {
        System.out.println("学校名 : " + school);
        System.out.println("名前 : " + name);
    }
}
