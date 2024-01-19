import java.util.Scanner;

public class Kouka1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int score;
        int cnt = 0;
        int sum = 0;
        double avg;
        do{
            do {
                System.out.print((cnt+1)+"+人目点数==>");
                score = sc.nextInt();
            } while (score < 0 || score > 100);
            sum = sum + score;
            cnt++;
        }while(cnt<5);
        avg=(double)sum/cnt;
        System.out.print(avg);
    }
}
