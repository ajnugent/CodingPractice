/*
Given an unsorted list of integers, write a function that returns
a new list with all duplicate values removed.
 */

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedHashSet;
import java.util.Set;

public class RemoveDuplicates {

    public static<T> ArrayList<T> RemoveDuplicates(ArrayList <T> list) {

        //Convert the list to a set: the set will automatically remove all duplicates
        Set<T> set = new LinkedHashSet<>();

        //Add the elements to the set
        set.addAll(list);

        //Clear the list
        list.clear();

        //add the elements of set with no duplicates to the list
        list.addAll(set);

        //return the list
        return list;

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
