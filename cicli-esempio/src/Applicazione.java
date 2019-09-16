
public class Applicazione {

	public static void main(String[] args) {
		int i = 0;
		
		do {
			System.out.println(i++);
		} while(i < 0);
		
		i = 0;
		while(i < 100) {
			System.out.println(++i);
		}
		for(int j = 0; j < 100; j++) {
			System.out.println(j);
		}
		
		String nome = "Giovanni";
		switch(nome) {
			case "Giovanni": System.out.println(nome + " è un incapace");
				break;
			case "Mirko": System.out.println(nome + " ha studiato Java");
			default: System.out.println(nome + " sta studiando Java");
		}
		
	}

}
