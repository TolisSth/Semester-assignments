//Apostolos Halis tolishalis@gmail.com 2023
//Δημιουργήστε σε JAVA το παιχνίδι κρεμάλα (hangman). O χρήστης εισάγει γράμματα τα οποία και συγκρίνονται με λέξεις που
//επιλέγονται τυχαία από έναν πίνακα με λέξεις string. Μηνύματα επιτυχίας ή αποτυχίας εμφανίζονται στο χρήστη και
//τον καθοδηγούν για το αποτέλεσμα. Για διευκόλυνσή σας τοποθετήστε στον πίνακα 5 διαφορετικές λέξεις.
public class Player {
    private final String username;
    private int lives = 6;

    public String getUsername() {
        return username;
    }

    public int getLives() {
        return lives;
    }

    public void ReduceLives(){
        lives--;
    }

    public void youWin(boolean result, Player player){
        if(result)
            System.out.println("Congratulations player " + player.getUsername() + " you really knocked this one out of the park!" );
    }

    public void youLoose(boolean result, Player player){
        if(!result)
            System.out.println("You lost, that's so unfortunate, but you can still try again player. " + player.getUsername());
    }

    public Player(String un){
        username = un;
    }
}