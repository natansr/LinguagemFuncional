package testes;

import Tipos.*;
import br.unb.cic.linguagem.*;
import junit.framework.TestCase;

public class IConstTeste extends TestCase {

	public void testConstrutor() throws ErroVarNaoExiste, ErroDeTipo{
		Ambiente env = new Ambiente();
		IConst int2 = new IConst(2); 
		IConst int5 = new IConst(5);

		try {
			
			int2.avalia(env);
			int5.avalia(env);
			assertEquals(new IConst(2).getValor(), int2.getValor());
			assertEquals(new IConst(5).getValor(), int5.getValor());
		} catch (ErroDeTipo e) {
			e.printStackTrace();
			
		}
		
	}
}
