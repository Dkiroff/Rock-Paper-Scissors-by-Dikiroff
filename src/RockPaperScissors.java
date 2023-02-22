import java.util.Random;
import java.util.Scanner;

public class RockPaperScissors {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Random random = new Random();

        String ROCK = "Rock";
        String PAPER = "Paper";
        String SCISSORS = "Scissors";

        String computerMove = "";
        String playerMove = "";

        System.out.println();
        System.out.println(" |-------------------------------------------------------------------|");
        System.out.println(" | Choose rock, paper or scissors. To stop the game simply type end. |");
        System.out.println(" |-------------------------------------------------------------------|");

        System.out.print("Your choice -> ");
        String command = sc.nextLine();
        String input = command.toLowerCase();
        System.out.println();


        while (!input.contains("end")) {

            int computerNum = random.nextInt(3);

            switch (computerNum) {
                case 0:
                    computerMove = ROCK;
                    break;
                case 1:
                    computerMove = PAPER;
                    break;
                case 2:
                    computerMove = SCISSORS;
                default:
                    break;
            }

            if (input.contains("rock")) {
                playerMove = ROCK;
                playerChoiceRock(computerMove);
            } else if (input.contains("paper")) {
                playerChoicePaper(computerMove);
            } else if (input.contains("scissors")) {

                switch (computerMove) {
                    case "Rock":
                        System.out.println("You lost! Rock beats Paper.");
                        break;
                    case "Paper":
                        System.out.println("You won! GG.");
                        break;
                    case "Scissors":
                        System.out.println("This game is a draw.");
                        break;
                }
            } else {
                System.out.println("Invalid input! Please try again using rock, paper or scissors.");
            }
            System.out.println();
            System.out.print("Your choice -> ");
            command = sc.nextLine();
            input = command.toLowerCase();
            System.out.println();
        }
        System.out.println();
        System.out.println("Ending the game...");
    }


    private static void playerChoiceRock(String computerMove) {
        switch (computerMove) {
            case "Rock":
                System.out.println("This game is a draw.");
                break;
            case "Paper":
                System.out.println("You lost! Paper beats Rock.");
                break;
            case "Scissors":
                System.out.println("You won! GG.");
                break;
        }
    }

    private static void playerChoicePaper(String computerMove) {
        switch (computerMove) {
            case "Rock":
                System.out.println("You won! GG");
                break;
            case "Paper":
                System.out.println("This game is a draw.");
                break;
            case "Scissors":
                System.out.println("You lost! Scissors beats Paper.");
                break;
        }

    }
}