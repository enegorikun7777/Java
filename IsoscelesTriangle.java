import java.util.Scanner;

public class IsoscelesTriangle {
    public static void main(String[] args) {
        Scanner stdIn = new Scanner(System.in);

        System.out.println("左下直角の二等辺三角形を表示します。");
        System.out.println("段数は :");
        int n = stdIn.nextInt();

        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++)
              System.out.print('*');
            System.out.println();
        }
    }
}
