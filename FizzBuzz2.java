/*
Write a program that prints the numbers from 1 to 100.
If a number is divisible by 3, print "Fizz" instead of the number,
if a number is divisible by 5, print "Buzz" instead of the number,
and if a number is divisible by both 3 and 5, print "FizzBuzz" instead of the number.
 */

// Cleaner version using Boolean values.  Allows for "FizzBuzz" to be on one line

public class FizzBuzz2 {

    public static void FizzBuzz(){
        for(int i = 0; i < 100; i++){
            Boolean divThree = (i % 3 == 0);
            Boolean divFive = (i % 5 == 0);

            if(divThree && divFive){
                System.out.println("FizzBuzz");
            }
            else if(divThree){
                System.out.println("Fizz");
            }
            else if(divFive){
                System.out.println("Buzz");
            }else{
                System.out.println(i);
            }

        }

    }

    public static void main(String []args){
        FizzBuzz();
    }
}
