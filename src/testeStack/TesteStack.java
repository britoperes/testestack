package testeStack;

public class TesteStack {

	public static void main(String[] args) {
		System.out.println("Inicio da main");
		try {
			etapa1();			
		}catch(ArithmeticException | NullPointerException e) {
			System.out.println("Exceção - "+e.getMessage());
		}
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
//				int a = i / 0;
			Conta conta = null;
			conta.deposita();
		}
		System.out.println("Termino da etapa 2");
	}

}
