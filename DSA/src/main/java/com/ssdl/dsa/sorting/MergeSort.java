/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.ssdl.dsa.sorting;

/**
 *
 * @author Lenovo
 */
public class MergeSort {
    
    public int[] merge(int[] arr1, int[] arr2)
    {
        int result[] = new int[arr1.length + arr2.length];
        int i = 0;
        int j = 0;
        
        int k = 0;
        while(i < arr1.length || j < arr2.length )
        {
            if(arr1[i] == arr2[j])
            {
                result[k++] = arr1[i++];
                result[k++] = arr2[j++];
            }
            else if(arr1[i] < arr2[j])
            {
                result[k++] = arr1[i++];
            }
            else
            {
                result[k++] = arr2[j++];
            }
        }
        
        while(i < arr1.length)
        {
            result[k++] = arr1[i++];
        }
        
        while(j < arr2.length)
        {
            result[k++] = arr2[j++];
        }
        return result;
    }
}
