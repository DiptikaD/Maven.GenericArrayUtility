package com.zipcodewilmington.arrayutility;


import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

/**
 * Created by leon on 3/6/18.
 */
public class ArrayUtility<T> {

    T[] arr;

    public ArrayUtility(T[] inputArray) {
//        ArrayList<T> newArr = (ArrayList<T>) Arrays.asList(inputArray);
//
//        ArrayList<T> al =
//                new ArrayList<T>(Arrays.asList(inputArray));
        arr = inputArray;
    }

    public Integer countDuplicatesInMerge(T arr, T valueToEvaluate) {
    return null;
    }

    public Integer getNumberOfOccurrences(T valueToEvaluate) {
        Integer counter =0;

        for (T element : this.arr){
            if (element == valueToEvaluate){
               counter++;

            }
        }
        return counter;
    }

    public T getMostCommonFromMerge(T[] arrayToMerge) {
//        T[] newCopy = Arrays.copyOf(arrayToMerge, arrayToMerge.length + arr.length);
//        ArrayList<T> newnewCopy = new ArrayList<>();
//        @SuppressWarnings("unchecked")
//        T[] both = Stream.concat(Arrays.stream(arrayToMerge), Arrays.stream(arr)).toArray(
//                size -> (T[]) Array.newInstance(arr.getClass().getComponentType(), size));

        // ????????????????????????
        T common = null;
        int count = 0;
        int maxCount = 0;
            for (int i = 0; i < arrayToMerge.length; i++){
                for (int j =0; j < arrayToMerge.length; j++){
                    if (arrayToMerge[i].equals(arrayToMerge[j])){
                        count++;
                    }
                    if (count > maxCount){
                        common = arrayToMerge[i];
                    }
                }
            }
        return common;
        }

}
