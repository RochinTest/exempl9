import java.util.Scanner;

public class Main {
    private final static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        int m = 0, n, l;
        int p = 0;
        if (sc.hasNextInt())
            m = sc.nextInt();
        n = sc.nextInt();
        l = sc.nextInt();
        p = sc.nextInt();
        if (m == n || n == l || l == p || p == m || m == l || n == p)
            System.out.println(false);
        else System.out.println(true);

    }
}