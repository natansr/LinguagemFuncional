package testes;

import Tipos.IConst;
import br.unb.cic.linguagem.*;
import junit.framework.TestCase;

public class SubtracaoTeste extends TestCase {

	public void testSubtracao() throws ErroVarNaoExiste, ErroDeTipo{
		
		Ambiente env = new Ambiente();
		Expressao int5 = new IConst(5);
		Expressao int2 = new IConst(2);
		Expressao aplicaSubtracao = new Subtracao(int5,int2);

		
		try {
			IConst auxiliar = (IConst)aplicaSubtracao.avalia(env);
			assertEquals(new IConst(3).getValor(),auxiliar.getValor());
		} catch (ErroDeTipo e) {
			e.printStackTrace();
			
		}
	}
}
