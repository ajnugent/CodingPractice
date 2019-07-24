/*
Create a simple function that returns the maximum value stored in an array of nonnegative integers
 */


public class FindMax {

    public static int findMax(int array[]){

        int maxValue, i;

        //Make sure there is at least one element in the array
        if(array.length <= 0){
            System.out.println("Array empty");
        }

        //Set the largest number to the first value of the array and compare from there
        maxValue = array[0];
        for( i = 1; i < array.length; i++){
            if(array[i] > maxValue){
                maxValue = array[i];
            }
        }
        return maxValue;
    }

    public static void main(String []args){

        int array[] = {54, 9, 12, 53};

        System.out.println(findMax(array));
    }
}
