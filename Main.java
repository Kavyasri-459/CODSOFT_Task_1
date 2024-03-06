import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int min = 1;
        int max = 50;
        int total_attempts = 10;

        boolean play_again = true;
        while (play_again) {
            int randomNum = min + 1 + (int) (Math.random() * ((max - min - 1) + 1));
            System.out.println("Hello !!!! \n Welcome!!!!");
            System.out.println("...Lets play the guess game...");
            System.out.println("The computer has generated a number between " + min + " and " + max);
            System.out.println("Now you have to guess the number so lets begin:");

            int attempts = 0;
            while (attempts < total_attempts) {

                int guess = sc.nextInt();
                attempts++;

                if (guess > randomNum) {
                    System.out.println("Try smaller number");
                }

                else if (guess < randomNum) {
                    System.out.println("Try bigger number");
                }

                else {
                    System.out.println("***You have guessed the correct number***");
                    System.out.println("You have guessed the number in " + attempts + " attempts out " + total_attempts
                            + " attempts");

                    if (attempts >= 1 && attempts <= 3) {
                        System.out.println("**************************************************");
                        System.out.println("\t\t===>Excellent<===");
                        System.out.println("**************************************************");
                    }

                    else if (attempts >= 4 && attempts <= 6) {
                        System.out.println("**************************************************");
                        System.out.println("\t\t===>Good<===");
                        System.out.println("**************************************************");
                    }

                    else {
                        System.out.println("***********************************************************");
                        System.out.println("\t\t===>You can do better<===");
                        System.out.println("***********************************************************");
                    }
                    break;
                }

            }
            if (attempts == total_attempts) {
                System.out.println("Oh no! you have reached the maximum number of attempts better luck next time");
            }

            System.out.println("Are you willing to play again (yes/no)");
            String playnot = sc.next().toLowerCase();

            play_again = playnot.equals("yes");
        }
    }
}





