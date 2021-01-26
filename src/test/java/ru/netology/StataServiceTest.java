package ru.netology;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class StataServiceTest {
    //тестовые данные
    int[] purchases = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
    StataService service = new StataService();

    @Test
        //сумма
    void sumSales() {

        int expected = 180;
        int actual = service.SummaSales(purchases);
        assertEquals(expected, actual);
    }

    @Test
        // среднее значение
    void SummaAverage() {
        int actual = service.SummaAverage(purchases);
        int expected = 15;

        assertEquals(expected, actual);
    }

    @Test
        // пик продаж
    void monthMaximumSales() {

        int actual = service.monthMaximumSales(purchases);
        int expected = 8;
        assertEquals(expected, actual);
    }
    @Test
        // минимум продаж
    void monthMinimumSales() {

        int actual = service.monthMinimumSales(purchases);
        int expected = 9;
        assertEquals(expected, actual);
    }
    @Test
        // Кол-во месяцев, в которых продажи были ниже среднего
    void numberMonthsBelowAverageSales() {

        int actual = service.numberMonthsBelowAverageSales(purchases);
        int expected = 5;
        assertEquals(expected, actual);
    }

    @Test
    // Кол-во месяцев, в которых продажи были ниже среднего
    void numberMonthsAboveAverageSales() {

        int actual = service.numberMonthsAboveAverageSales(purchases);
        int expected = 5;
        assertEquals(expected, actual);
    }
}
