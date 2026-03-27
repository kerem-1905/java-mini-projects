import java.util.Scanner;
import java.util.Random;
public class minigame {

    public static void main(String[] args){

        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        String[] choices = {"rock", "paper", "scissors"};
        String playerChoice;
        String computerChoice;
        String playAgain = "yes";

        do {
            System.out.println("Enter your choice (rock, paper, scissors): ");
            playerChoice = scanner.nextLine().toLowerCase();

            if (!playerChoice.equals("rock") && !playerChoice.equals("paper") && !playerChoice.equals("scissors")) {
                System.out.println("Invalid input");
            }

            computerChoice = choices[random.nextInt(3)];

            if (playerChoice.equals("rock")) {
                if (computerChoice.equals("paper")) {
                    System.out.println("You lost");
                    System.out.println("Computer's choice: " +  computerChoice);
                } else if (computerChoice.equals("rock")) {
                    System.out.println("It's a tie");
                    System.out.println("Computer's choice: " +  computerChoice);
                } else if(computerChoice.equals("scissors")) {
                    System.out.println("You won");
                    System.out.println("Computer's choice: " + computerChoice);
                }
                    else{
                        System.out.println("Please enter a valid choice");
                    }

            }
            else if (playerChoice.equals("paper")) {
                if(computerChoice.equals("scissors")){
                    System.out.println("You lost");
                    System.out.println("Computer's choice: " +  computerChoice);
                }
                else if(computerChoice.equals("paper")){
                    System.out.println("It's a tie");
                    System.out.println("Computer's choice: " +  computerChoice);
                }
                else if(computerChoice.equals("rock")){
                    System.out.println("You won");
                    System.out.println("Computer's choice: " +  computerChoice);
                }
                else{
                    System.out.println("Please enter a valid choice");
                }
            }

            else if(playerChoice.equals("scissors")){
                if(computerChoice.equals("rock")){
                    System.out.println("You lost");
                    System.out.println("Computer's choice: " +  computerChoice);
                }
                else if(computerChoice.equals("scissors")){
                    System.out.println("It's a tie");
                    System.out.println("Computer's choice: " +  computerChoice);
                }
                else if(computerChoice.equals("paper")){
                    System.out.println("You won");
                    System.out.println("Computer's choice: " +  computerChoice);
                }
                else{
                    System.out.println("Please enter a valid choice");
                }
            }
            else{
                continue;
            }

            System.out.println("Do you want to play again (yes/no)?");
            playAgain = scanner.nextLine().toLowerCase();


        } while(playAgain.equals("yes"));
    }
}