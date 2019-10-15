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
