public class stars {
    public static void main(String[] args) {
        int rows = 5;
        printCentreTriangle(rows);
    }

    public static void printCentreTriangle(int rows) {
        for (int i = 1; i <= rows; i++) {
            // Print spaces
            for (int s = 1; s <= rows - i; s++) {
                System.out.print(" ");
            }

            // Print stars
            for (int j = 1; j <= 2 * i - 1; j++) {
                System.out.print("*");
            }

            // Move to the next line
            System.out.println();
        }
    }
}
