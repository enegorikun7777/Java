import java.util.Random;
import java.util.Scanner;

public class Kazuate {
    public static void main(String[] args) {
        Random rand = new Random();
        Scanner stdIn = new Scanner(System.in);

        int no = rand.nextInt(100);

        System.out.println("数当てゲーム開始!!");
        System.out.println("0~99の数を当ててください。");

        int x;
        do {
            System.out.println("いくつかな");
            x = stdIn.nextInt();

            if (x > no)
              System.out.println("もっと小さな数字だよ。");
            else if (x < no)
              System.out.println("もっと大きな数字だよ。");
        } while (x != no);

        System.out.println("正解です。");
    }
}
