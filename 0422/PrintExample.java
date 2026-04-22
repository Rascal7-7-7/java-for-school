// ここの一行がコメントになる
/*
    ここの複数行もコメントになる
*/
// ここはクラス名を設定している
public class PrintExample {
    public static void main(String[] args) {

        // phpの場合
        // $i = 1;
        // $i = "aiueio";

        // 10(数値)を保存する場合
        int i = 10; //int : 成宇内専用の変数（箱）を作る宣言
        double j = 3.14; // double : 小数点を保存するための変数（箱）を作る宣言
        String s = "aiueo"; // String : 文字列を保存するための変数（箱）を作る宣言


        //　ここでは画面に指定した文字を表示する処理
        System.out.println("こんにちわ");

        System.out.println("iの値: " + i);
        System.out.println("jの値: " + j);
        System.out.println("sの値: " + s);

    }
}