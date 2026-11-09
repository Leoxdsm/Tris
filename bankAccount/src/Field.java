import java.util.Scanner;

public class Field {
    private static final String[] field = new String[9];

    public static void create() {
        for (int i = 0; i < 9; i++) {
            field[i] = "[ ]";
            System.out.print(field[i] + " ");
            if (i % 3 == 2){
                System.out.println();
            }
        }
    }

    public static void selectField() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("select a field");
        int selField = scanner.nextInt();
        System.out.println("select a symbol");
        String symbol1 = scanner.nextLine();
        field[selField] = "[" + symbol1 + "]";
    }
}