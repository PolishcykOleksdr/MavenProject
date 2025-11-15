package com.oleksandr;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

/**
 * Unit test for simple App.
 */
public class AppTest {
    @Test
    void shouldGiveAnswerOfAddOperation(){
        Assertions.assertEquals(4, App.add(2,2));

        for (int i = 0, j = 0; i < 10; i++, j+=2) {
            Assertions.assertEquals(j + i, App.add(j,i));
        }
    }
    @Test
    void shouldGiveAnswerOfSubtractOperation(){
        Assertions.assertEquals(0, App.subtract(4,4));

        for (int i = 0, j = 0; i < 10; i++, j+=2) {
            Assertions.assertEquals(j - i, App.subtract(j,i));
        }
    }
    @Test
    void shouldGiveAnswerOfMultiplyOperation(){
        Assertions.assertEquals(4, App.multiply(2,2));

        for (int i = 0, j = 0; i < 10; i++, j+=2) {
            Assertions.assertEquals(j * i, App.multiply(j,i));
        }
    }
    @Test
    void shouldGiveAnswerOfDivideOperation(){
        Assertions.assertEquals(1, App.divide(4,4));

        for (float i = 1, j = 1; i < 10; i++, j+=2) {
            Assertions.assertEquals(j / i, App.divide(j,i));
        }
    }
}
