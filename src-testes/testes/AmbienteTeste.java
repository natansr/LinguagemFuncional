package testes;
import junit.framework.TestCase;
import Tipos.IConst;
import br.unb.cic.linguagem.*;


public class AmbienteTeste extends TestCase {

	public void testAmbiente() throws ErroVarNaoExiste, ErroDeTipo {
		Ambiente ambiente = new Ambiente();
		Ambiente env= new Ambiente();
		ambiente.adicionarPar("x", new IConst(5));

		IConst auxiliar = (IConst)ambiente.obterExpressao("x").avalia(env);
		try {
			
			assertEquals(new IConst(5).getValor(),auxiliar.getValor());
		} catch (Exception e) {
			
			e.printStackTrace();
		}
		
	}
	
}
