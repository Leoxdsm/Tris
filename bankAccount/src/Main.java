import java.util.Scanner;

public class Main {
    public static char symbol1;
    public static char symbol2;
    public static int Player = 1;
    public static void main(String[] args) {
        Field.create();
        //#region SymbolSelect
        Scanner scanner = new Scanner(System.in);
        System.out.println("Player 1: \nselect a symbol:");
        symbol1 = scanner.nextLine().charAt(0);
        System.out.println("Player 2: \nselect a symbol:");
        symbol2 = scanner.nextLine().charAt(0);
        //#endregion
        for (int t = 1; t <= 9; t++) {
            System.out.printf("%d° turn %n", t);
            System.out.printf("Player's %d turn %n", Player);
            Field.selectField();
            Field.AddSymbol();
            Player++;
            if (t == 9) break;
            t++;
            System.out.printf("%d° turn %n", t);
            System.out.printf("Player's %d turn %n", Player);
            Field.selectField();
            Field.AddSymbol();
            Player--;
        }

    }
}
