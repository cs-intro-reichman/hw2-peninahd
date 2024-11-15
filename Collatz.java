// Demonstrates the Collatz conjecture.
public class Collatz {
	public static void main(String[] args) {
        int N = Integer.parseInt(args[0]);
        String mode = args[1];
        int times = 0;
        boolean firstValue = true;
        //prints the original N         
        while (N != 1) {
            if (!firstValue) {
                System.out.print(", ");
            } 
            System.out.print(N);

            firstValue = false;

                if (N % 2 == 0) {
                    N = N / 2;
    
                } else {
                    N = (N * 3) + 1;
                }
            times++;    
            }
        System.out.println(", 1" + " (" + times + ")");
        System.out.println("Every one of the first " + args[0] + " hailstone sequences reached 1.");
        }
    }