import java.util.Scanner;

/*
Write a function that reverses a string without using any library functions
 */

public class ReverseString {

    public static void reverseString(String s){

       /*
       //If you were to use the library function, this is an example
        StringBuilder reverse = new StringBuilder(s);
        reverse.reverse();
        System.out.println(reverse);
        */

        StringBuilder reverse = new StringBuilder(s.length());

        for(int i = s.length()-1; i >= 0; --i){
            reverse.append(s.charAt(i));
        }
       System.out.println(reverse);

    }

    public static void main(String [] args){

        Scanner in = new Scanner(System.in);

        System.out.println("Please enter a string: ");

        String s = in.nextLine();

        reverseString(s);

    }
}
