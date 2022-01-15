package ru.vsu.cs.sviridov_d_v;

import ru.vsu.cs.sviridov_d_v.Utils.ArrayUtils;
import org.junit.Test;
import org.junit.Assert;

public class PermutationStringsAndColumnsTest {

    PermutationStringsAndColumns permutationStringsAndColumns = new PermutationStringsAndColumns();

    @Test
    public void testPermutationStringsAndColumns1() {
        int [][] arr = ArrayUtils.readIntArray2FromFile("src/testFiles/testInput01");
        int [][] expectedResult = ArrayUtils.readIntArray2FromFile("src/testFiles/testOutput01");
        int [][] realResult = permutationStringsAndColumns.permutateStringsAndColumns(arr);

        Assert.assertArrayEquals(expectedResult, realResult);
    }

    @Test
    public void testPermutationStringsAndColumns2() {
        int [][] arr = ArrayUtils.readIntArray2FromFile("src/testFiles/testInput02");
        int [][] expectedResult = ArrayUtils.readIntArray2FromFile("src/testFiles/testOutput02");
        int [][] realResult = permutationStringsAndColumns.permutateStringsAndColumns(arr);

        Assert.assertArrayEquals(expectedResult, realResult);
    }

    @Test
    public void testPermutationStringsAndColumns3() {
        int [][] arr = ArrayUtils.readIntArray2FromFile("src/testFiles/testInput03");
        int [][] expectedResult = ArrayUtils.readIntArray2FromFile("src/testFiles/testOutput03");
        int [][] realResult = permutationStringsAndColumns.permutateStringsAndColumns(arr);

        Assert.assertArrayEquals(expectedResult, realResult);
    }

    @Test
    public void testPermutationStringsAndColumns4() {
        int [][] arr = ArrayUtils.readIntArray2FromFile("src/testFiles/testInput04");
        int [][] expectedResult = ArrayUtils.readIntArray2FromFile("src/testFiles/testOutput04");
        int [][] realResult = permutationStringsAndColumns.permutateStringsAndColumns(arr);

        Assert.assertArrayEquals(expectedResult, realResult);
    }

    @Test
    public void testPermutationStringsAndColumns5() {
        int [][] arr = ArrayUtils.readIntArray2FromFile("src/testFiles/testInput05");
        int [][] expectedResult = ArrayUtils.readIntArray2FromFile("src/testFiles/testOutput05");
        int [][] realResult = permutationStringsAndColumns.permutateStringsAndColumns(arr);

        Assert.assertArrayEquals(expectedResult, realResult);
    }

}
