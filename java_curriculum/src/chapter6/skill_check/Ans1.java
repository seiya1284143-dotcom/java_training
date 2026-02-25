import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.IntStream;

/**
 *このクラスは保険契約者の情報を出力します。
 *@author 開
 *@since 1.0
 */
public class Ans1 {

    /**
     * プログラムを実行するメインメソッド。
     *
     * @param args コマンドライン引数
     */
    public static void main(String[] args)  {

        List<String> names = new ArrayList<>();
        names.add("中村");
        names.add("田島");
        names.add("小澤");
        names.add("大西");

        List<Integer> premiums = new ArrayList<>();
        premiums.add(5000);
        premiums.add(3000);
        premiums.add(4500);
        premiums.add(6000);

        List<Integer> latePaymentInterests = new ArrayList<>();
        latePaymentInterests.add(2000);
        latePaymentInterests.add(0);
        latePaymentInterests.add(0);
        latePaymentInterests.add(3500);

        IntStream.range(0, names.size()).forEach(i -> {
            System.out.println("契約者名:" + names.get(i) + "、保険料:" + premiums.get(i) + "円");
        });

        long count = latePaymentInterests.stream().filter(x -> x > 0).count();
        System.out.println("遅延利息金が発生している人数は" + count + "人です。");
    }
}