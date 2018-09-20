import java.util.Scanner;
import java.util.ArrayDeque;

/**
 * Diamond
 */
public class Diamond {

    private static String getFormattedLine(String charSeq, int spaces) {
        return new String(new char[spaces]).replaceAll("\0", charSeq);
    }

    private static ArrayDeque<String> printUpperHalfAndReturnPrintedStack(int n) {

        ArrayDeque<String> printedStack = new ArrayDeque<String>();

        String spacesString = null;
        String printedString = null;
        for (int i = 0; i < n; i++) {

            spacesString = getFormattedLine(" ", n - (i + 1));
            printedString = getFormattedLine("*", (i + 1) * 2 - 1);

            String formattedStringToPrint = spacesString + printedString;
            System.out.println(formattedStringToPrint);

            if (i != n - 1) {
                printedStack.push(formattedStringToPrint);
            }
        }
        return printedStack;
    }

    public static void popAndPrintLowerHalf(ArrayDeque<String> printedStack) {
        while (!printedStack.isEmpty()) {
            System.out.println(printedStack.pop());
        }
    }

    public static void main(String[] args) {
        System.out.println("Please enter n: ");
        Scanner in = new Scanner(System.in);

        try {
            int n = in.nextInt();

            ArrayDeque<String> stringPrinted = printUpperHalfAndReturnPrintedStack(n);

            popAndPrintLowerHalf(stringPrinted);

        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            in.close();
        }
    }
}