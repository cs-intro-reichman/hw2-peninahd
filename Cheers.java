// Prints a crowd cheering output.
public class Cheers {
        public static void main(String[] args) {
	    // gets an input string and N number of times 
            String word = args[0];
            String wordUpper = word.toUpperCase();
            int N = Integer.parseInt(args[1]);
            String anValues = "AEFHILMNRSXO";
            
            //create a loop that checks each letter and prints it
            //takes each letter individually and decides if it is 
            //{'A', 'E', 'F', 'H', 'I', 'L', 'M', 'N', 'O', 'R','S', 'X'},
            int i = 0;
            while (i < wordUpper.length()) {
                char c = wordUpper.charAt(i);
                if (anValues.indexOf(c) == -1) {

                        System.out.println("Give me a  " + c + ": " + c + "!");
                } else {

                        System.out.println("Give me an " + c + ": " + c + "!");
                }
                i++;
            }
               String s = "What does that spell?";
                System.out.println(s);
                //print the word N amount of times
                int a = 0;
                while (a < N){
                        System.out.println(wordUpper + "!!!"); 
                        a++;
                }
        }
}