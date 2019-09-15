package exerc;

public class exec2 {

	

	public static void main(String[] args) {
		double Pais_A = 55000; 
		double Pais_B = 160000;
		int mes = 0;
		
		while(Pais_B > Pais_A) {
			mes++;
			Pais_A = Pais_A * 1.30;
			Pais_B = Pais_B * 1.18;
			//System.out.println(mes);
		}

		System.out.println("No mês " + mes + " o país A estava com " + (int)Pais_A + " habitantes e o país B estava com " + (int)Pais_B+" habitantes");
		
	}
	

	
}


