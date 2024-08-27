package ru.netology.stats;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class StatsServiceTest {
    long[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};

    @Test
    public void testSumAllSales() {
        StatsService service = new StatsService();
        long expected = 180;
        long actual = service.sumAllSales(sales);
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void testAvgSales() {
        StatsService service = new StatsService();
        long expected = 15;
        long actual = service.avgSales(sales);
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void testMinMonthSales() {
        StatsService service = new StatsService();
        long expected = 9; // Месяц с минимальными продажами (9-й месяц)
        long actual = service.minMonthSales(sales);
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void testMaxMonthSales() {
        StatsService service = new StatsService();
        long expected = 6; // Месяц с максимальными продажами (6-й месяц)
        long actual = service.maxMonthSales(sales);
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void testCountMonthWithSalesUnderAverage() {
        StatsService service = new StatsService();
        long expected = 5; // Количество месяцев с продажами ниже среднего
        long actual = service.countMonthWithSalesUnderAverage(sales);
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void testCountMonthWithSalesUpperAverage() {
        StatsService service = new StatsService();
        long expected = 5; // Количество месяцев с продажами выше среднего
        long actual = service.countMonthWithSalesUpperAverage(sales);
        Assertions.assertEquals(expected, actual);
    }
}
