import java.util.Scanner;
import java.util.ArrayDeque;

/**
 * Diamond
 */
public class Diamond {

    public static void main(String[] args) {
        System.out.println("Please enter n: ");
        Scanner in = new Scanner(System.in);

        try {
            int n = in.nextInt();

            ArrayDeque<String> stringPrinted = new ArrayDeque<String>();
            int lineToPrint = n * 2 - 1;

            String spacesString = null;
            String printedString = null;
            for (int i = 0; i < n; i++) {
                int spaces = n - (i + 1);
                spacesString = new String(new char[spaces]).replaceAll("\0", " ");

                int currentToPrint = (i + 1) * 2 - 1;
                printedString = new String(new char[currentToPrint]).replaceAll("\0", "*");

                String formattedStringToPrint = spacesString + printedString;
                System.out.println(formattedStringToPrint);

                if(i != n - 1) {
                    stringPrinted.push(formattedStringToPrint);
                }
            }
            
            for (int i = lineToPrint - n; i > 0; i--) {
                System.out.println(stringPrinted.pop());
            }
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            in.close();
        }
    }
}