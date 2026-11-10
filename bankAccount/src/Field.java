import java.util.List;
import java.util.Scanner;

public class Field {
    private static final String[] field = new String[9];
    private static int selFieldIndex;
    //public List ListNumbers = new List(int);

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
        System.out.println("select a field from 1 to 9");
        selFieldIndex = scanner.nextInt() - 1;
    }

    public static void AddSymbol()
    {
        if(Main.Player == 1)
        {
            field[selFieldIndex] = "[" + Main.symbol1 + "]";
            reprint();
        }
        else
        {
            field[selFieldIndex] = "[" + Main.symbol2 + "]";
            reprint();
        }
    } 

    private static void reprint() {
        for (int i = 0; i < 9; i++) {
            System.out.print(field[i] + " ");
            if (i % 3 == 2){
                System.out.println();
            }
        }
    }

    
}