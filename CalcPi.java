// Question 6
public class CalcPi {
    public static void main(String args[]) { 
		int rounds = Integer.parseInt(args[0]);
		double sum = 0;
		int sign = 1;
		for (int i = 0; i < rounds; i++) {
            sum += (1 * sign) / (2 * i + 1.0);
            sign = sign * (-1);
	    } 
		System.out.println("pi according to Java: " + Math.PI);
		System.out.println("pi, approximated:     " + 4.0 * sum);
	}
}
