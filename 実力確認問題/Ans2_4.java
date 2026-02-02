/**
 *このクラスは変数xに代入した数値を3倍して表示し、その後変数xを半分にして表示させます。
 *@author 開
 *@since 1.0
 */
public class Ans2_4 {

    /**
    * プログラムを実行するメインメソッド。
    *
    * @param args コマンドライン引数
    */
    public static void main(String[] args){

        int x = 7;
        x *= 3;

        System.out.println("x=" + x);

        x /= 2;

        System.out.println("x=" + x);

    }
}