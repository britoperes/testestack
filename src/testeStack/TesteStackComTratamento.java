package testeStack;

public class TesteStackComTratamento {

	public static void main(String[] args) {
		System.out.println("Inicio da main");
		try {
			etapa1();			
		}catch(ArithmeticException | NullPointerException |MinhaExcecao e) {
			System.out.println("Exceção - "+e.getMessage());
		}
		System.out.println("Termino da main");

	}
	
	public static void etapa1() throws MinhaExcecao{
		System.out.println("Inicio da etapa 1");
		etapa2();
		System.out.println("Termino da etapa 1");
	}

	public static void etapa2() throws MinhaExcecao{
		System.out.println("Inicio da etapa 2");

		throw new MinhaExcecao("Deu problema");
	}

}
