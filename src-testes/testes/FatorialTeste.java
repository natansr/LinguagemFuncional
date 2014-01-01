package testes;

import br.unb.cic.linguagem.*;
import Tipos.*;
import junit.framework.TestCase;

public class FatorialTeste extends TestCase {
	public void testFatorial() throws ErroVarNaoExiste, ErroDeTipo{
		Ambiente env = new Ambiente();
		IConst int5 = new IConst(5);
		Expressao fatorial = new Fatorial(int5);
		
		
		//TESTANDO A FUNCAO RECURSIVA FATORIAL
		
try {
			
			IConst auxiliar;
			int5.avalia(env);
			auxiliar = (IConst)fatorial.avaliaExp(env);

			assertEquals(new IConst(120).getValor(), auxiliar.getValor());
			
		} catch (ErroDeTipo e) {
			e.printStackTrace();
			
		}
	}
}
