package heranca;

public class TesteEmpregado {

	public static void main(String[] args) {
		//nao instanciar o pai, só o filho
		Gerente g1 = new Gerente("Joana","123456",5000.,"ADM",10);
		//g1.setNome("Joana");
		//g1.setSalario(5000.);
		//g1.setCategoria("ADM");
		//g1.setNumeroEmpregados(10);
		//g1.setCpf("123456789");
		
		g1.aumentarSalario();
		
		System.out.println(g1);
		System.out.println(g1.getSalario());
		
	}

}
