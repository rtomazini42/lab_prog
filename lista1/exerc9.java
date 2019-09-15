package exerc;
import java.util.Scanner;

public class exerc9 {

	private static Scanner entrada;
	

	public static void main(String[] args) {
		entrada = new Scanner(System.in);
		int pares = 0,impares = 0,media_par = 0,media_geral = 0,aux =0,aux_par = 0;
		boolean cont = true;
		do{
			System.out.println("digite um numero");
			int num = entrada.nextInt();
			if(num == 0) {
				cont = false;
				break;
			}
			aux++;
			if(num%2 == 0) {
				aux_par++;
				pares++;
				media_par = (media_par+num);
			}
			else {
				impares++;
			}
			
			media_geral = (media_geral+num);
				

			
			
		}while(cont == true);
		media_par = media_par/aux_par;
		media_geral = media_geral/aux;
		System.out.println("Pares são " + pares);
		System.out.println("Impares são " + impares );
		System.out.println("A media par é " + media_par);
		System.out.println("A media geral é " + media_geral);
		
	}
	

	
}


