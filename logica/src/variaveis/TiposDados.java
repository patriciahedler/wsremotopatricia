package variaveis;

public class TiposDados {
 //java ? orientado a objeto

	public static void main(String[] args) {
		String nome = "Patricia Hedler";
		int idade = 29;
		double altura = 1.68;
		double peso = 90;
		double imc = peso/(altura *altura);
		System.out.println("Nome:" +nome);
		System.out.println("Idade:"+idade);
		System.out.println("Altura:"+altura);
		System.out.printf("\nIMC:%.2f\n" , imc);
		System.out.printf("Ol? %s seu IMC ? %.1f", nome, imc);
		
	}

	
	
	
	
}
