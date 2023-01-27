//Apostolos Halis tolishalis@gmail.com 2023
//Δημιουργήστε ένα πρόγραμμα σε JAVA το οποίο θα ζητάει από το χρήστη να εισάγει/πληκτρολογήσει μία φράση και στη
// συνέχεια θα εμφανίζει πόσες φορές εμφανίζεται το κάθε φωνήεν στη φράση.
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Provide the program with a phrase and it will count the vowels");
        Scanner defaultIn = new Scanner(System.in);
        String phrase = defaultIn.nextLine();
        LetterSort ls = new LetterSort(phrase);
        ls.countVowels();
        System.out.println("Vowel A appeared: " + ls.getACount() + " time(s). ");
        System.out.println("Vowel E appeared: " + ls.getECount() + " time(s). ");
        System.out.println("Vowel I appeared: " + ls.getICount() + " time(s). ");
        System.out.println("Vowel O appeared: " + ls.getOCount() + " time(s). ");
        System.out.println("Vowel U appeared: " + ls.getUCount() + " time(s). ");
        System.out.println("Vowel Y appeared: " + ls.getYCount() + " time(s). ");
    }
}