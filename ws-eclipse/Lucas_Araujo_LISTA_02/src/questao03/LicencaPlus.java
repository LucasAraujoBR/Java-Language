package questao03;

import java.time.LocalDateTime;

public class LicencaPlus extends Receita{
	protected int totalContas;
	
	public LicencaPlus(int totalContas) {
		super();
		this.totalContas = totalContas;
	}

	@Override
	public LocalDateTime getData() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String getDescricao() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public double calcularTotal() {
		totalContas *=35.00;
		return (double) totalContas;
	}

}