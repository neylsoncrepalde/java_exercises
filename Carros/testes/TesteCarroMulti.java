import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;

public class TesteCarroMulti {
		
		CarroDeCorrida c;
	
		@Before
		public void inicializaCarro() {
			c = new CarroMulti(1.5, 100, "Teste");
		}
		
		@Test
		public void testeCarroParado() {
			assertEquals(0, c.getVelocidade());
		}
		
		@Test
		public void testeAcelerarUmaVez() {
			c.acelerar();
			assertEquals(10, c.getVelocidade());
		}
		
		@Test
		public void testeAcelerarDuasVezes() {
			c.acelerar();
			c.acelerar();
			assertEquals(15, c.getVelocidade());
		}
		
		@Test
		public void testeFrear() {
			c.acelerar();
			c.frear();
			assertEquals(5, c.getVelocidade());
		}
		
		@Test
		public void testeFrearAteZero() {
			c.acelerar();
			c.frear();
			c.frear();
			c.frear();
			c.frear();
			assertEquals(0, c.getVelocidade());
		}
		
		@Test
		public void acelerarAteMaximo() {
			for (int i=0; i<14; i++)
				c.acelerar();
			assertEquals(100, c.getVelocidade());
		}

}
