package testeStack;

public class TestaConexao {
	public static void main(String[] args) {

		
		
		
		try(Conexao c = new Conexao()){
			c.leDados();
		}catch(Exception e) {
			System.out.println(e.getMessage());
		}
		
		//		Conexao c = new Conexao();
//		
//		try {
//			c.leDados();
//		}catch(Exception e) {
//			e.getMessage();
//		}finally {
//			c.fecha();
//		}
	}
	
	

}
