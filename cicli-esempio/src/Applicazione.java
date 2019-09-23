
public class Applicazione {

	public static void main(String[] args) {
		int i = 0;
		
//		System.out.println(++i);
//		i = 0;
//		System.out.println(i++);
		
//		i = 0;
//		do {
//			System.out.println(i++);
//		} while(i < 0);
		
//		i = 0;
//		while(i < 10) {
//			System.out.println(i++);
//		}
//		for(int j = 0; j < 10; j++) {
//			System.out.println(j);
//		}
		
		String nome = "Mauro";
		switch(nome) {
			case "Giovanni": System.out.println(nome + " è un incapace");
				break;
			case "Mirko": System.out.println(nome + " ha studiato Java");
				break;
			default: System.out.println(nome + " sta studiando Java");
		}
		
	}

}
