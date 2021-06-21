package com.epam.rd.autotasks.arrays;

import com.epam.rd.autotasks.arrays.LocalMaximaRemove;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

public class Tests {

    @Test
    public void removeTest(){
        int[] array = new int[]{1, -3, 2, 4, 3, 5, 12, 8};
        int[] expected = new int[]{-3, 2, 3, 5, 8};

        int[] actual = LocalMaximaRemove.remove(array);

        assertArrayEquals(expected, actual);
    }
}
