import  java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        int math,physics,turkish,chemistry,music;
       Scanner inp = new Scanner(System.in);

        System.out.print("Enter the Math grade : ");
        math  = inp.nextInt();


        System.out.print("Enter the physics grade : ");
        physics =inp.nextInt();

        System.out.print("Enter the turkish grade : ");
        turkish = inp.nextInt();

        System.out.print("Enter the chemistry grade : ");
        chemistry= inp.nextInt();

        System.out.print("Enter the music grade : ");
        music= inp.nextInt();

        double average = (math + physics + turkish + chemistry + music) / 5.0 ;

        if (math <= 100 && math >= 0 && physics <= 100 && physics >= 0 && turkish <= 100 && turkish >= 0
                && chemistry <= 100 && chemistry >= 0 && music <= 100 && music >= 0) {

             if (average <55) {
                System.out.println("You have failed the class; you will retake it next year");
            } else {
                System.out.println("Congralations,You pass the class");
            }

        } else {
            System.out.println("Some grades are not between 0 and 100. They will not be included in the average.");
        }

    }
}