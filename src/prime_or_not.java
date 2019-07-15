import javax.swing.JOptionPane;

public class prime_or_not {
	public static void main(String[] args) {

		String number = JOptionPane.showInputDialog("pick a number to see if it is prime or not");
		
int prime = Integer.parseInt(number);
		
for (int i = 2; i < prime; i++) {
	if (prime % i == 0 ) {
		System.out.println("not prime"); 
	}
	
}
	}
}
