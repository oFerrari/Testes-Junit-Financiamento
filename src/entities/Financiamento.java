package entities;

public class Financiamento {
	private Double totalFinanciado;
	private Double rendaDoCliente;
	private Integer meses;
	
	public Financiamento() {
		
	}
	
	public Financiamento(Double totalFinanciado, Double rendaDoCliente, Integer meses) {
		validarFinanciamento(totalFinanciado,rendaDoCliente, meses);
		this.totalFinanciado = totalFinanciado;
		this.rendaDoCliente = rendaDoCliente;
		this.meses = meses;
	}
	
	public double entrada(){
		return totalFinanciado * 0.2;
	}
	
	public Double prestacao() {
		return (totalFinanciado - entrada())/meses;
	}

	public Double getTotalFinanciamento() {
		return totalFinanciado;
	}

	public void setTotalFinanciamento(Double totalFinanciamento) {
		validarFinanciamento(totalFinanciado,rendaDoCliente, meses);
		this.totalFinanciado = totalFinanciamento;
	}

	public Double getRendaDoCliente() {
		return rendaDoCliente;
	}

	public void setRendaDoCliente(Double rendaDoCliente) {
		validarFinanciamento(totalFinanciado,rendaDoCliente, meses);
		this.rendaDoCliente = rendaDoCliente;
	}

	public Integer getMeses() {
		return meses;
	}

	public void setMeses(Integer meses) {
		validarFinanciamento(totalFinanciado,rendaDoCliente, meses);
		this.meses = meses;
	}
	
	//O valor da prestação não pode ser maior que a metade da renda mensal do cliente
	public void validarFinanciamento(Double totalFinanciado, Double rendaDoCliente, Integer meses) {
		if(((totalFinanciado * 0.8)/meses) > (rendaDoCliente/2)) {
			throw new IllegalArgumentException("A prestação não pode ser maior do que a metade da renda do cliente");
		}
	}
	
}
	