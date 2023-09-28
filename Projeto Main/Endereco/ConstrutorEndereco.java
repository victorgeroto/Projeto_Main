package Endereco;

public class ConstrutorEndereco {

	public static void main(String[] args) {
		Endereco Endereco1 = new Endereco(1,"Rua do bobo",34,"Casa","Bancarios","Itapetininga","18212207","sp");
		
		System.out.println(Endereco1.getId());
		System.out.println(Endereco1.getLogradouro());
		System.out.println(Endereco1.getNumero());
		System.out.println(Endereco1.getComplemento());
		System.out.println(Endereco1.getBairro());
		System.out.println(Endereco1.getCidade());
		System.out.println(Endereco1.getCep());
		System.out.println(Endereco1.getUf());
		
	}

}
