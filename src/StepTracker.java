import java.util.Scanner;

class StepTracker {
    Scanner scanner;
    MonthData[] monthToData = new MonthData[12];
    int goalByStepsPerDay = 10000;

    StepTracker(Scanner scan) {
        scanner = scan;

        for (int i = 0; i < monthToData.length; i++) {
            monthToData[i] = new MonthData();
        }
    }
    void changeStepGoal(int perDayHop) {
        goalByStepsPerDay = perDayHop;
    }

    void addNewNumberStepsPerDay() {
        System.out.println("Введите номер месяца");
        // ввод и проверка номера месяца
        int month = scanner.nextInt();

        System.out.println("Введите день от 1 до 30 (включительно)");
        // ввод и проверка дня
        int day = scanner.nextInt();

        System.out.println("Введите количество шагов");
        // ввод и проверка количества шагов
        int hop = scanner.nextInt();

        // Получение соответствующего объекта MonthData из массива
        MonthData monthData = monthToData[month - 1];
        // Сохранение полученных данных
        monthData.days[day - 1] = hop;
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
  - логика по подсчету статистики за месяц

StepTracker.java
  - Вывод статистики
  - Логика по изменению ежедневной нормы шагов
  - Логика по сохранению количества шагов: ввод месяца, дня, количества шагов сохранение данных
 */
