//Apostolos Halis tolishalis@gmail.com 2023
//Δημιουργήστε σε JAVA το παιχνίδι κρεμάλα (hangman). O χρήστης εισάγει γράμματα τα οποία και συγκρίνονται με λέξεις που
//επιλέγονται τυχαία από έναν πίνακα με λέξεις string. Μηνύματα επιτυχίας ή αποτυχίας εμφανίζονται στο χρήστη και
//τον καθοδηγούν για το αποτέλεσμα. Για διευκόλυνσή σας τοποθετήστε στον πίνακα 5 διαφορετικές λέξεις.
import java.util.ArrayList;
import java.util.Scanner;

public class Game {
    public void loop(){
        String name;
        boolean win = false;
        Scanner input = new Scanner(System.in);
        WordSpawner ws = new WordSpawner();
        FormatWord fw = new FormatWord(ws.getRandomWord(ws.randomPick()));
        RenderBody rb = new RenderBody();

        System.out.println("Welcome to the hangman game by Apostolos Halis\nUsername for player: ");
        //making sure that the player will not enter a space or a newline character
        name = input.nextLine().strip();
        while(name.isEmpty()){
            System.out.println("Username for player: ");
            name = input.nextLine();
        }

        //those things should be used once in the game
        Player player = new Player(name);
        fw.ChopWord();
        fw.redactRandomIndex();
        System.out.println("The game Begins!!!");

        rb.getBodyParts(player.getLives());
        //main game loop
        while(player.getLives() != 0 && !win) {
            System.out.println(player.getUsername() + " has " + player.getLives() + " lives");
            System.out.println(fw.getRedactedWord());
            char playerInput = input.next().charAt(0);
            if(fw.getWord().contains(playerInput)){
                ArrayList<Integer> indexes = new ArrayList<Integer>();
                //Output to keep the user happy
                System.out.println("You survived this round");
                rb.getBodyParts(player.getLives());
                //background stuff to update the redactedWord array
                for(int i = 0; i < fw.getWord().size(); i++){
                    if(fw.getWord().get(i) == playerInput)
                        indexes.add(i);
                }
                //this loop takes all the indexes that there are the letter of playerinput from the word array
                //and replaces their counterparts on the redactedwords array with real letters
                for(int i = 0; i < indexes.size(); i++){
                    fw.getRedactedWord().set(indexes.get(i), playerInput);
                }
                //this is an if statement that checks if the player won
                if(!fw.getRedactedWord().contains('_')){
                    win = true;
                }
            }
            else{
                player.ReduceLives();
                rb.getBodyParts(player.getLives());
            }
            player.youWin(win, player);
            player.youLoose(win, player);
        }
    }
}