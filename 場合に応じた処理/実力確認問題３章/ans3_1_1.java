import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

/**
 *このクラスは試験の点数（それぞれ0～100点）を入力し、成績を判定し表示させます。
 *@author 開
 *@since 1.0
 */
public class ans3_1_1 {

    /**
     * プログラムを実行するメインメソッド。
     *
     * @param args コマンドライン引数
     */
    public static void main(String[] args) throws IOException {

        System.out.println("試験の点数を入力してください。");

    	BufferedReader br =
	    new BufferedReader(new InputStreamReader(System.in));

	String str = br.readLine();
	int x = Integer.parseInt(str);

	if (x >= 60 && x <= 100) {
	    System.out.println("合格");
	}
	else if (x < 60 && x >= 0) {
	    System.out.println("不合格");
	}
	else {
	    System.out.println("正しい点数を入力してください。");
	}
    }
}