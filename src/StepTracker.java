import java.util.Scanner;

class StepTracker {
    Scanner scanner;
    MonthData[] monthToData = new MonthData[12];
    int goalByStepsPerDay = 10000;

    Converter conv = new Converter();

    StepTracker(Scanner scan) {
        scanner = scan;

        for (int i = 0; i < monthToData.length; i++) {
            monthToData[i] = new MonthData();
        }
    }
    void changeStepGoal(int perDayHop) {
        if (perDayHop > 0) {
            goalByStepsPerDay = perDayHop;
            System.out.println("Сохранили");
        } else {
            System.out.println("Не корректно указана цель, прекращаю операцию!");
            return;
        }

    }

    void addNewNumberStepsPerDay() {
        System.out.println("Введите номер месяца");
        // ввод и проверка номера месяца
        int month = scanner.nextInt();
        if (month < 1 | month > 12) {
            System.out.println("Не корректно указан месяц, прекращаю операцию!");
            return;
        }

        System.out.println("Введите день от 1 до 30 (включительно)");
        // ввод и проверка дня
        int day = scanner.nextInt();
        if (day < 1 | day > 30) {
            System.out.println("Не корректно указан день, прекращаю операцию!");
            return;
        }

        System.out.println("Введите количество шагов");
        // ввод и проверка количества шагов
        int hop = scanner.nextInt();
        if (hop < 0) {
            System.out.println("Не корректно указаны шаги, прекращаю операцию!");
            return;
        }

        // Получение соответствующего объекта MonthData из массива
        MonthData monthData = monthToData[month - 1];
        // Сохранение полученных данных
        monthData.days[day - 1] = hop;
        System.out.println("Сохранили");
    }
    void printStatistic() {
        System.out.println("Введите число месяца");
        // ввод и проверка номера месяца

        int month = scanner.nextInt(); // получение соответствующего месяца
        if (month < 1 | month > 12) {
            System.out.println("Не корректно указан месяц, прекращаю операцию!");
            return;
        }
        MonthData monthData = monthToData[month - 1];

        // вывод общей статистики по дням
        monthToData[month - 1].printDaysAndStepsFromMonth();

        // вывод суммы шагов за месяц
        System.out.println("Сумма шагов за месяц: " + monthData.sumStepsFromMonth());

        // вывод максимального пройденного количества шагов за месяц
        System.out.println("Максимальное количество шагов за день в месяце: "+ monthData.maxSteps());

        // вывод среднего пройденного количества шагов за месяц
        System.out.println("Среднее количество шагов за день в месяце: "+ monthData.avgSteps());

        // вывод пройденной за месяц дистанции в км
        System.out.println("Пройденное за месяц дистанции в км: "+ conv.convertToKm(monthData.sumStepsFromMonth()));

        // вывод количества сожжённых килокалорий за месяц
        System.out.println("Количества сожжённых килокалорий за месяц: "+ conv.convertStepsToKilocalories(monthData.sumStepsFromMonth()));

        // вывод лучшей серии
        System.out.println("Лучшая серия по достижению цели: "+ monthData.bestSeries(goalByStepsPerDay));
        System.out.println(); //дополнительный перенос строки


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
