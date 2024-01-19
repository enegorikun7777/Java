package test.program8;
import java.util.List;
import java.util.ArrayList;
import java.util.Arrays;
public class Mondai5 {
    public static void main(String[] args) {
        //int[] array = {1, 2, 3, 4, 5};
        List<Integer> array = new ArrayList<Integer>(Arrays.asList(1, 2, 3, 4, 5));
        int sum=0; //合計値

        //合計値を表示//
        for(int i = 0; i < array.size() ; i++){
            sum += array.get(i);
        }
        //合計を出
            System.out.println("合計値は " + sum + "です");

            //平均を出力
            System.out.println("平均値は " + (sum / array.size()) + "です");
    }
}
