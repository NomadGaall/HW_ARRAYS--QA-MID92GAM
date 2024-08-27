package ru.netology.stats;

public class StatsService {
    public int avgSales(int[] sales) {
        int avg = sumAllSales(sales) / sales.length;
        return avg;
    }

    public int sumAllSales(int[] sales) {
        int sumSales = 0;
        for (int s : sales) {
            sumSales += s;
        }
        return sumSales;
    }

    public int minMonthSales(int[] sales) {
        // int minSales = sales[0];
        int minMonthSales = 0;
        for (int i = 0; i < sales.length; i++) {
            if (sales[i] <= sales[minMonthSales]) {
                minMonthSales = i;
            }
        }
        return minMonthSales + 1;
    }

    public int maxMonthSales(int[] sales) {
        int maxSales = sales[0];
        int maxMonthSales = 0;
        for (int i = 0; i < sales.length; i++) {
            if (sales[i] >= maxSales) {
                maxSales = sales[i];
                maxMonthSales = i + 1;
            }
        }
        return maxMonthSales;
    }

    public int countMonthWithSalesUnderAverage(int[] sales) {
        int average = avgSales(sales); // Рассчитываем среднее значение один раз
        int count = 0;
        for (int i = 0; i < sales.length; i++) {
            if (sales[i] < average) {
                count++;
            }
        }
        return count;
    }

    public int countMonthWithSalesUpperAverage(int[] sales) {
        int average = avgSales(sales); // Рассчитываем среднее значение один раз
        int count = 0;
        for (int i = 0; i < sales.length; i++) {
            if (sales[i] > average) {
                count++;
            }
        }
        return count;
    }
}