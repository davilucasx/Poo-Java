package principal;
import java.util.Scanner;
public class principal {

	public static void main(String[] args) {
float vlrKw, vlrReais, desc, vlrDesc;
Scanner sc = new Scanner(System.in);
System.out.println("Qual o valor do seu salário mínimo da sua residência : ");
float vlrSal = sc.nextFloat();
System.out.println("Qual a quantida KW consumida no mês: ");
float qtdKw = sc.nextFloat();

vlrKw = vlrSal/5;
vlrReais = vlrKw * qtdKw;
desc = vlrReais * 15/100;
vlrDesc = vlrReais - desc;
System.out.println("O valor do KW na residência foi " + vlrKw + "\nO valor da conta de luz é " +
vlrReais + "\nO valor do desconto é " + vlrDesc);
				
		

	}

}
