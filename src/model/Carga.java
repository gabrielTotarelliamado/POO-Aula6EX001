package model;

public class Carga extends Veiculo {

	private int cargaMax;
	private int tara;

	public Carga() {
		super();
	}

	public int getCargaMax() {
		return cargaMax;
	}

	public void setCargaMax(int cargaMax) {
		this.cargaMax = cargaMax;
	}

	public int getTara() {
		return tara;
	}

	public void setTara(int tara) {
		this.tara = tara;
	}

	@Override
	public float calcVel(float velMax) {
		return 0;
	}

}
