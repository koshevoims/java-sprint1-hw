import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);// создание нового экземпляра
        StepTracker tracker = new StepTracker(scanner);
        while (true) {
            printMenu();
            int i = scanner.nextInt();
            // здесь будет работа с командами
            if (i == 1) {
            // здесь будет логика команды 1
                tracker.addNewNumberStepsPerDay();
            } else if (i == 2) {
            // здесь будет логика команды 2
                System.out.println("Введите кастомную цель по количеству шагов");
                int perDayHop = scanner.nextInt();
                tracker.changeStepGoal(perDayHop);
            } else if (i == 3) {
            // здесь будет логика команды 3
                tracker.printStatistic();

            } else if (i == 0) {
                System.out.println("Пока!");
                scanner.close();
                return;
            } else {
                System.out.println("Такой команды нет");
            }
        }
    }

    public static void printMenu() {
        System.out.println("Что вы хотите сделать? ");
        System.out.println("1 - ввести количество шагов за определённый день");
        System.out.println("2 - изменить цель по количеству шагов в день");
        System.out.println("3 - напечатать статистику за определённый месяц");
        System.out.println("0 - выйти из приложения");
    }
}



/*
Приложение должно предоставлять следующую функциональность:
консольный интерфейс для управления программой;
хранение данных о количестве пройденных шагов за несколько месяцев;
ввод цели по количеству шагов в день;
ввод пройденного количества шагов за день;
вывод статистики за определённый месяц.

Main.java
  - Вывод меню
  - Выбор пункта меню

Converter.java
  - Преобразование шагов в килокалории
  - Преобразование шагов в километры

MonthData.java
  - Хранение данных конкретного месяца
  - Логика по подсчету статистики за месяц

StepTracker.java
  - Вывод статистики
  - Логика по изменению ежедневной нормы шагов
  - Логика по сохранению количества шагов: ввод месяца, дня, количества шагов сохранение данных
 */
