/*
 * Nicholas Weber
 *makes 30 lines of letters according to the spot in the alphabet
 *starts with random integer 1-26
 *links random integer to spot in the alphabet
 *prints it out one per line and 30 lines 
 */
package review;
import java.util.Random;
public class LetterLines {

    public static void main(String[] args) {
        for ( int z = 0; z < 30; z++ ) {
            int n = Randomint();
            String randLetter = randomAlphabet(n);
            //System.out.println(randLetter);
            printLetters(n, randLetter);
        }
    }
    //random integer 1-26
    public static int Randomint(){
        Random rand = new Random();
        int n = rand.nextInt(26)+1;
        return n;
    }
    //linking random integer to the alphabet
    public static String randomAlphabet(int n){
        String alphabet = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
        String alpahbetletter  = Character.toString(alphabet.charAt(n-1));
        return alpahbetletter;
    }
    //print alphabet letter one per line 
    private static void printLetters(int n, String s){
        for( int x = 0; x < n; x++ ){
            System.out.print(s);
        }
        System.out.println();
    }
}
