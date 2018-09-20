/**
 * Fizzbuzz
 */
public class Fizzbuzz {

    public static void main(String[] args) {
        String buffer = null;
        for(int i = 1 ; i <= 100 ; i++) {
            buffer = "";
            if(i%3 == 0) {
                buffer = "Fizz";
            }
            if(i%5 == 0) {
                buffer += "Buzz";
            }
            System.out.println(buffer.length() > 0 ? buffer : i);
        }
    }
}