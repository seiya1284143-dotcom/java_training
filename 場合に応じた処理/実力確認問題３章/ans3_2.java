import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

/**
 *このクラスは整数値x,yを入力し、該当する条件を表示させます。
 *@author 開
 *@since 1.0
 */
public class ans3_2 {

    /**
     * プログラムを実行するメインメソッド。
     *
     * @param args コマンドライン引数
     */
    public static void main(String[] args) throws IOException {

        System.out.println("整数を２つ入力してください。");

        BufferedReader br =
            new BufferedReader(new InputStreamReader(System.in));

        String str1 = br.readLine();
        String str2 = br.readLine();
        int x = Integer.parseInt(str1);
        int y = Integer.parseInt(str2);

        if (x < y && (x % 2) == 0 && (y % 2) == 0) {
            System.out.println(x + "は" + y + "より小さく、かつ、" + x + "と" + y + "は共に偶数である。");
        } else if (x == y && x < 0 && y < 0) {
            System.out.println(x + "と" + y + "は等しく、かつ、負の数である。");
        } else if (x < y || (x % 2) == 0) {
            System.out.println(x + "は" + y + "より小さい、または、" + x + "は偶数である。");
        }
    }
}