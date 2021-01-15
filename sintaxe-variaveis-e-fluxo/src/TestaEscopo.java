public class TestaEscopo{
	public static void main(String[] args) {
		System.out.println("Testando condicionais");
		int idade = 16;
		int quantidadeDePessoas = 1;
		//boolean acompanhado = quantidadeDePessoas >= 2;
		
		boolean acompanhado;
		if (quantidadeDePessoas >= 2) {
			acompanhado = true;
		} else {
				acompanhado = false;
			
		}
		
		System.out.println("Valor de acompanhado = " + acompanhado);
	}
}
