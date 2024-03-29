import java.util.InputMismatchException;
import java.util.Scanner;

public class ReverseArray1 {
    
    // ---配列の要素a[idx1]とa[idx2]を交換
    static void swap(int[] a, int idx1, int idx2) {
        try {
            int t = a[idx1];
            a[idx1] = a[idx2];
            a[idx2] = t;
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("メソッドswap内で不正なインデックスを検出しました。");
            System.out.println("プログラムを終了します。");
            System.exit(1);
        }
    }

    // ---配列aの要素の並びを反転(誤り)
    static void reverse(int[] a) {
        for (int i = 0; i < a.length /2; i++)
           swap(a, i, a.length - i); // 配列そのものと全体から引く
    }

    public static void main(String[] args) {
        try{
            Scanner stdIn = new Scanner("要素数");
        } catch (InputMismatchException e) {
            System.out.println("不正な入力があります。");
            System.out.println("プログラムを終了します。");
            System.exit(0);
        }
        Scanner stdIn = new Scanner(System.in);

        System.out.print("要素数 :");
        int num = stdIn.nextInt();  // 要素数

        int [] x = new int[num];    // 要素数numの配列  長さは固定の配列

        for (int i = 0; i < num; i++) {
            System.out.print("x[" + i + "] : ");
            x[i] = stdIn.nextInt(); // 1つずつ入れていく
        }

        reverse(x);                  // 配列xの要素の並びを反転

        System.out.println("要素の並びを反転しました。");
        for (int i = 0; i < num; i++)
           System.out.println("x[" + i + "] = " + x[i]);
    }
}
