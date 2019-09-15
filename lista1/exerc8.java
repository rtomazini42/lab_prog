package exerc;
import java.util.Scanner;

public class exerc8 {

	private static Scanner entrada;
	

	public static void main(String[] args) {
		entrada = new Scanner(System.in);
		int inter_1 = 0,inter_2 = 0,inter_3 = 0,inter_4 = 0;
		boolean cont = true;
		do{
			System.out.println("digite um numero");
			int num = entrada.nextInt();
			if(num > 0 & num <26) {
				inter_1 ++;
				
			}
			else if(num > 25 & num <51) {
				inter_2 ++;
				
			}
			else if(num > 50 & num <76 ) {
				inter_3 ++;
				
			}
			else if(num > 75 & num <101) {
				inter_4 ++;
			}
			
			else if(num < 0) {
				cont = false;
			}
			
		}while(cont == true);
		
		System.out.println("São " + inter_1 + " entre 0 e 25");
		System.out.println("São " + inter_2 + " entre 26 e 50");
		System.out.println("São " + inter_3 + " entre 51 e 75");
		System.out.println("São " + inter_4 + " entre 76 e 100");
		
	}
	

	
}


