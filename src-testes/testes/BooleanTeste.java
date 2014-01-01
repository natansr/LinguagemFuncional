package testes;
import Tipos.Booleano;
import br.unb.cic.linguagem.*;
import junit.framework.TestCase;


public class BooleanTeste extends TestCase {
	public void testBooleano() throws ErroVarNaoExiste, ErroDeTipo{
		Ambiente env = new Ambiente();
		Booleano faux = new Booleano(false);
		Booleano vrai = new Booleano(true);
		Expressao and = new And(faux,vrai);

		try {
			
			faux.avalia(env);
			vrai.avalia(env);
			
			Booleano testa = (Booleano)and.avalia(env);
			assertEquals(new Booleano(false).getValor(), faux.getValor());
			assertEquals(new Booleano(true).getValor(), vrai.getValor());
			assertEquals(new Booleano(false).getValor(),testa.getValor());
		} catch (ErroDeTipo e) {
			e.printStackTrace();
			
		}
		
	}
}
