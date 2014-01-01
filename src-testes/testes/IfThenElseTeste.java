package testes;
import Tipos.*;
import br.unb.cic.linguagem.*;
import junit.framework.TestCase;


public class IfThenElseTeste extends TestCase {
	public void testIfThenElse() throws ErroVarNaoExiste, ErroDeTipo{
		Ambiente env = new Ambiente();
		
		Booleano vrai = new Booleano(true);
		IConst int1 = new IConst(1);
		IConst int3 = new IConst(3);
		Expressao aplicaIfThenElse = new IfThenElse(vrai,int1,int3);
		
		//TESTA CONDICAO VERDADEIRA
		try {
			
			vrai.avalia(env);
			int1.avalia(env);
			int3.avalia(env);
			IConst auxiliar;
			auxiliar = (IConst)aplicaIfThenElse.avalia(env);

			assertEquals(new IConst(1).getValor(), auxiliar.getValor());
			
		} catch (ErroDeTipo e) {
			e.printStackTrace();
			
		}
		
		
		
		
	}
}
