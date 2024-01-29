package test.program15;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Mondai2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        try {
            // 整数を入力する
            System.out.print("整数を入力 = ");
            int num = scanner.nextInt();
            // 偶数の場合
            if (num % 2 == 0)
            System.out.println(num + "は偶数");
            // 奇数の場合
            else
            System.out.println(num + "は奇数");
            // 実数値が入力された場合
            } catch (InputMismatchException e) {
                System.out.println("整数と認識できません!!");
            }
    
    }

}