package principal;
import java.util.Scanner;

public class principal {

	public static void main(String[] args) {
		int inicio, primo=0;
        Scanner entrada = new Scanner(System.in);
        System.out.print("N�mero inicial: ");
        inicio = entrada.nextInt();
        

        for (int i=inicio; i<=inicio; i--) {
            for (int j=2; j<=i; j++) {
                if (i % j == 0) {
                    primo++;
                }
            }
            if (primo == 1) {
                System.out.println("O n�mero " + i + " � PRIMO!");
            }
            primo = 0;
        }
    }
}
		
		
		
		