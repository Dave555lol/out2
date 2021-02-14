import java.util.*;
public class mainn {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        lit hra = new lit(5);
        hra.random();
        System.out.println(hra);
        while (true) {
            System.out.println("zadej X");
            int x = scan.nextInt();
            System.out.println("zadej Y");
            int y = scan.nextInt();
            hra.off(x, y);
            System.out.println(hra);
        }
    }
}