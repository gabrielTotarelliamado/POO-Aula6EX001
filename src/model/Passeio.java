package model;

public class Passeio extends Veiculo {

	private int qtdPassageiros;

	public Passeio() {
		super();
	}

	public int getQtdPassageiros() {
		return qtdPassageiros;
	}

	public void setQtdPassageiros(int qtdPassageiros) {
		this.qtdPassageiros = qtdPassageiros;
	}

	@Override
	public float calcVel(float velMax) {
		return 0;
	}

}
