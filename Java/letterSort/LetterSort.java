//Apostolos Halis tolishalis@gmail.com 2023
//Δημιουργήστε ένα πρόγραμμα σε JAVA το οποίο θα ζητάει από το χρήστη να εισάγει/πληκτρολογήσει μία φράση και στη
// συνέχεια θα εμφανίζει πόσες φορές εμφανίζεται το κάθε φωνήεν στη φράση.
import java.util.ArrayList;

public class LetterSort {
    private int aCount = 0;
    private int eCount = 0;
    private int iCount = 0;
    private int oCount = 0;
    private int uCount = 0;
    private int yCount = 0;
    private String phrase;

    public int getACount() {
        return aCount;
    }

    public int getECount(){
       return eCount;
    }

    public int getICount() {
        return iCount;
    }

    public int getOCount() {
        return oCount;
    }

    public int getUCount() {
        return uCount;
    }

    public int getYCount() {
        return yCount;
    }

    public void countVowels() {
        for (int i = 0; i < phrase.length(); i++) {
                switch (phrase.charAt(i)){
                    case 'a':
                        aCount+=1;
                        break;
                    case 'e':
                       eCount+=1;
                       break;
                    case 'i':
                        iCount+=1;
                        break;
                    case 'o':
                        oCount+=1;
                        break;
                    case 'u':
                        uCount+=1;
                        break;
                    case 'y':
                        yCount+=1;
                        break;
                    default:
                        break;
            }
        }
    }

    public LetterSort(String p) {
        p = p.toLowerCase();
        phrase = p;
    }
}