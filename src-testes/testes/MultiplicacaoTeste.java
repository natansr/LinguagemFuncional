package testes;

import Tipos.IConst;
import br.unb.cic.linguagem.*;
import junit.framework.TestCase;

public class MultiplicacaoTeste extends TestCase {
	public void testMulti() throws ErroVarNaoExiste, ErroDeTipo{
		
		Ambiente env = new Ambiente();
		Expressao int2 = new IConst(2);
		Expressao int5 = new IConst(5);
		Expressao aplicaMulti = new Multiplicacao(int2,int5);

		
		try {
			IConst auxiliar = (IConst)aplicaMulti.avalia(env);
			assertEquals(new IConst(10).getValor(),auxiliar.getValor());
		} catch (ErroDeTipo e) {
			e.printStackTrace();
			
		}
	}
}
