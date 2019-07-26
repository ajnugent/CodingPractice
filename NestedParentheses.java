/*
You are given a string that contains left and right parenthesis characters.
Write code to determine whether the parentheses are correctly nested.
For example, the strings "(())" and "()()" are correct but "(() ()" and ") (" are not.
 */

import java.util.Scanner;

public class NestedParentheses {

    public static boolean checkNesting(String s){
        int count = 0;
        for(int i = 0; i < s.length(); ++i){
            char ch = s.charAt(i);
            if( ch == '('){
                ++count;
            }else if ( ch == ')'){
                --count;
                if (count < 0) return false;
            }
        }
        return count == 0;
    }

    public static void main(String []args){

        Scanner in = new Scanner(System.in);

        System.out.println("Please enter parentheses: ");

        String s = in.nextLine();

        Boolean check = checkNesting(s);

        if (check==true){
            System.out.println("Correctly Nested");
        }else{
            System.out.println("Not correctly Nested");
        }
    }

}
