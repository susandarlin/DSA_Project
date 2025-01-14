package com.ssdl.dsa.sorting;

import com.ssdl.dsa.util.Util;
import static org.junit.jupiter.api.Assertions.assertTrue;
import org.junit.jupiter.api.Test;

public class QuickSortTest {
    Util util = new Util();
    QuickSort algo = new QuickSort();
    
    @Test
    public void testPartitionIssue()
    {
        //int[] arr = {97, 106, 119, 250, 111};
        
        int[] arr = {50, 60, 70, 10, 20, 30, 40};
        
        
        int pivotIndex = algo.findPivot(arr, 2, arr.length - 1);
        
        System.out.println("PivotIndex "+ pivotIndex);
        System.out.println("Pivot "+arr[pivotIndex]);
        System.out.println("Partitoned "+util.arrayToString(arr));
        
        assertPivotIsCorrect(arr, pivotIndex, 2, arr.length - 1);
    }
    
    @Test
    public void testBoundaryCase()
    {
        int[]arr = {209 ,64,8 ,186 ,33 ,9 };
        
        int pivotIndex = algo.findPivot(arr,0,arr.length-1);
        
        System.out.println("Pivot "+arr[pivotIndex]);
	System.out.println("Partitoned "+util.arrayToString(arr));
                
        assertPivotIsCorrect(arr, pivotIndex,0,arr.length-1);
    }
    
    @Test
    public void testPartitionRandomData()
    {
        int[] arr = util.createRandomArray(5);
        
        System.out.println("Before "+util.arrayToString(arr));
        
        int pivotIndex = algo.findPivot(arr, 0, arr.length - 1);
        
        System.out.println("Pivot "+arr[pivotIndex]);
	System.out.println("Partitoned "+util.arrayToString(arr));
                
        assertPivotIsCorrect(arr, pivotIndex, 0, arr.length - 1);
    }
    
    private void assertPivotIsCorrect(int[] arr, int pivotIndex, int start, int end)
    {
        int pivot = arr[pivotIndex];
        for(int i = start; i <= pivotIndex; i++)
        {
            assertTrue(arr[i] <= pivot);
        }
        
        for(int i = pivotIndex + 1; i < end; i++)
        {
            assertTrue(arr[i] >= pivot);
        }
    }
    
    @Test
    public void testQuickSort()
    {
        int []arr = {8, 7, 2, 1, 0, 9, 6};
        
        System.out.println("Before "+util.arrayToString(arr));
        
        algo.sort(arr, 0, arr.length - 1);
        
        System.out.println("After "+util.arrayToString(arr));
        
        assertTrue(util.isArraySorted(arr));
    }
}
