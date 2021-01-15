public class TestaCondicional2 {
	public static void main(String[] args) {
		System.out.println("Testando condicionais");
		int idade = 16;
		int quantidadeDePessoas = 3;
		boolean acompanhado = quantidadeDePessoas >= 2;
		System.out.println("Valor de acompanhado = " + acompanhado);
		if (idade >= 18 || quantidadeDePessoas >= 2) {
			System.out.println("Seja bem vindo");
		} else {
				System.out.println("Infelizmente você não pode entrar");
			
		}
	}
}
