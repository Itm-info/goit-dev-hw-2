import static java.lang.Math.abs;

public class SumCalculator {
    static int sum(int n) {
        if (n == 0) throw new IllegalArgumentException("Must not be zero");

        int step = n/abs(n);
        int res = 0;
        int i;
        for (i=1;(i/n) != 1;i += step) {
            res += i;
        }
        return res + i;
    }

    public static void main(String[] args) {
    }
}
