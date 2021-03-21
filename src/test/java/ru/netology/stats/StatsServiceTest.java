package ru.netology.stats;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class StatsServiceTest {
    int[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};

    @Test
        //Сумма всех продаж
    void calculateSum() {
        StatsService service = new StatsService();
        int expected = 180;
        int actual = service.calculateSum(sales);
        System.out.println("Сумма всех продаж: " + actual);
        assertEquals(expected, actual);
    }

    @Test
        //Средняя сумма продаж за 12 месяцев
    void averageSum() {
        StatsService service = new StatsService();
        int expected = 15;
        int actual = service.averageSum(sales);
        System.out.println("Средняя сумма продаж в месяц: " + actual);
        assertEquals(expected, actual);
    }

    @Test
        //Номер месяца, в котором был пик продаж
    void salesMaxMonth() {
        StatsService service = new StatsService();
        int expected = 8;
        int actual = service.salesMaxMonth(sales);
        System.out.println("Номер месяца, в котором был пик продаж: " + actual);
        assertEquals(expected, actual);
    }

    @Test
        //Номер месяца, в котором был минимум продаж
    void salesMinMonth() {
        StatsService service = new StatsService();
        int expected = 9;
        int actual = service.salesMinMonth(sales);
        System.out.println("Номер месяца, в котором был минимум продаж: " + actual);
        assertEquals(expected, actual);
    }

    @Test
        //Количество месяцев, в которых продажи были ниже среднего
    void monthUnderAverageSum() {
        StatsService service = new StatsService();
        int expected = 5;
        int actual = service.monthUnderAverageSum(sales);
        System.out.println("Количество месяцев, в которых продажи были ниже среднего: " + actual);
        assertEquals(expected, actual);
    }

    @Test
        //Количество месяцев, в которых продажи были выше среднего
    void monthOverAverageSum() {
        StatsService service = new StatsService();
        int expected = 5;
        int actual = service.monthOverAverageSum(sales);
        System.out.println("Количество месяцев, в которых продажи были выше среднего: " + actual);
        assertEquals(expected, actual);
    }
}