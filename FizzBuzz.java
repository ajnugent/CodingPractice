/*
Write a program that prints the numbers from 1 to 100.
If a number is divisible by 3, print "Fizz" instead of the number,
if a number is divisible by 5, print "Buzz" instead of the number,
and if a number is divisible by both 3 and 5, print "FizzBuzz" instead of the number.
 */

public class FizzBuzz {

    public static void Buzz(){

        for( int i = 0; i < 100; i++){
            if(i % 3 == 0){
                System.out.println("Fizz");
            }
            if(i % 5 == 0){
                System.out.println("Buzz");
            }
            else if(i % 3 != 0 && i % 5 != 0){
                System.out.println(i);
            }
        }
    }

    public static void main (String [] args){

        Buzz();

    }

}
