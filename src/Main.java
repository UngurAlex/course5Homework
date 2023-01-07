import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        //1)
        firstExercise();

        //2)
        secondExercise();

        //3)
        thirdExercise();

        //4)
        fourthExercise();

        //5)
        fifthExercise();

        //6)
        sixtExercise();



    }

    private static void sixtExercise(){

        String fullName = "Ana are mere.  Eu stiam ca Ana nu are mere.  Tu stiai ca Ana are mere.  Inseamna ca Ana m-a mintit.";
        String[] split = fullName.split("  ");
        for(String name : split){
            System.out.println(name);
        }

    }

    private static void fifthExercise(){
        int target = 100;
        Scanner scanner5 = new Scanner(System.in);
        System.out.println("You can made only five donations");
        for(int index=0; index<5; index++){
            int yourDonation = scanner5.nextInt();
            if(yourDonation>0){
                target = target - yourDonation;
            }
            System.out.println(" There is still " + target + " money left to collect ");
        }System.out.println("The donation campaign has ended");
    }

    private static void fourthExercise() {
        int target = 100;
        Scanner scanner4 = new Scanner(System.in);
        System.out.println("How much do you want to donate?");
        int totalDonation = 0;
        do {
            int yourDonation = scanner4.nextInt();
            if (yourDonation > 0) {
                totalDonation = yourDonation + totalDonation;
                System.out.println("you still have left " + (target - totalDonation) + " to reach the goal");
                if (totalDonation < 100) {
                    System.out.println("You can continue to donate :)");
                }
            }
        } while (totalDonation < 100);
        if (totalDonation >= 100) {
            System.out.println("You have reached the goal!Good job!");
        }
    }

    private static int thirdExercise() {
        Scanner scanner3 = new Scanner(System.in);

        int fourNumbers = 4;
        System.out.println("Write a number, and then 4 other numbers and we will check if they are bigger than the first one");
        int anotherNumber = scanner3.nextInt();
        System.out.println("Write four numbers:");
        for (int index = 0; index < fourNumbers; index++) {
            int number = scanner3.nextInt();
            if (number > anotherNumber) {
                System.out.println("This number is greatter than first:");
                System.out.println(number);
            }
        }
        return 0;


    }

    private static int secondExercise() {
        Scanner scanner2 = new Scanner(System.in);
        System.out.println("Write five numbers and I can show you how much are odd :)");
        int fiveNumbers = 5;
        int howManyNumbers = 0;
        for (int index = 0; index < fiveNumbers; index++) {
            int number = scanner2.nextInt();
            if (number % 2 == 1) {
                howManyNumbers++;
            }
        }
        System.out.println("in the next row you will see how many numbers are odd");
        System.out.println(howManyNumbers);
        return howManyNumbers;
    }

    private static int firstExercise() {
        String operation;
        Scanner scanner = new Scanner(System.in);
        do {

            System.out.println("Write three numbers and I can show you their sume :)");
            int number1 = scanner.nextInt();
            int number2 = scanner.nextInt();
            int number3 = scanner.nextInt();
            int sume = number1 + number2 + number3;
            System.out.println("The sum of your numbers is:");
            System.out.println(sume);
            System.out.println("if you want to exit , press exit, if you want to stay and make another sume, press anything else:");
            operation = scanner.next();
            return sume;


        } while (!operation.equals("exit"));

    }
}