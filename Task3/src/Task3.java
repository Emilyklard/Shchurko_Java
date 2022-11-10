import java.util.ArrayList;
import java.util.Scanner;

public class Task3 {
    public static void main(String[] args) {
        Scanner scanner1 = new Scanner(System.in);
        System.out.print("Введите числа через запятую: ");
        arrayOutput(scanner1);
    }
    private static void arrayOutput(Scanner scanner1) {
        String line = scanner1.nextLine();
        String lineArr[] = line.split(",");
        int array[] = new int[lineArr.length];
        for (int i = 0; i < lineArr.length; i++) {
            array[i] = Integer.parseInt(lineArr[i]);
            if (array[i] % 3 == 0) {
                System.out.print(array[i] + " ");
            }
        }
    }
}

