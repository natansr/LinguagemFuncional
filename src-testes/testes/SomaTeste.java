package testes;

import Tipos.IConst;
import br.unb.cic.linguagem.*;
import junit.framework.TestCase;


public class SomaTeste extends TestCase {

	
	public void testSoma() throws ErroVarNaoExiste, ErroDeTipo{
		
		Ambiente env = new Ambiente();
		Expressao int1 = new IConst(1);
		Expressao int2 = new IConst(2);
		Expressao aplicaSoma = new Soma(int1,int2);

		
		try {
			IConst auxiliar = (IConst)aplicaSoma.avalia(env);
			assertEquals(new IConst(3).getValor(),auxiliar.getValor());
		} catch (ErroDeTipo e) {
			e.printStackTrace();
			
		}
	}
}
