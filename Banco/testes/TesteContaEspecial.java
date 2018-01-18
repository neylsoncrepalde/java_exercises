import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class TesteContaEspecial extends Testes {
	
	@Before
	public void inicializaConta() {
		ContaCorrente cc = new ContaEspecial(100);
		cc.depositar(200);
	}
	
	

}
