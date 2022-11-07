package com.zipcodewilmington.assessment1.part2;

import java.sql.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

/**
 * Created by leon on 2/16/18.
 */
public class ArrayUtils {
    /**
     * @param objectArray   an array of any type of Object
     * @param objectToCount any non-primitive value
     * @return the number of times the specified `value` occurs in the specified `objectArray`
     * Given an array of objects, named `objectArray`, and an object `objectToCount`, return the number of times the `objectToCount` appears in the `objectArray`
     */
    public static Integer getNumberOfOccurrences(Object[] objectArray, Object objectToCount) {
        int occurrences = 0;
        for(int i = 0; i < objectArray.length; i++){
            if (objectArray[i] == objectToCount) {
                occurrences++;
            }
        }
        return occurrences;
        //return null;
    }

    /**
     * @param objectArray    an array of any type of Object
     * @param objectToRemove a value to be removed from the `objectArray`
     * @return an array with identical content excluding the specified `objectToRemove`
     * Given an array of objects, name `objectArray`, and an object `objectToRemove`, return an array of objects with identical contents excluding `objectToRemove`
     */
    public static Integer[] removeValue(Integer[] objectArray, Integer objectToRemove) {
        List<Integer> list = new ArrayList<Integer>(Arrays.asList(objectArray));
        list.removeAll(Arrays.asList(objectToRemove));
        objectArray = list.toArray(new Integer[0]);
        return objectArray;


        /*int i, j;
        for (i = 0, j = 0; j < objectArray.length; j++) {
            if (!objectArray[j].equals(objectToRemove)) {
                objectArray[i++] = objectArray[j];
            }
            objectArray = Arrays.copyOf(objectArray, i);
            for (int ind = 0; ind < objectArray.length; ind++) {
                return new Integer[]{objectArray[ind]};
            } */


            // struggling with object vs int casting stuff
        /*ArrayList<Integer> arr = new ArrayList<>();
        for(int i = 0; i < objectArray.length; i++) {
            if(objectArray[i] != objectToRemove){
                arr.add((Integer) objectArray[i]);
            }
        }

        return arr.toArray(); */
            //return null;
        }

    /**
     * @param objectArray an array of any type of Object
     * @return the most frequently occurring object in the array
     * given an array of objects, named `objectArray` return the most frequently occuring object in the array
     */
    public static Object getMostCommon(Object[] objectArray) {
        Object mode = objectArray[0];
        int maxCount = 0;
        for (int i = 0; i < objectArray.length; i++){
            Object value = objectArray[i];
            int count = 1;
            for(int j = 0; j < objectArray.length; j++){
                if(objectArray[j] == value) count++;
                if (count > maxCount) {
                    mode = value;
                    maxCount = count;
                }
            }
        }
        return mode;
        //return null;
    }


    /**
     * @param objectArray an array of any type of Object
     * @return the least frequently occurring object in the array
     * given an array of objects, named `objectArray` return the least frequently occuring object in the array
     */
    public static Object getLeastCommon(Object[] objectArray) {
         Arrays.sort(objectArray);
        int n = objectArray.length;
        int minCount = n + 1, res = - 1;
        int current = 1;
        for (int i = 1; i < n; i++) {
            if (objectArray[i] == objectArray[i - 1]) {
                current++;
            }
             else if (current < minCount) {
                minCount = current;
                res = (int) objectArray[i];
            }
            current = 1;
        }
        if (current < minCount) {
            minCount = current;
            res = (int)objectArray[n - 1];
        }
        return res;
        //return null;
    }

    /**
     * @param objectArray      an array of any type of Object
     * @param objectArrayToAdd an array of Objects to add to the first argument
     * @return an array containing all elements in `objectArray` and `objectArrayToAdd`
     * given two arrays `objectArray` and `objectArrayToAdd`, return an array containing all elements in `objectArray` and `objectArrayToAdd`
     */
    public static Integer[] mergeArrays(Integer[] objectArray, Integer[] objectArrayToAdd) {
        Arrays.sort(objectArray);
        Arrays.sort(objectArrayToAdd);
        ArrayList<Integer> objList = new ArrayList<>(Arrays.asList(objectArray));
        ArrayList<Integer> toAddList = new ArrayList<>(Arrays.asList(objectArrayToAdd));
        objList.addAll(toAddList);
        Integer[] finalArr = objList.toArray(new Integer[0]);
        return finalArr;




        /*int objLength = objectArray.length;
        int toAddLength = objectArrayToAdd.length;
        int totalLength = objLength + toAddLength;
        Integer[] newArr = new Integer[totalLength];
        System.arraycopy(objectArray, 0, newArr, 0, objLength);
        System.arraycopy(objectArrayToAdd, 0, newArr, 0, toAddLength);
        Arrays.sort(newArr);
        return newArr; */

        /* Integer[] intArray = Arrays.copyOf(objectArray, objectArray.length, Integer[].class);
        Integer[] toAddArray = Arrays.copyOf(objectArrayToAdd, objectArrayToAdd.length, Integer[].class);
        return (Integer[]) Stream.concat(Arrays.stream(intArray), Arrays.stream(toAddArray)).toArray(); */

         /* ArrayList<Integer> a = new ArrayList<>(Arrays.asList(objectArray));
        ArrayList<Integer> b = new ArrayList<>(Arrays.asList(objectArrayToAdd));
        a.addAll(b);
        return (Integer[]) a.toArray(); */


        //return null;
    }
}
