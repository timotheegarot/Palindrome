// import java.text.DateFormat;
// import java.util.Calendar;
// import java.util.Date;
import java.util.Scanner;

public class Main {

    /**
     * Fonction permettant d'inverser les caractères d'une chaîne
     * @param str : chaîne de caractères
     * @return chaîne str inversée
     */
    public static String reverse(String str) {
        return new StringBuilder(str).reverse().toString();
    }

    public static String palindromeCheck(String word) {
        int leftPos = 0;
        int rightPos = word.length()-1;
        boolean palindrome=true;

        while ((leftPos < rightPos) && palindrome) {
            if (word.charAt(leftPos) != word.charAt(rightPos)) {
                palindrome=false;
            }
            leftPos++;
            rightPos--;
        }

        if (palindrome) {
            System.out.println("Bien dit !");
        }
        return word;
    }

    /**
     * Fonction permettant d'afficher l'heure et la date
     */
    // public static void salutationDate() {
    //     Date today = new Date();
    //     DateFormat shortDateFormat = DateFormat.getDateTimeInstance(DateFormat.SHORT, DateFormat.SHORT);
    //     System.out.println(shortDateFormat.format(today));
    // }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Bonjour !");
        System.out.print("Saisissez un mot : ");
        String word = scanner.nextLine();
        String reverseWord = reverse(word);

        /*int leftPos = 0;
        int rightPos = word.length()-1;
        boolean palindrome=true;

        while ((leftPos < rightPos) && palindrome) {
            if (word.charAt(leftPos) != word.charAt(rightPos)) {
                palindrome=false;
            }
            leftPos++;
            rightPos--;
        }

        if (palindrome) {
            System.out.println("Bien dit !");
        }*/

        palindromeCheck(word);

        System.out.println(reverseWord);
        //salutationDate();
        System.out.println("Au revoir.");
    }
}