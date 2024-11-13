// Computes an approximation of PI.
public class CalcPi {
	public static void main(String [] args) { 
	    //get N number of terms
		int N = Integer.parseInt(args[0]);
		int i = 0;
		double c = 0;
			
		while (i < N) {
					double equation = 1.0 / ( 2 * i + 1);
					if (i % 2 == 0) {
						c += equation;
					} else {
						c -= equation;
					}
					i++;
				}
				c *= 4; //need to multiply by 4 bc the equation gives us PI/4
				System.out.println("pi according to Java: " + Math.PI);
				System.out.println(String.format("pi, approximated: " + c));
			}
		}
