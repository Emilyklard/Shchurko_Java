import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите число:");
        System.out.println(inputNumber(scanner));
    }

    private static String inputNumber (Scanner scanner) {
        int number = scanner.nextInt();
        if (number > 7) {
            return "Привет";
        } else
            return "";
    }
}
