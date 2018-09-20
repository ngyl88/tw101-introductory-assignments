import java.util.Scanner;

/**
 * TriangleVertical
 */
public class TriangleVertical {

    public static void main(String[] args) {
        System.out.println("Please enter n: ");
        Scanner in = new Scanner(System.in);
        try {
            int n = in.nextInt();
            
            for (int i = 0; i < n; i++) {
                System.out.println("*");
            }
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            in.close();
        }
    }
}