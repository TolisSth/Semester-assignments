//Author: Apostolos Halis tolishalis@gmail.com 2023
//Γράψτε πρόγραμμα σε JAVA, το οποίο θα ζητάει από το χρήστη να εισάγει μία λίστα με 6 ονόματα στην αρχική του σειρά,
// θα ταξινομεί τα ονόματα με αύξουσα αλφαβητική σειρά και κατόπιν θα εμφανίζει ξανά τη λίστα.

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        ArrayList<String>  name = new ArrayList<String>();

        Scanner defaultIn = new Scanner(System.in);
        for(int i = 0; i < 6; i++){
            int x = 6 - i;
            System.out.println("Provide the program with 6 names\n" + x + " more names need to be provided");
            name.add(defaultIn.nextLine());
        }
        NameSort ns = new NameSort(name);
        System.out.println(ns.sortNames());
    }
}