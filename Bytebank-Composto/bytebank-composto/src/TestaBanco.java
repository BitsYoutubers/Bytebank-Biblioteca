
public class TestaBanco {

	public static void main(String[] args) {
		Cliente teodoro = new Cliente();
		teodoro.nome = "Teodoro Matiuzzi";
		teodoro.cpf = "432.909.320-20";
		teodoro.profissao = "Programador";
		
		// associa o cliente Teodoro a conta contaDoTeodoro
		Conta contaDoTeodoro = new Conta();
		contaDoTeodoro.deposita(500);
		
		contaDoTeodoro.titular = teodoro;
		System.out.println(contaDoTeodoro.titular.nome);
		System.out.println(contaDoTeodoro.titular);
		System.out.println(teodoro);
	}
}
