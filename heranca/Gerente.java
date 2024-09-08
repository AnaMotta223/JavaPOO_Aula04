package heranca;

//subclasse - que herda de empregado
public class Gerente extends Empregado {
	private String categoria;
	private Integer numeroEmpregados;
	
	public Gerente(String nome, String cpf, Double salario, String categoria, Integer numeroEmpregados) {
		super(nome, cpf, salario);
		this.categoria = categoria;
		this.numeroEmpregados = numeroEmpregados;
	}
	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return super.toString() + " categoria"+categoria+" numero de empregados "+ numeroEmpregados;
	}
	
	@Override // modificacao do metodo pai
	public void aumentarSalario() {
		salario *= 1.15;
	}
	
	public String getCategoria() {
		return categoria;
	
	}
	public void setCategoria(String categoria) {
		this.categoria = categoria;
	}
	public Integer getNumeroEmpregados() {
		return numeroEmpregados;
	}
	public void setNumeroEmpregados(Integer numeroEmpregados) {
		this.numeroEmpregados = numeroEmpregados;
	}
	
}
