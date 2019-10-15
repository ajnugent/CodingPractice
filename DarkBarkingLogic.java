/*Create a method where if a dog is barking (Boolean) and the hour is earlier than hour 7
  or later than hour 20, then return statements telling whether you are in trouble or not
  due to your barking dog.
 */


public class DarkBarkingLogic {

    public static void dogTrouble (Boolean barking, int hour){

       if(barking && hour < 7 || hour > 20){

            System.out.println("You are in trouble with your barking dog!");

        }else {

            System.out.println("It's all good.");
        }
    }

    public static void  main(String [] args){

        int hour = 0;

        dogTrouble(true, hour);
    }
}
