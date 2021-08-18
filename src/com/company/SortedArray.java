package com.company;

import java.util.Arrays;
import java.util.Scanner;

public class SortedArray {

    public static int[] getIntegers(int number){
        Scanner scanner = new Scanner(System.in);
        int[] numbers = new int[number];
        for(int i=0;i<numbers.length;i++){
            numbers[i]= scanner.nextInt();
        }
        return numbers;
    }

    public static void printArray(int [] array){
        for(int i=0; i< array.length;i++){
            System.out.println("Element " + i + " contents "+array[i]);
        }
    }
    public static int[] sortIntegers(int [] array){
        int temp;
        int [] sortedArray = new int[array.length];


        for(int x = 0; x<array.length;x++){
            sortedArray[x]=array[x];
        }
        // int [] sortedArray = Arrays.copyOf(array,array.length);
        for (int i = 0; i < sortedArray.length; ++i)
        {
            for (int j = i + 1; j < sortedArray.length; ++j)
            {
                if (sortedArray[i] < sortedArray[j])
                {
                    temp = sortedArray[i];
                    sortedArray[i] = sortedArray[j];
                    sortedArray[j] = temp;
                }
            }
        }
        return sortedArray;
    }
    public  void reverse(int [] array){
        int n= array.length;
        System.out.println(Arrays.toString(array));

        for(int i=0;i<=n/2;i++){
            int temp = array[i];
            array[i] = array[n-1-i];
            array[n-1-i] = temp;
        }
        System.out.println(Arrays.toString(array));


    }
}