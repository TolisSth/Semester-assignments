//Apostolos Halis tolishalis@gmail.com 2023
//Δημιουργήστε σε JAVA το παιχνίδι κρεμάλα (hangman). O χρήστης εισάγει γράμματα τα οποία και συγκρίνονται με λέξεις που
//επιλέγονται τυχαία από έναν πίνακα με λέξεις string. Μηνύματα επιτυχίας ή αποτυχίας εμφανίζονται στο χρήστη και
//τον καθοδηγούν για το αποτέλεσμα. Για διευκόλυνσή σας τοποθετήστε στον πίνακα 5 διαφορετικές λέξεις.
import java.util.ArrayList;

public class WordSpawner {
   private ArrayList<String> availableWords = new ArrayList<String>();

   public int randomPick(){
       double x = Math.random() * 5;
       int randomNumber = (int)x;
       return randomNumber;
   }

   public String getRandomWord(int index){
       return availableWords.get(index);
   }

   public WordSpawner(){
       availableWords.add("java");
       availableWords.add("jerusalem");
       availableWords.add("interstellar");
       availableWords.add("cluster");
       availableWords.add("computer");
   }
}