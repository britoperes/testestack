package testeStack;

public class testeStack {

	public static void main(String[] args) {
		System.out.println("Inicio da main");
		etapa1();
		System.out.println("Termino da main");

	}
	
	public static void etapa1() {
		System.out.println("Inicio da etapa 1");
		etapa2();
		System.out.println("Termino da etapa 1");
	}

	public static void etapa2() {
		System.out.println("Inicio da etapa 2");
		for(int i =1;i<=5;i++) {
			System.out.println(i);
			try {
				int a = i / 0;
			} catch(ArithmeticException e) {
				System.out.println("Erro de divisão por zero");
			}
		}
		System.out.println("Termino da etapa 2");
	}

}
