package testes;

import Tipos.Booleano;
import br.unb.cic.linguagem.*;
import junit.framework.TestCase;

public class OrTeste extends TestCase {
	public void testOr() throws ErroVarNaoExiste, ErroDeTipo{
		Ambiente env = new Ambiente();
		Booleano faux = new Booleano(false);
		Booleano vrai = new Booleano(true);
		Expressao aplicaOr = new Or(faux,vrai);

		try {
			
			faux.avalia(env);
			vrai.avalia(env);
			
			Booleano auxiliar = (Booleano)aplicaOr.avalia(env);
			assertEquals(new Booleano(true).getValor(),auxiliar.getValor());
		} catch (ErroDeTipo e) {
			e.printStackTrace();
			
		}
		
	}
}
