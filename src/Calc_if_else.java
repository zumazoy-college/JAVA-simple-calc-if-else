import java.util.Scanner;


public class Calc_if_else {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        System.out.print("Введите первое число: ");
        int a = scanner.nextInt();

        System.out.print("Введите операцию (+, -, /, %, *): ");
        char op = scanner.next().charAt(0);

        System.out.print("Введите второе число: ");
        int b = scanner.nextInt();


        int result;
        if (op == '+') {
            result = a + b;
            System.out.println("Результат: " + result);
        } else if (op == '-') {
            result = a - b;
            System.out.println("Результат: " + result);
        } else if (op == '/') {
            if (b == 0) {
                System.out.println("Делить на ноль нельзя!");
            } else {
                result = a / b;
                System.out.println("Результат: " + result);
            }
        } else if (op == '%') {
            if (b == 0) {
                System.out.println("Делить на ноль нельзя!");
            } else {
                result = a % b;
                System.out.println("Результат: " + result);
            }
        } else if (op == '*') {
                result = a * b;
                System.out.println("Результат: " + result);
        } else {
            System.out.println("Что-то пошло не так");
        }
    }
}