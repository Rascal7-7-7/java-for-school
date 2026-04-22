public class sample2 {
    public static void main(String[] args) {
        byte b1 = 100; // byte : -128 ~ 127の整数を保存するための変数（箱）を作る宣言
        short s1 = 10000; // short : -32768 ~ 32767の整数を保存するための変数（箱）を作る宣言
        long l1 = 10000000000L; // long : -9223372036854775808 ~ 9223372036854775807の整数を保存するための変数（箱）を作る宣言
        System.out.println("b1の値: " + b1);
        System.out.println("s1の値: " + s1);
        System.out.println("l1の値: " + l1);
    }
}
