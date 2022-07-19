import java.util.*;
public class RPS{
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        Scanner restarter = new Scanner(System.in);
        Scanner winner = new Scanner(System.in);
        boolean Restart = true;
        boolean Prompt = true;
        String [] arr = {"'Rock'", "'Paper'", "'Scissors'"};
        Random random = new Random();

        System.out.println("This is a practice project because Ryan doesn't remember how to code.");
        System.out.println(" ");

        while(Restart){
        System.out.println("Let's play a game of Rock, Paper, Scissors");
        System.out.println("Pick a move (You can say 'Rock', 'Paper', or 'Scissors')");
            String userChoice = sc.next();
        
        if(userChoice.equals("Rock")){
            System.out.println("'Rock' has been selected.");
        }else if(userChoice.equals("Paper")){
            System.out.println("'Paper' has been selected.");
        }else if(userChoice.equals("Scissors")){
            System.out.println("'Scissors' has been selected.");
        }else{
            System.out.println("Invalid choice. Please try again.");
        }

        System.out.println(" ");

        int Select = random.nextInt(arr.length);
        System.out.println("'Terminal' has selected " + arr[Select] + ".");

        System.out.println("Did you win?");
            String win = winner.next();

        if(win.equals("Yes")){
            System.out.println("GG. You've beaten a computer.");
        }else if(win.equals("No")){
            System.out.println("L");
        }else if(win.equals("yes")){
            System.out.println("GG. You've beaten a computer.");
        }else if(win.equals("no")){
            System.out.println("L");
        }else{
            System.out.println("Huh?");
        }
        
        System.out.println(" ");
        
        while(Prompt){
        System.out.println("Restart game?");
        String start = restarter.next();

        if(start.equals("Yes")){
            Prompt = false;
            Restart = true;
            System.out.println("Restarting!");
        }else if(start.equals("No")){
            Prompt = false;
            Restart = false;
            System.out.println("Ending sequence. Goodbye...");
        }else if(start.equals("no")){
            Prompt = false;
            Restart = false;
            System.out.println("Ending sequence. Goodbye...");
        }else if(start.equals("yes")){
            Prompt = false;
            Restart = true;
            System.out.println("Restarting!");
        }else{
            System.out.println("Invalid input (This is a yes or no question).");
                Prompt = true;
                Restart = false;
            }
        }
        }

    }
    }
