package ru.netology;

import javax.xml.transform.Result;

public class StataService {
    //сумма продаж
    public int SummaSales(int[] purchases) {
        int result = 0;
        for (int purchase : purchases) {

            result += purchase;
        }
        return result;
    }

    // средняя сумма продаж
    public int SummaAverage(int[] purchases) {

        int sum = SummaSales(purchases);

        int result = sum / purchases.length; /// длина массива

        return result;

    }

    //месяц пика продаж
    public int monthMaximumSales(int[] purchases) {
        int month = 0;
        int max = purchases[0];
        for (int purchase : purchases) {
            if (max < purchase) {
                max = purchase;
            }
        }
        int monthMaxmumSales = 0;
        int monthCount = 0;
        //инкремент
        for (int purchase : purchases) {
            monthCount++;
            if (purchase == max) {
                monthMaxmumSales = monthCount;
            }
        }

        return monthMaxmumSales;
    }

    //месяц минимума продаж
    public int monthMinimumSales(int[] purchases) {
        int monthCount = 0;
        int max = purchases[0];
        for (int purchase : purchases) {
            if (max > purchase) {
                max = purchase;
            }
        }
        int monthMinimumSales = 0;

        for (int purchase : purchases) {
            monthCount++;  //инкремент
            if (purchase == max) {
                monthMinimumSales = monthCount;
            }
        }

        return monthMinimumSales;
    }

    //Кол-во месяцев, в которых продажи были ниже среднего
    public int numberMonthsBelowAverageSales(int[] purchases) {
        int month = 0;
        int SummaAverage = SummaAverage(purchases);
        for (int purchase : purchases) {
            if (SummaAverage < purchase) {
                month++;
            }
        }
        return  month;
    }


    //Кол-во месяцев, в которых продажи были выше среднего
    public int numberMonthsAboveAverageSales(int[] purchases) {
        int month = 0;
        int SummaAverage = SummaAverage(purchases);
        for (int purchase : purchases) {
            if (SummaAverage > purchase) {
                month++;
            }
        }
        return  month;
    }
}
