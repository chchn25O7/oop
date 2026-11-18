import java.util.Arrays;

public class Q4 {
    public static int sum(int[] a) {
        int ans = 0;
        for (int i = 0; i < a.length; i++) {
            ans += a[i];
        }
        return ans;
    }

    public static int[] cumsum(int[] a) {
        int[] b = new int[a.length];
        if (a.length == 0) {
            return b;
        }
        b[0] = a[0];
        for (int i = 1; i < a.length; i++) {
            b[i] = b[i-1] + a[i];
        }
        return b;
    }

    public static int[] positives(int[] a) {
        int cnt_positives = 0;
        for (int i = 0; i < a.length; i++) {
            if (a[i] > 0) {
                cnt_positives++;
            }
        }
        int[] b = new int[cnt_positives];
        int next_free = 0;
        for (int i = 0; i < a.length; i++) {
            if (a[i] > 0) {
                b[next_free] = a[i];
                next_free++;
            }
        }
        return b;
    }

    public static void main(String[] args) {
        int[] a = {3, -1, 4, 0, -5, 9};
        System.out.println(sum(a));
        System.out.println(Arrays.toString(cumsum(a)));
        System.out.println(Arrays.toString(positives(a)));
        System.out.println(Arrays.toString(cumsum(new int[0])));
    }
}
