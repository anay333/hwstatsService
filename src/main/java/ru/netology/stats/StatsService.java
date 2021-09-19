package ru.netology.stats;

public class StatsService {
    public long calcSum(long[] sales) {
        long sum = 0;
        for (long sale : sales) {
            sum += sale;
        }
        return sum;
    }

    public long calcAverage(long[] sales) {
        long sum = calcSum(sales);
        return sum / sales.length;
    }

    public long maxMonth(long[] sales) {
        int maxMonth = 0;
        int index = 0;
        for (long sale : sales) {
            if (sale >= sales[maxMonth]) {
                maxMonth = index;
            }
            index = index + 1;
        }
        return maxMonth + 1;
    }

    public long minMonth(long[] sales) {
        int minMonth = 0;
        int month = 0;
        for (long sale : sales) {
            if (sale <= sales[minMonth]) {
                minMonth = month;
            }
            month = month + 1;
        }
        return minMonth + 1;
    }

    public long amtUnderAverage(long[] sales) {
        long sum = calcSum(sales);
        int amtUnderAverage = 0;
        for (long sale : sales) {
            if (sale < sum / sales.length) {
                amtUnderAverage = amtUnderAverage + 1;
            }

        }
        return amtUnderAverage;
    }

    public long amtOverAverage(long[] sales) {
        long sum = calcSum(sales);
        int amtOverAverage = 0;
        for (long sale : sales) {
            if (sale > sum / sales.length) {
                amtOverAverage = amtOverAverage + 1;
            }

        }
        return amtOverAverage;
    }
}
