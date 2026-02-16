import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

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

        List<String> name = new ArrayList<>();
        name.add("中村");
        name.add("田島");
        name.add("小澤");
        name.add("大西");

        List<Integer> hkn = new ArrayList<>();
        hkn.add(5000);
        hkn.add(3000);
        hkn.add(4500);
        hkn.add(6000);

        List<Integer> tien = new ArrayList<>();
        tien.add(2000);
        tien.add(0);
        tien.add(0);
        tien.add(3500);

        for (int i = 0; i < name.size(); i++) {
            System.out.println("契約者名:" + name.get(i) + "、保険料:" + hkn.get(i) + "円");
        }

        int x = 0;

        for (int i = 0; i < tien.size(); i++) {
            if (tien.get(i) > 0) {
                x++;
            }
        }

        System.out.println("遅延利息金が発生している人数は" + x + "人です。");

    }
}