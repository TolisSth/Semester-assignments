//Apostolos Halis tolishalis@gmail.com 2023
//Δημιουργήστε σε JAVA το παιχνίδι κρεμάλα (hangman). O χρήστης εισάγει γράμματα τα οποία και συγκρίνονται με λέξεις που
//επιλέγονται τυχαία από έναν πίνακα με λέξεις string. Μηνύματα επιτυχίας ή αποτυχίας εμφανίζονται στο χρήστη και
//τον καθοδηγούν για το αποτέλεσμα. Για διευκόλυνσή σας τοποθετήστε στον πίνακα 5 διαφορετικές λέξεις.
import java.util.ArrayList;

public class RenderBody {
    ArrayList<String> bodyArray = new ArrayList<String>();

    public void getBodyParts(int i){
        for(int x = 0; x < i; x++) System.out.println(bodyArray.get(x));
    }
    public RenderBody(){
        bodyArray.add("Head"); //0
        bodyArray.add("Right hand"); //1
        bodyArray.add("Left Hand"); //2
        bodyArray.add("Torso"); //3
        bodyArray.add("Right leg"); //4
        bodyArray.add("Left leg"); //5
    }
}