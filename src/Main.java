import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new scanner();// создание нового экземпляра
        while (true) {
            printMenu();
            int i = scanner.nextInt();
            // здесь будет работа с командами
            if (i == 1) {
            // здесь будет логика команды 1
            } else if (i == 2) {
            // здесь будет логика команды 2
            } else if (i == 3) {
            // здесь будет логика команды 3
            } else if (i == 4) {
                System.out.println("Пока!");
                scanner.close();
                return;
            } else {
                System.out.println("Такой команды нет");
            }
        }
    }

    static void printMenu() {
        System.out.println("Что вы хотите сделать? ");
        System.out.println("1 - ввести количество шагов за определённый день");
        System.out.println("2 - изменить цель по количеству шагов в день");
        System.out.println("3 - напечатать статистику за определённый месяц");
        System.out.println("0 - выйти из приложения");
    }
}
