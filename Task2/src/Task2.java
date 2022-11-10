import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Введите имя:");
        System.out.println(inputName(scan));
    }
    private static String inputName(Scanner scan) {
        String line = scan.nextLine();
        if (line.equals("Вячеслав")) {
            return "Привет Вячеслав";
        } else
            return "Нет такого имени";

    }
}
