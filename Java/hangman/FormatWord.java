//Apostolos Halis tolishalis@gmail.com 2023
//Δημιουργήστε σε JAVA το παιχνίδι κρεμάλα (hangman). O χρήστης εισάγει γράμματα τα οποία και συγκρίνονται με λέξεις που
//επιλέγονται τυχαία από έναν πίνακα με λέξεις string. Μηνύματα επιτυχίας ή αποτυχίας εμφανίζονται στο χρήστη και
//τον καθοδηγούν για το αποτέλεσμα. Για διευκόλυνσή σας τοποθετήστε στον πίνακα 5 διαφορετικές λέξεις.
import java.util.ArrayList;
import java.util.Random;

public class FormatWord {
    private String wordToBeChopped;
    //This array will be searched after every input of the player
    private ArrayList<Character> word = new ArrayList<Character>();
    //this array will be identical to the word array at the end of the game if the player wins
    private ArrayList<Character> redactedWord = new ArrayList<Character>(); //
    private final int redactionRate = 2; //this is the rate of the reduction, right now 50% of the letter will be redacted
    public ArrayList<Character> getWord() {
        return word;
    }

    public ArrayList<Character> getRedactedWord() {
        return redactedWord;
    }

    public void ChopWord(){
        //we're chopping the word and feeding it to the character array
        for(char ch : wordToBeChopped.toCharArray()){
            word.add(ch);
            redactedWord.add(ch);
        }
    }

    public void redactRandomIndex(){
        int max = word.size();
        Random random = new Random();
        for(int i = 0; i < word.size() / redactionRate; i++) {
            redactedWord.set(random.nextInt(max), '_');
        }
    }

    public FormatWord(String word){
        wordToBeChopped = word;
    }
}