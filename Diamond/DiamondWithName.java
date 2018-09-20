import java.util.Scanner;
import java.util.ArrayDeque;

/**
 * DiamondWithName
 */
public class DiamondWithName {

    static final String NAME = "Yu Lian";

    private static String getFormattedLine(String charSeq, int spaces) {
        return new String(new char[spaces]).replaceAll("\0", charSeq);
    }

    private static ArrayDeque<String> printUpperHalfAndReturnPrintedStack(int n) {

        ArrayDeque<String> printedStack = new ArrayDeque<String>();

        String spacesString = null;
        String printedString = null;
        for (int i = 0; i < n - 1; i++) {

            spacesString = getFormattedLine(" ", n - (i + 1));
            printedString = getFormattedLine("*", (i + 1) * 2 - 1);

            String formattedStringToPrint = spacesString + printedString;
            System.out.println(formattedStringToPrint);
            printedStack.push(formattedStringToPrint);
        }
        return printedStack;
    }

    public static void popAndPrintLowerHalf(ArrayDeque<String> printedStack) {
        while (!printedStack.isEmpty()) {
            System.out.println(printedStack.pop());
        }
    }

    private static void printNameAtLine(int line) {
        int maxSpaces = line * 2 - 1;
        String spacesString = getFormattedLine(" ", maxSpaces > NAME.length() ? (maxSpaces - NAME.length()) / 2 : 0);
        System.out.println(spacesString + NAME);
    }

    public static void main(String[] args) {
        System.out.println("Please enter n: ");
        Scanner in = new Scanner(System.in);

        try {
            int n = in.nextInt();

            ArrayDeque<String> stringPrinted = printUpperHalfAndReturnPrintedStack(n);
            printNameAtLine(n);
            popAndPrintLowerHalf(stringPrinted);

        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            in.close();
        }
    }
}