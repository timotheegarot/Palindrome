import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.print("Saisissez un mot : ");
        String word = scanner.nextLine();
        int nbLetters = word.length();
        String wordReverse;
        char lettersReverse;

        for (int i=0; i < nbLetters; i++) {
            char [] tabLetters;
            tabLetters[i] = word.charAt(i);
            System.out.println(tabLetters[i]);
        }

        //System.out.println("Le mot " + word + " à l'envers donne " + word_Reverse);
    }
}