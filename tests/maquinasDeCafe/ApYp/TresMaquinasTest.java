package maquinasDeCafe.ApYp;

import org.junit.Test;

public class TresMaquinasTest {

	
	@Test
	public void test() {
	MaquinaDeCafe maquinaEco = new MaquinaEconomica();
	MaquinaDeCafe maquinaEsta = new MaquinaEstafadora();
	MaquinaDeCafe maquinaPre = new MaquinaPremium();
	
	MaquinaDeCafe [] maquinas = new MaquinaDeCafe[3];
	 
	maquinas[0] = maquinaEco;
	maquinas[1] = maquinaEsta;
	maquinas[2] = maquinaPre;
	
	for (MaquinaDeCafe cadaUna: maquinas) {
		System.out.println(cadaUna.servirCafe());
	}
	for (MaquinaDeCafe cadaUna: maquinas) {
		System.out.println(cadaUna.servirCafe());
	}
	
		
	}

}
