package ru.netology.stats;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class StatsServiceTest {
    int[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
    @Test
    public void testSumAllSales() {
        StatsService service = new StatsService();
        int expected = 180;
        int actual = service.sumAllSales(sales);
        Assertions.assertEquals(expected,actual);
    }
    @Test
    public void testAvgSales() {
        StatsService service = new StatsService();
        int expected = 15;
        int actual = service.avgSales(sales);
        Assertions.assertEquals(expected,actual);
    }
    @Test
    public void testMinSales() {
        StatsService service = new StatsService();
        int expected = 9;
        int actual = service.minMonthSales(sales);
        Assertions.assertEquals(expected,actual);
    }
    @Test
    public void testMaxSales() {
        StatsService service = new StatsService();
        int expected = 8;
        int actual = service.maxMonthSales(sales);
        Assertions.assertEquals(expected,actual);
    }
    @Test
    public void testCountMonthWithSalesUnderAverage(){
        StatsService service = new StatsService();
        int expected = 5;
        int actual = service.countMonthWithSalesUnderAverage(sales);
        Assertions.assertEquals(expected,actual);
    }
    @Test
    public void testCountMonthWithSalesUpperAverage(){
        StatsService service = new StatsService();
        int expected = 5;
        int actual = service.countMonthWithSalesUpperAverage(sales);
        Assertions.assertEquals(expected,actual);
    }
}