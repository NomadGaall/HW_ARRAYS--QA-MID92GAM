package ru.netology.stats;

public class StatsService {

    // Метод для расчета среднего значения продаж
    public long avgSales(long[] sales) {
        long avg = sumAllSales(sales) / sales.length;
        return avg;
    }

    // Метод для расчета суммы всех продаж
    public long sumAllSales(long[] sales) {
        long sumSales = 0;
        for (long s : sales) {
            sumSales += s;
        }
        return sumSales;
    }

    // Метод для нахождения месяца с минимальными продажами
    public int minMonthSales(long[] sales) {
        int minMonthSales = 0;
        long minSales = sales[0];
        for (int i = 1; i < sales.length; i++) {
            if (sales[i] < minSales) {
                minSales = sales[i];
                minMonthSales = i;
            }
        }
        return minMonthSales + 1; // Возвращаем номер месяца (1-12)
    }

    // Метод для нахождения месяца с максимальными продажами
    public long maxMonthSales(long[] sales) {
        long maxMonthSales = 0;
        long maxSales = sales[0];
        for (int i = 1; i < sales.length; i++) {
            if (sales[i] > maxSales) {
                maxSales = sales[i];
                maxMonthSales = i;
            }
        }
        return maxMonthSales + 1; // Возвращаем номер месяца (1-12)
    }

    // Метод для подсчета месяцев с продажами ниже среднего
    public int countMonthWithSalesUnderAverage(long[] sales) {
        long average = avgSales(sales); // Рассчитываем среднее значение один раз
        int count = 0;
        for (long sale : sales) {
            if (sale < average) {
                count++;
            }
        }
        return count;
    }

    // Метод для подсчета месяцев с продажами выше среднего
    public int countMonthWithSalesUpperAverage(long[] sales) {
        long average = avgSales(sales); // Рассчитываем среднее значение один раз
        int count = 0;
        for (long sale : sales) {
            if (sale > average) {
                count++;
            }
        }
        return count;
    }
}
