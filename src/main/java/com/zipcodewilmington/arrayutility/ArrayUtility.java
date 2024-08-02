package com.zipcodewilmington.arrayutility;


import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Stream;

/**
 * Created by leon on 3/6/18.
 */
public class ArrayUtility<T> {

    List<T> arr = new ArrayList<>();
    T[]input;

    public ArrayUtility(T[] inputArray) {
        input = inputArray;

//        List<T> newArr = new ArrayList<>();
//        for (T element : inputArray){
//            newArr.add(element);
//        }
//        arr = newArr;

        //NOTE: this is a concise version of above
        arr = new ArrayList<>(Arrays.asList(inputArray));


    }

    public Integer countDuplicatesInMerge(T[] arrayToMerge, T valueToEvaluate) {
        Collections.addAll(arr, arrayToMerge);

        return getNumberOfOccurrences(valueToEvaluate);
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

        Collections.addAll(arr, arrayToMerge);

        T common = null;
        int count = 0;
        int maxCount = 0;
            for (int i = 0; i < arr.size(); i++){
                for (int j =0; j < arr.size(); j++){
                    if (arr.get(i).equals(arr.get(j))){
                        count++;
                    }
                    if (count > maxCount){
                        common = arr.get(i);
                        maxCount = count;
                    }
                    if (j == arr.size()-1){
                        count =0;
                    }
                }
            }
        return common;
    }

    public T[] removeValue(T valueToRemove) {
        for (int i = 0; i< arr.size(); i++){
            if (arr.get(i) == valueToRemove){
                arr.remove(i);
            }
        }

        return this.arr.toArray(Arrays.copyOf(input, arr.size()));
    }
}
