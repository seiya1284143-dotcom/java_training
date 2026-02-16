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

        String[] name = new String[4];

        name[0] = "中村";
        name[1] = "田島";
        name[2] = "小澤";
        name[3] = "大西";

        int[][] num = new int[2][4];

        num[0][0] = 5000;
        num[0][1] = 3000;
        num[0][2] = 4500;
        num[0][3] = 6000;
        num[1][0] = 2000;
        num[1][1] = 0;
        num[1][2] = 0;
        num[1][3] = 3500;

        for (int i = 0; i < name.length; i++) {
            System.out.println("契約者名:" + name[i] + "、保険料:" + num[0][i] + "円");
        }

        int x = 0;

        for (int i = 0; i < name.length; i++) {
            if (num[1][i] > 0) {
                x++;
            }
        }

        System.out.println("遅延利息金が発生している人数は" + x + "人です。");

    }
}