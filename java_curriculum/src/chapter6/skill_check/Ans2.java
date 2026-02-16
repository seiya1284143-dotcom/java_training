import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

/**
 *このクラスは商品と単価、支払金額を3回入力し、支払金額の不足有無を出力します。最後に不足の合計を出力します。
 *@author 開
 *@since 1.0
 */
public class Ans2 {

    /**
     * プログラムを実行するメインメソッド。
     *
     * @param args コマンドライン引数
     */
    public static void main(String[] args) throws IOException {

        BufferedReader br =
            new BufferedReader(new InputStreamReader(System.in));

        String[] name = new String[3];
        int[][] x = new int[2][3];

        for (int i = 0; i < name.length; i++) {
            System.out.println("商品を入力してください。");
            name[i] = br.readLine();

            System.out.println("単価を入力してください。");
            String str = br.readLine();
            x[0][i] = Integer.parseInt(str);

            System.out.println("支払金額を入力してください。");
            str = br.readLine();
            x[1][i] = Integer.parseInt(str);
        }

        int y = 0;
        int sum = 0;

        for (int i = 0; i < name.length; i++) {
            if (x[0][i] > x[1][i]) {
                System.out.println(name[i] + "、" + x[0][i] + "円、支払金額不足");
                y = (x[0][i] - x[1][i]);
                sum += y;
            } else {
                System.out.println(name[i] + "、" + x[0][i] + "円、支払金額過不足無し");
            }
        }

        System.out.println("全体の不足金" + sum + "円");

    }
}