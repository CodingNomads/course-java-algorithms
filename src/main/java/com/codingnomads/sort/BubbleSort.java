package com.codingnomads.sort;

/**
 * Implement a custom bubble sort:
 * https://www.geeksforgeeks.org/bubble-sort/
 */

public class BubbleSort {
    public static void main(String[] args) {

        int [] array = {5,6,12244,3,2,6,2,1,22,11,4444,5,6,7,-1,-6666,2,1,434234,-54644,0};

        array = sortArrayRecursive(array, array.length);
        //array = sortArray(array);


        for(int val : array){
            System.out.print(val + " ");
        }
    }

    public static int[] sortArrayRecursive(int [] array, int length){

        if (length == 0)
            return array;

        int index = 1;

        while(index < length){

            if(array[index -1] > array[index]){
                int temp = array[index - 1];
                array[index - 1] = array[index];
                array[index] = temp;
            }

            ++index;
        }

        sortArrayRecursive(array,length -1);

        return array;
    }

    public static int[] sortArray(int [] array){

        for (int i = 0; i < array.length - 1; i++) {

            for (int j = 0; j < array.length - i - 1 ; j++) {

                if(array[j] > array[j + 1] ){
                    int temp = array[j];

                    array[j] = array[j + 1];

                    array[j + 1] = temp;
                }
            }
        }

        return array;
    }
}
