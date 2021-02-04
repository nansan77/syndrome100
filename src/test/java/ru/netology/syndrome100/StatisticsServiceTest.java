package ru.netology.syndrome100;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

      class StatisticsServiceTest {

        @Test
        void findMax() {
            StatisticsService service = new StatisticsService();

            long[] incomesInBillions = {12, 5, 8, 4, 5, 3, 8, 6, 11, 11, 12};
            long expected = 12;

            long actual = service.findMax(incomesInBillions);

            assertEquals(expected, actual);
        }
          @Test
          void  findMaxtwo() {
              StatisticsService service = new StatisticsService();
              long[] incomesInBillions = {1,14,9,11,8,6,12};
              long expected = 14;
              long actual = service.findMax(incomesInBillions);
              assertEquals(expected, actual);
          }
          @Test
          void  findMaxthree() {
              StatisticsService service = new StatisticsService();
              long[] incomesInBillions = {50, 150, 222, 111, 187};
              long expected = 222;
              long actual = service.findMax(incomesInBillions);
              assertEquals(expected, actual);
          }
      }

