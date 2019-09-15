package exerc;
import java.util.Scanner;

public class exerc7 {

	private static Scanner entrada;
	

	public static void main(String[] args) {
		entrada = new Scanner(System.in);
		int val_pos = 0,val_neg = 0,media = 0,aux = 0;
		double percentual_total=0,neg_per=0,pos_per=0;
		boolean cont = true;
		do{
			System.out.println("digite um numero");
			int num = entrada.nextInt();
			aux++;
			media = (num + media)/aux;
			
			if(num > 0) {
				val_pos++;
				
			}
			else {
				val_neg++;
			}
			
			System.out.println("Continuar?\n 1- Sim \n 2- não");
			int escolha = entrada.nextInt();
			if (escolha == 2){
				cont = false;
			}
			
		}while(cont == true);
		
		media = media/aux;
		System.out.println("A media é	:  " + media);
		System.out.println("A quantidade de valores positivos é : " + val_pos);
		System.out.println("A quantidade de valores negativos é : " + val_neg);
		percentual_total = (val_pos+val_neg);
		pos_per = (val_pos/percentual_total);
		neg_per = (val_neg/percentual_total);
		
		System.out.println("A porcentagem de valores positivos é : " + pos_per);
		System.out.println("A porcentagem de valores negativos é : " + neg_per);
		
	}
	

	
}


