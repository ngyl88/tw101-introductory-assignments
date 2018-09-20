import java.util.Scanner;

/**
 * TriangleHorizontal
 */
public class TriangleHorizontal {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        try {
            System.out.println("Please enter n: ");
            int n = in.nextInt();
            System.out.print(new String(new char[n]).replaceAll("\0", "*"));
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            in.close();
        }
    }    
}