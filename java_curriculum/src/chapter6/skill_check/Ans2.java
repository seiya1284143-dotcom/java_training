import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

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

        List<String> names = new ArrayList<>();
        List<Integer> unitPrices = new ArrayList<>();
        List<Integer> paymentAmounts = new ArrayList<>();

        for (int i = 0; i < 3; i++) {
            System.out.println("商品を入力してください。");
            names.add(br.readLine());

            System.out.println("単価を入力してください。");
            String str = br.readLine();
            int x = Integer.parseInt(str);
            unitPrices.add(x);

            System.out.println("支払金額を入力してください。");
            str = br.readLine();
            x = Integer.parseInt(str);
            paymentAmounts.add(x);
        }

        int sum = 0;

        for (int i = 0; i < names.size(); i++) {
            if (unitPrices.get(i) > paymentAmounts.get(i)) {
                System.out.println(names.get(i) + "、" + unitPrices.get(i) + "円、支払金額不足");
                sum += unitPrices.get(i) - paymentAmounts.get(i);
            } else {
                System.out.println(names.get(i) + "、" + unitPrices.get(i) + "円、支払金額過不足無し");
            }
        }

        System.out.println("全体の不足金" + sum + "円");

    }
}