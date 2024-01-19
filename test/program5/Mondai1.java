package test.program5;

import java.util.Scanner;

public class Mondai1 {
    public static void main(String[] args) {
        Scanner stdIn = new Scanner(System.in);

        System.out.print("A~Dの値を入力してください :");
        char userInput = stdIn.next().charAt(0);

        switch (userInput) {
            case 'A' :System.out.print("ランクAは評価「優」です");
            break;
            case 'B' :System.out.print("ランクBは評価「良」です");
            break;
            case 'c' :System.out.print("ランクCは評価「可」です");
            break;
            case 'D' :System.out .print("ランクDは評価「不可」です");
            break;
       }
    }
}