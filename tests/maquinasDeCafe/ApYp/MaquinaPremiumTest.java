package maquinasDeCafe.ApYp;

import static org.junit.Assert.*;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;





public class MaquinaPremiumTest {

	MaquinaDeCafe maquina;
	
	@Before
	public void setup(){
		maquina= new MaquinaPremium();
		}

	
	@Test
	public void queDevuelveUnVasoAServir() {
		VasoDeCafe vaso = maquina.servirCafe();
		assertNotNull(vaso);
		
	}
	
	@Test
	public void sePuedeServirUnCafe() {
		maquina.servirCafe();
		Assert.assertTrue(maquina.puedeServir());
	}
	
	@Test
	public void seAgotaElCafe() {
		for(int i=0; i<100; i++) {
		maquina.servirCafe();
	}
		Assert.assertFalse(maquina.puedeServir());
    }
	
	
	@Test
	public void luegoDeAgotarElCafeSirveVasoVacio() {
		for(int i=0; i<100; i++) {
		maquina.servirCafe();
	}
		VasoDeCafe vaso = maquina.servirCafe();
		Assert.assertFalse(vaso.estaLleno());
		
}
	}
	


