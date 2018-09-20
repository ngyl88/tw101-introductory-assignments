import java.util.Scanner;

/**
 * IsocelesTriangle
 */
public class IsocelesTriangle {

    public static void main(String[] args) {
        System.out.println("Please enter n: ");
        Scanner in = new Scanner(System.in);

        try {
            int n = in.nextInt();

            String spacesString = null;
            String printedString = null;
            for(int i = 0; i < n; i++) {
                int spaces = n - (i + 1);
                spacesString = new String(new char[spaces]).replaceAll("\0", " ");

                int currentToPrint = (i + 1) * 2 - 1;
                printedString = new String(new char[currentToPrint]).replaceAll("\0", "*");
                
                System.out.println(spacesString + printedString);
            }
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            in.close();
        }
    }
}