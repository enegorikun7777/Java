import java.util.Scanner;

public class Kouka2 {
    public static void main(String[] args) {
        // ユーザーにパスワードを入力してもらう
        Scanner scanner = new Scanner(System.in);
        System.out.print("現在のパスワードを入力してください: ");
        String originalPassword = scanner.nextLine();

        // 強力なセキュリティのパスワードを生成
        StringBuilder strongPassword = new StringBuilder(originalPassword);
        strongPassword.reverse();


    }
}
