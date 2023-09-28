package Cliente;

public class ConstrutorCliente {

	public static void main(String[] args) {
		Cliente Cliente1 = new Cliente(1,"Joao","15997687654","122-131-243.12","645653587");
		
		System.out.println(Cliente1.getId());
		System.out.println(Cliente1.getNome());
		System.out.println(Cliente1.getFone());
		System.out.println(Cliente1.getCpf());
		System.out.println(Cliente1.getRg());
	}

}