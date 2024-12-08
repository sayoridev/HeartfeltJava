public class Main {
    public static void main(String[] args) {
        int n = 8; // Size of the heart
        for (int y = -n; y <= 2 * n; y++) {
            for (int x = -2 * n; x <= 2 * n; x++) {
                // Check conditions for printing heart or empty space
                if ((y <= 0 && 
                    ((int) Math.sqrt((x + n) * (x + n) + y * y) <= n ||
                     (int) Math.sqrt((x - n) * (x - n) + y * y) <= n)) ||
                    (y > 0 && Math.abs(x) <= 2 * n - y)) {
                    System.out.print("♥ "); // Print filled heart character
                } else {
                    System.out.print("♡ "); // Print empty heart character
                }
            }
            // Print the message after each row of hearts
            System.out.print("I love u so much my baby"); 
            System.out.println(); // Move to the next line after each row
        }
    }
}

