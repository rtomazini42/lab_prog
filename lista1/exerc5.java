package exerc;


public class exerc5 {

	

	public static void main(String[] args) {
		int num =0;
		int res = 0;
		
		while(num < 500) {
			num++;
			if(num % 2 == 1 & num % 3 ==0) {
				res = res + num;
			}
		}
		System.out.println(res);

		}
	}
	

	



