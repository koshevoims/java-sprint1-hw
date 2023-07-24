class MonthData {
    int[] days = new int[30];

    void printDaysAndStepsFromMonth() {
        for (int i = 0; i < days.length; i++) {
            // Вывод элементов массива в необходимом формате
            System.out.println(i+"день: "+ days[i]);
        }
    }
    int sumStepsFromMonth() {
        int sumSteps = 0;
        for (int i = 0; i < days.length; i++) {
            // подсчёт суммы элементов массива days[]
            sumSteps += days[i];
        }
        return sumSteps;
    }
    int maxSteps() {
        int maxSteps = 0;
        for (int i = 0; i < days.length; i++) {
            // поиск максимального элемента
            if (maxSteps < days[i]) {
                maxSteps = days[i];
            }
        }
        return maxSteps;
    }
    int bestSeries(int goalByStepsPerDay) {
        int currentSeries = 0;
        int finalSeries = 0;
        for (int i = 0; i < days.length; i++) {
            // поиск максимальной серии
            if (days[i] > goalByStepsPerDay) {
                currentSeries += 1;
                if (currentSeries > finalSeries) {
                    finalSeries = currentSeries;
                }
            } else {
                currentSeries = 0;
            }
        }
        return finalSeries;
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
