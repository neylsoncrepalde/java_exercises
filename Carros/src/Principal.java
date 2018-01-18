
public class Principal {

	public static void main(String[] args) {
		Corrida corridaDaAmizade = new Corrida(2000);
		
		corridaDaAmizade.adicionaCarro(new CarroSoma(10, 110, "CarroA"));
		corridaDaAmizade.adicionaCarro(new CarroSoma(8, 140, "CarroB"));
		corridaDaAmizade.adicionaCarro(new CarroMulti(1.7, 100, "CarroC"));
		corridaDaAmizade.adicionaCarro(new CarroMulti(1.4, 110, "CarroD"));
		
		corridaDaAmizade.umDoisTresEJa();

	}

}
