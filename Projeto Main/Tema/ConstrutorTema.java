package Tema;

public class ConstrutorTema {
	
	public static void main(String[] args) {
		
		Tema Tema1 = new Tema(1,"victor",30,"Marrom");
		
		System.out.println(Tema1.getId());
		System.out.println(Tema1.getNome());
		System.out.println(Tema1.getValorAluguel());
		System.out.println(Tema1.getCorToalha());

	}

}

