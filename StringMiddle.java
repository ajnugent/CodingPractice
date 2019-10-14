import java.util.Scanner;

public class StringMiddle {

    public static void returnMiddle(String str){

        if(str.length() <= 3){

            System.out.println("Result: " + str);

        }else if(str.length() % 2 == 0){

            System.out.println("String is of even length: INVALID");

        }else{

            int middle = str.length() / 2;

            System.out.println("Result: " + str.substring(middle - 1, middle + 2));
        }

    }
    public static void main(String [] args){

        Scanner in = new Scanner(System.in);
        System.out.println("Please enter an ODD length string: ");
        String n = in.nextLine();
        returnMiddle(n);

    }
}
