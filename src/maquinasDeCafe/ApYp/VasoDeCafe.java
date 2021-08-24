package maquinasDeCafe.ApYp;

public class VasoDeCafe {
	private boolean lleno = true;

	
	
	public VasoDeCafe(boolean lleno) {
		this.lleno = lleno;
	}



	@Override
	public String toString() {
		return "VasoDeCafe [lleno=" + lleno + "]";
	}



	public boolean estaLleno() {
		return this.lleno;
	}
}
