
public class TestaConta {

	public static void main(String[] args) {
		Conta contaDoJose = new Conta();
		System.out.println(contaDoJose.saldo);
		contaDoJose.titular = new Cliente();
		
		System.out.println(contaDoJose.titular);
		contaDoJose.titular.nome = "José";
		System.out.println(contaDoJose.titular.nome);
	}
}
