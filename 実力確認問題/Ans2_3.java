/**
 *このクラスはnt 型の変数 x、y に任意の数値を代入し、x の値を y に、y の値を x に入れ替えて x と y の値を表示させます。
 *@author 開
 *@since 1.0
 */
public class Ans2_3 {

    /**
    * プログラムを実行するメインメソッド。
    *
    * @param args コマンドライン引数
    */
    public static void main(String[] args){

        int x = 3;
        int y = 5;

        int z = 0;
        z = x;
        x = y;
        y = z;

        System.out.println("x=" + x);
        System.out.println("y=" + y);

    }
}