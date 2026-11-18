class Test {
    private int x;
    Test(int x) {
        this.x = x;
    }

    public int getX() {
        return this.x;
    }
}

public class Q2 {
    public static void main(String[] args) {
        int x = 1;
        int[] xs = {1, 2, 3};
        Test hello = new Test(3);
        System.out.println(x + " " + xs.length + " " + hello.getX());
    }
}
