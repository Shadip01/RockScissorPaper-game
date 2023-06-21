import java.util.*;


public class Main {

    public static String userChoice() {
        System.out.println("Enter your userchoice:");
        Scanner objx1 = new Scanner(System.in);
        String userchoice = objx1.nextLine();
        if (userchoice.equalsIgnoreCase("rock")) {
            System.out.println("Your Choice is rock.");
            return "rock";
        } else if (userchoice.equalsIgnoreCase("paper")) {
            System.out.println("Your Choice is paper");
            return "paper";
        } else if (userchoice.equalsIgnoreCase("scissor")) {
            System.out.println("Your Choice is scissor.");
            return "scissor";
        }
        System.out.println("Invalid input");
        return "Invalid Input";

    }

    public static void Winner(String userchoice, String randomchoice) {

        if (userchoice.equals(randomchoice)) {
            System.out.println("####### Draw #######");

        } else if (userchoice.equals("rock")) {
            if (randomchoice.equals("2")) {
                System.out.println(" ####### You lose #######");
            } else {
                System.out.println(" ####### You win #######");
            }
        } else if (userchoice.equals("paper")) {
            if (randomchoice.equals("1")) {
                System.out.println("####### You lose #######");
            } else {
                System.out.println("####### You win #######");
            }
        } else if (userchoice.equals("scissor")) {
            if (randomchoice.equals("3")) {
                System.out.println("####### You lose #######");
            } else {
                System.out.println("####### You win #######");

            }
        }
    }

    public static String computerChoice() {
        int min = 1;
        int max = 3;
        Random rand = new Random();
        int randomchoice = rand.nextInt(1, 3 + 1);
        if (randomchoice == 1) {
            // 1 = rock
            System.out.println("Computer choose:  rock");
            return "rock";
        } else if (randomchoice == 2) {
            // 2 = paper
            System.out.println("Computer choose:  paper");
            return "paper";
        } else if (randomchoice == 3) {
            // 3 = scissor
            System.out.println("Computer choose:  scissor");
            return "scissor";
        } else {
            System.out.println("");
            return "";
        }

    }

    public static void tryagain() {
        Scanner sc3 = new Scanner(System.in);
        System.out.println("Do you want to play agian: ");
        String again = sc3.nextLine();
        if (again.equalsIgnoreCase("Yes")) {
            try {
                main(null);
            } catch (Exception e) {
                e.printStackTrace();
            }

        } else if (again.equalsIgnoreCase("No")) {
            System.out.println("We are exiting now. Thank you :)");
            System.exit(0);
        }

    }

    public static void main(String[] args) throws Exception {
        Main sc1 = new Main();
        String usChoice;
        String compChoice;

        do {
            usChoice = sc1.userChoice();
            compChoice = sc1.computerChoice();
        } while (usChoice.equals(compChoice));
        sc1.Winner(usChoice, compChoice);
        sc1.tryagain();

    }
}