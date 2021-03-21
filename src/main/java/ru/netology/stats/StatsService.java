package ru.netology.stats;


public class StatsService {

    //Сумма всех продаж
    public int calculateSum(int[] sales) {
        int sum = 0;
        for (int sale : sales) {
            sum = sum + sale;
        }
        return sum;
    }
    //Средняя сумма продаж за 12 месяцев
    public int averageSum(int[] sales) {
        int sum = calculateSum(sales);
        int sumAverage = sum / sales.length;
        return sumAverage;
    }

    //Номер месяца, в котором был пик продаж
    public int salesMaxMonth(int[] sales) {
        int currentMax = sales[0];
        int month = 0;
        int maxMonth = 0;
        for (int sale : sales) {
            month = month + 1;
            if (currentMax <= sale) {
                currentMax = sale;
                maxMonth = month;
            }
        }
        return maxMonth;
    }

    //Номер месяца, в котором был минимум продаж
    public int salesMinMonth(int[] sales) {
        int currentMin = sales[0];
        int month = 0;
        int minMonth = 0;
        for (int sale : sales) {
            month = month + 1;
            if (currentMin >= sale) {
                currentMin = sale;
                minMonth = month;
            }
        }
        return minMonth;
    }

    //Кол-во месяцев, в которых продажи были ниже среднего
    public int monthUnderAverageSum(int[] sales) {
        int average = averageSum(sales);
        int monthCount = 0;
        for (int sale : sales) {
            if (sale < average)
                monthCount = monthCount + 1;
        }
        return monthCount;
    }

    //Количество месяцев, в которых продажи были выше среднего
    public int monthOverAverageSum(int[] sales) {
        int average = averageSum(sales);
        int monthCount = 0;
        for (int sale : sales) {
            if (sale > average)
                monthCount = monthCount + 1;
        }
        return monthCount;
    }
}



