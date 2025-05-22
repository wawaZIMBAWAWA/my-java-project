package wawa;
import java.util.Scanner;

public class StringComparison {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Принимаем две строки от пользователя
        System.out.print("Введите первую строку (a): ");
        String a = scanner.nextLine();
        
        System.out.print("Введите вторую строку (b): ");
        String b = scanner.nextLine();
        
        // Сравниваем строки
        if (a.equals(b)) {
            System.out.println("Строки идентичны");
        } else {
            System.out.println("Строки неидентичны");
        }
        
        // Закрываем сканер
        scanner.close();
    }
}