import java.lang.Integer;

import java.util.ArrayList;
import java.util.Iterator;;

/**
 * PrimeFactors
 */
public class PrimeFactors {
    private static boolean isPrimeFactor(int number, ArrayList factors) {
        Iterator iter = factors.iterator();
        while (iter.hasNext()) {
            int factor = (Integer) iter.next();
            if (number % factor == 0) {
                return false;
            }
        }
        return true;
    }

    private static ArrayList generate(int n) {
        ArrayList<Integer> factors = new ArrayList<Integer>();
        if (n > 1) {
            for (int i = 2; i < n; i++) {
                if (n % i == 0 && isPrimeFactor(i, factors)) {
                    factors.add(i);
                }
            }
        }
        return factors;
    }

    public static void main(String[] args) {
        System.out.println("generate(1):");
        System.out.println("\t" + generate(1));

        System.out.println("generate(30):");
        System.out.println("\t" + generate(30));
    }
}