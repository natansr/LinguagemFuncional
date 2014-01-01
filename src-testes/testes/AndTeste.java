package testes;

import Tipos.*;
import br.unb.cic.linguagem.*;
import junit.framework.TestCase;

public class AndTeste extends TestCase {
	public void testAnd() throws ErroVarNaoExiste, ErroDeTipo{
		Ambiente env = new Ambiente();
		Booleano faux = new Booleano(false);
		Booleano vrai = new Booleano(true);
		Expressao aplicaAnd = new And(faux,vrai);

		try {
			
			faux.avalia(env);
			vrai.avalia(env);
			
			Booleano auxiliar = (Booleano)aplicaAnd.avalia(env);
			assertEquals(new Booleano(false).getValor(),auxiliar.getValor());
		} catch (ErroDeTipo e) {
			e.printStackTrace();
			
		}
		
	}
	
}
