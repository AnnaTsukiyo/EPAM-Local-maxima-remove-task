package com.epam.rd.autotasks.arrays;

import com.epam.rd.autotasks.arrays.LocalMaximaRemove;
import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class Tests {

    @Test
    public void removeLocalMaximaTest(){
        int[] array = new int[]{-3, 2, 4, 3, 5, 12, 8};
        int[] expected = new int[]{-3, 2, 3, 5, 8};
        int[] actual = LocalMaximaRemove.removeLocalMaxima(array);

        assertArrayEquals(expected, actual);

        array = new int[]{18, 1, 3, 6, 7, -5};
        expected = new int[]{1, 3, 6, -5};
        actual = LocalMaximaRemove.removeLocalMaxima(array);

        assertArrayEquals(expected, actual);

        array = new int[1000];
        Arrays.fill(array, 15);
        array[0] = 20;
        array[999] = 25;
        array[168] = 30;
        actual = LocalMaximaRemove.removeLocalMaxima(array);

        assertEquals(997, actual.length);
        assertEquals(15, actual[0]);
        assertEquals(15, actual[996]);

        array = new int[]{100, 0};
        expected = new int[]{0};
        actual = LocalMaximaRemove.removeLocalMaxima(array);

        assertArrayEquals(expected, actual);

        array = new int[]{10, 900};
        expected = new int[]{10};
        actual = LocalMaximaRemove.removeLocalMaxima(array);

        assertArrayEquals(expected, actual);

        array = new int[1000];
        Arrays.fill(array, 10);
        for (int i = 0; i < array.length; i+=2){
            array[i] = 20;
        }
        actual = LocalMaximaRemove.removeLocalMaxima(array);

        assertEquals(500, actual.length);
        assertEquals(10, actual[0]);

        array = new int[15000];
        Arrays.fill(array, 10);
        actual = LocalMaximaRemove.removeLocalMaxima(array);

        assertArrayEquals(array, actual);

        array = new int[500];
        Arrays.fill(array, 0, 99, 150);
        Arrays.fill(array, 100, 199, 50);
        Arrays.fill(array, 200, 299, 15);
        Arrays.fill(array, 300, 399, 55);
        Arrays.fill(array, 400, 499, 500);
        actual = LocalMaximaRemove.removeLocalMaxima(array);

        assertArrayEquals(array, actual);
    }
}
