package com.ssdl.dsa.sorting;

import static org.junit.jupiter.api.Assertions.assertTrue;
import com.ssdl.dsa.util.Util;
import org.junit.jupiter.api.Test;

public class SortingTest {

    Util util = new Util();
    //SortingAlgorithm sortingAlgo = new BubbleSort();
    
    //SortingAlgorithm sortingAlgo = new InsertionSort();
    
    SortingAlgorithm sortingAlgo = new ShellSort();

    @Test
    public void testEmptyElement() {
        int[] arr = {};
        sortingAlgo.sort(arr);
        assertTrue(util.isArraySorted(arr));
    }
    
    @Test
    public void testSingleElement()
    {
        int[] arr = {3};
        sortingAlgo.sort(arr);
        assertTrue(util.isArraySorted(arr));
    }
    
    @Test
    public void testDoubleElement()
    {
        int[] arr = {3, 2};
        sortingAlgo.sort(arr);
        assertTrue(util.isArraySorted(arr));
    }
    
    @Test
    public void testBubbleSort()
    {
        int[] arr = {3, 2, 1};
        sortingAlgo.sort(arr);
        assertTrue(util.isArraySorted(arr));
    }
    
    @Test
    public void testBubbleSortRandomData()
    {
        int[] arr = util.createRandomArray(20);
        System.out.println("Input " + util.arrayToString(arr));
        sortingAlgo.sort(arr);
        System.out.println("Sorted " + util.arrayToString(arr));
        assertTrue(util.isArraySorted(arr));
    }
}
