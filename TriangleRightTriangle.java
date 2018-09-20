import java.util.Scanner;

/**
 * TriangleRightTriangle
 */
public class TriangleRightTriangle {

    public static void main(String[] args) {
        System.out.println("Please enter n: ");
        Scanner in = new Scanner(System.in);

        try {
            int n = in.nextInt();
            
            String s = null;
            for(int i = 0; i < n; i++) {
                s = new String(new char[i + 1]).replaceAll("\0", "*");
                System.out.println(s);
            }
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            in.close();
        }
    }
}