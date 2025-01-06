/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.ssdl.dsa.sorting;
import com.ssdl.dsa.util.Util;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;

/**
 *
 * @author Lenovo
 */
public class MergeSortTest {
    
    @Test
    public void testMerge()
    {
        MergeSort algo = new MergeSort();
        
        int[] arr1 = {1,4};
        int[] arr2 = {2,5};
        
        int result[] = algo.merge(arr1, arr2);
        assertEquals(4, result.length);
        //assertTrue(util.isArraySorted(result));
    }
}
