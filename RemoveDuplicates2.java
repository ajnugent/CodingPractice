/*
Given an unsorted list of integers, write a function that returns
a new list with all duplicate values removed. This time without converting to a set.
 */

import java.util.*;


public class RemoveDuplicates2 {

    public static <T> ArrayList<T> RemoveDuplicates(ArrayList<T> list){

        //Create a new list
        ArrayList<T> newList = new ArrayList<T>();

        for(T element : list){
            if(!newList.contains(element)){
                newList.add(element);
            }
        }
        return newList;
    }

    public static void main(String [] args){

        //ArrayList with duplicate values
        ArrayList<Integer> list = new ArrayList<>(Arrays.asList(1, 10, 1, 2, 10, 3, 5, 6, 5, 9, 2, 8, 8));

        //Print the Array list with dups
        System.out.println("ArrayList with duplicates: " + list);

        ArrayList<Integer> newList = RemoveDuplicates(list);

        //Print ArrayList with no dups
        System.out.println("ArrayList with no duplicates: " + newList);
    }
}
