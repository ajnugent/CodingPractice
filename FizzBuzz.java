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
