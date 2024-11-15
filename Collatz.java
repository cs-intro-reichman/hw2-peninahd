// Demonstrates the Collatz conjecture.
public class Collatz {
	public static void main(String[] args) {
        int N = Integer.parseInt(args[0]);
        String mode = args[1];
        String c = "c";
        int times = 0;
        boolean firstValue = true;
        //prints the original N         
        if (mode.equals(c)) {
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
        } else {
            if (N == 1){
                System.out.println("1 4 2 1 (4)");
            } else {
                System.out.println("1 4 2 1 (4)");  
                for (int Z = 2; Z <= N; Z++) {
                    int Y = Z;
                while (Y != 1) {
                    if (!firstValue) {
                        System.out.print(" ");
                    } 
                    System.out.print(Y);
        
                    firstValue = false;
        
                        if (Y % 2 == 0) {
                            Y = Y / 2;
            
                        } else {
                            Y = (Y * 3) + 1;
                        }
                    times++;    
                    }
                System.out.println(" 1" + " (" + times + ")");
                times = 0;
                firstValue = true;
            }
        }
        System.out.println("Every one of the first " + args[0] + " hailstone sequences reached 1.");
        }
    }
}
