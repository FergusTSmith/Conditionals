import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        /*Scanner s = new Scanner(System.in);
        System.out.println("Please enter your first num");
        int firstNum = s.nextInt();
        System.out.println("Please enter your second num");
        int secondNum = s.nextInt();

        if(firstNum > secondNum) {
            System.out.println("First Number is larger: " + firstNum);
        }else{
            System.out.println("Second Number is larger: " + secondNum);
        }

        System.out.println("Please enter another number");
        int thirdNum = s.nextInt();
        s.nextLine();
        if(thirdNum % 2 == 0){
            System.out.println("Your third number is even");
        }else{
            System.out.println("Your third number is odd");
        }

        System.out.println("Please enter a traffic light colour:");
        String colour = s.nextLine();

        if(colour.equals("green")){
            System.out.println("Go");
        }else if(colour.equals("amber")){
            System.out.println("Slow down");
        }else{
            System.out.println("Stop");
        }
        */
        Scanner s = new Scanner(System.in);
        System.out.println("Please enter a number between one and 12");
        int firstNum = s.nextInt();

        while(firstNum < 1 || firstNum > 12){
            System.out.println("Error, please enter a number between 1 and 12.");
            firstNum = s.nextInt();
        }

        switch(firstNum){
            case 1:
                System.out.println("Winter");
                break;
            case 2:
                System.out.println("Winter");
                break;
            case 3:
                System.out.println("Spring");
                break;
            case 4:
                System.out.println("Spring");
                break;
            case 5:
                System.out.println("Spring");
                break;
            case 6:
                System.out.println("Summer");
                break;
            case 7:
                System.out.println("Summer");
                break;
            case 8:
                System.out.println("Summer");
                break;
            case 9:
                System.out.println("Autumn");
                break;
            case 10:
                System.out.println("Autumn");
                break;
            case 11:
                System.out.println("Autumn");
                break;
            case 12:
                System.out.println("Winter");
                break;
        }


    }
}