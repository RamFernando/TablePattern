public class TablePattern {

    public static void main(String[] args) {
        //no of rows
        for (int i = 0; i < 11; i++) {
            if (i == 0) {
                System.out.print("   ");
                for (int j = 1; j < 10; j++) {
                    if (j <= 9) {
                        System.out.print("   " + j);
                        continue;
                    }
                    System.out.print("  " + j);
                }
                System.out.println("");
                System.out.println("----------------------------------------");
                continue;
            }
            if (i != 10) {
                printRow(i);
            }
        }
    }

    private static void printRow(int i) {
        System.out.print(i + "| ");
        for (int j = 1; j <= i * 9; j++) {
            if (j % i == 0) {
                if (j <= 9) {
                    System.out.print("   " + j);
                    continue;
                }
                System.out.print("  " + j);
            }
        }
        System.out.println("");
    }
}