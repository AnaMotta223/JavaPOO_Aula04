package exercicioaula4;

public class Freelancer extends Vendedor {
	private Integer diasTrabalhados;
	private Double valorDia;
	
	public Freelancer(String nome, String cpf, Integer diasTrabalhados, Double valorDia) {
		super(nome, cpf);
		this.diasTrabalhados = diasTrabalhados;
		this.valorDia = valorDia;
	}

	public Integer getDiasTrabalhados() {
		return diasTrabalhados;
	}

	public void setDiasTrabalhados(Integer diasTrabalhados) {
		this.diasTrabalhados = diasTrabalhados;
	}

	public Double getValorDia() {
		return valorDia;
	}

	public void setValorDia(Double valorDia) {
		this.valorDia = valorDia;
	}
	
	
}
