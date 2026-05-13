public class CalcExample3 {
    public static void main(String args[]) {
        int i;
        i = 11;
        i++;
        i /= 2;
        System.out.println(i);

        int j;
        j = i * i;
        System.out.println(j);

        int k = 1;
        int m = (k = 2 + 3) * 2;
        System.out.println(m);
    }
}
