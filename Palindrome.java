import java.util.Scanner;

//Check to see if a String is a palindrome.
//Just reverse the string and compare it to the original

public class Palindrome {

    private static void  checkPalindrome(String word){

        String lowercase = word.toLowerCase();
        System.out.println(lowercase);
        int length = word.length();
        String reverse = "";

        for(int i = length -1; i >= 0; i--){
            reverse = reverse + lowercase.charAt(i);
        }

        if(reverse.equals(lowercase)){
            System.out.println("This word is a Palindrome");
        }else{
            System.out.println("Not a Palindrome");
        }

    }

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter a word: ");
        String word = scanner.nextLine();

        checkPalindrome(word);






    }
}
