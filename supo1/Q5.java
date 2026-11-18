public class Q5 {
    public static int[] vectorAdd(int x,int y,int dx, int dy) {
        return new int[]{x+dx, y+dy};
    }
    public static void main(String[] args) {
        int a=0;
        int b=2;
        int[] t = vectorAdd(a,b,1,1);
        a = t[0]; b = t[1];
        System.out.println(a + " " + b);
        // (a,b) is now (1,3)
    }
}
