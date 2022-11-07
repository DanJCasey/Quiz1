package com.zipcodewilmington.assessment1.part2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/**
 * Created by leon on 2/16/18.
 */
public class MultiplesDeleter {
    /**
     * @param ints array of Integer objects
     * @return all ints which are not divisible by 2
     * given an array of integers, named `ints` return an identical array with evens removed
     */
    public Integer[] deleteEvens(Integer[] ints) {
       ArrayList<Integer> a = new ArrayList<>(Arrays.asList(ints));
        for(int i = 0; i < a.size(); i++){
            int even = a.get(i)%2;
            if(even == 0) {
                a.remove(i);
            }

        }
        Integer[] Integer = new Integer[0];
        return a.toArray(Integer);

        /* int counter = 0;
        for (int i = 0; i < ints.length; i++){
            if(ints[i] % 2 != 0){

            }

        } */
        //return null;
    }

    /**
     * @param ints array of Integer objects
     * @return all ints which are divisible by 2
     * given an array of integers, named `ints` return an identical array with odds removed
     */
    public Integer[] deleteOdds(Integer[] ints) {
        ArrayList<Integer> a = new ArrayList<>(Arrays.asList(ints));
        for(int i = 0; i < a.size(); i++){
            int even = a.get(i)%2;
            if(even != 0) {
                a.remove(i);
            }

        }
        Integer[] Integer = new Integer[0];
        return a.toArray(Integer);
        //return null;
    }

    /**
     * @param ints array of Integer objects
     * @return all ints which are not divisible by 3
     * given an array of integers, named `ints` return an identical array with numbers indivisible by 3 removed
     */
    public Integer[] deleteMultiplesOf3(Integer[] ints) {
        Arrays.sort(ints);
        ArrayList<Integer> a = new ArrayList<>(Arrays.asList(ints));
        for(int i = 0; i < a.size(); i++){
            int even = a.get(i) % 3;
                if(even == 0) {
                    a.remove(i);
            }

        }
        Integer[] Integer = new Integer[0];
        return a.toArray(Integer);

        //return null;
    }

    /**
     * @param ints array of Integer objects
     * @param multiple the multiple to evaluate divisibility against
     * @return all ints which are not divisible by the `multiple` specified
     * given an array of integers, named `ints` return an identical array with numbers indivisible by `multiple` removed
     */
    public Integer[] deleteMultiplesOfN(Integer[] ints, int multiple) {
        Arrays.sort(ints, Collections.reverseOrder());
        ArrayList<Integer> a = new ArrayList<>(Arrays.asList(ints));
        for(int i = 0; i < a.size(); i++){
            int even = a.get(i);
            int result = even % multiple;

            if(result == 0) {
                a.remove(i);

            }

        }
        Integer[] Integer = new Integer[0];
        return a.toArray(Integer);



        /* Arrays.sort(ints);
        ArrayList<Integer> a = new ArrayList<>(Arrays.asList(ints));

        for(int i = 0; i < a.size(); i++){
            int even = a.get(i) % multiple;
            if(even == 0) {

                a.remove(i);
            } else if (even !=0) {
                int newEven = a.get(i) % multiple;
            }

        }
        Integer[] Integer = new Integer[0];
        return a.toArray(Integer); */
        //return null;
    }
}
