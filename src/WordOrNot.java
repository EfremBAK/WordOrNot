/*
Select some random letters and maybe create a word

create a new java project
create an array which contains the 26 letters of the alphabet. next, prompt the user for the length of the word.
Now, Select the number of random letters required to create a word of that length.
print the random letters to the screen. if the random letters do not contain a vowel(a,e,i,o,u)
then display the word followed by "might be a word."
use a while loop to allow the user to select another word

pseudocode
-array alpha with all letter in 1 line.
-ask user for length of word and store it in x
-scanner, array, random must be declare at top
-in rangen, put the number as x
print that word to the screen, if it contain vowel, then
send invalid msg
else might be a word
-select and look for a vowel(for)
if print number
-
 */


import java.sql.SQLOutput;
import java.util.Random;
import java.util.Scanner;

public class WordOrNot {
    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);
        boolean again = true;
        char[] alpha = {'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k', 'l', 'm', 'n', 'o', 'p', 'q', 'r', 's', 't', 'u', 'v', 'w', 'x', 'y', 'z'};

        while (again){
            System.out.println("Enter the length of word: ");
            Scanner sc= new Scanner(System.in);
            boolean found = false;  //vowel not found
            int x = sc.nextInt(); //index length
            System.out.println("index length " + x);
            Random r = new Random();
            String word = "";
            for (int i = 0; i < x; i++) {
                int ind = r.nextInt(25); //randomly generate  index value, meaning randomize

//            System.out.print("ran " + ind);
                char letters = alpha[ind]; //the words in the index
//            System.out.println("the word in the index is " + letters);
                word = word + letters;
            }
            System.out.println("The word is :" + word);
// we have generated the word till this point, now compare it with vowels using switch

            for (int i = 0; i < word.length(); i++) {
                char chk = word.charAt(i); //get the first char.
                switch (chk) {
                    case 'a':
                        found = true;
                        break;
                    case 'e':
                        found = true;
                        break;
                    case 'i':
                        found = true;
                        break;
                    case 'o':
                        found = true;
                        break;
                    case 'u':
                        found = true;
                        break;


                    case 'A':
                        found = true;
                        break;
                    case 'E':
                        found = true;
                        break;
                    case 'I':
                        found = true;
                        break;
                    case 'O':
                        found = true;
                        break;
                    case 'U':
                        found = true;
                        break;

                    default:
                        break;

                }


            }
            if (found)
                System.out.println("It maybe word");
            else
                System.out.println("It is not a word");

// loop to repeat
            System.out.println("Try again? Y/N");

            String ans = s.nextLine();
            if ( ans.equalsIgnoreCase("n")){
                again = false;
            }

        }


    }


}

