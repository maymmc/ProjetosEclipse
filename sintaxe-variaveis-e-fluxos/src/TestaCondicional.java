public class TestaCondicional {
	public static void main(String[] args) {

		int idade = 17;
		int quantidadePessoas = 3;
		
		if (idade >= 18) {
			System.out.println("Você tem mais de 18");
			System.out.println("seja bem vindo");
		
		} else {
			if (quantidadePessoas >= 2) {
				System.out.println("você não tem 18, mas " + "pode entrar, pois está acompanhado");
		
			} else {
				System.out.println("infelizmente você não pode entrar");
			}
		}
	}
}