package testeStack;

public class Conexao implements AutoCloseable{

    public Conexao() {
        System.out.println("Abrindo conexao");
    }

    public void leDados() {
        System.out.println("Recebendo dados");
            throw new IllegalStateException("epa");
    }



	@Override
	public void close() throws Exception {
		System.out.println("Fechando conexao");
		
	}
}