package testes;

import Tipos.Booleano;
import br.unb.cic.linguagem.*;
import junit.framework.TestCase;

public class NegacaoTeste extends TestCase {
	public void testNegacao() throws ErroVarNaoExiste, ErroDeTipo{
		Ambiente env = new Ambiente();
		Booleano faux = new Booleano(false);
		Expressao aplicaNegacao = new Negacao(faux);

		try {
			
			faux.avalia(env);
			
			Booleano auxiliar = (Booleano)aplicaNegacao.avalia(env);
			assertEquals(new Booleano(true).getValor(), auxiliar.getValor());

		} catch (ErroDeTipo e) {
			e.printStackTrace();
			
		}
		
	}
}
