package variaveis;

public class TipoString {
public static void main(String[] args) {
	String email = "Patricia.Hedler@itau-unibanco.com.br";
	System.out.println("original:" + email);
	System.out.println("Minuscula:" + email.toLowerCase());
	System.out.println("Maiuscula:" + email.toUpperCase());
	System.out.println("Quantidade caracteres:" + email.length());
	System.out.println("TEm arroba?"+ email.contains("@"));
	System.out.println("posi��o do @:" + email.indexOf("@"));
	System.out.println("� igual"+ email.equalsIgnoreCase("h@gama.com"));
	System.out.println("do 3� ao 5�"+ email.substring(2,5));
	
	
	if(email.contains("@")==true) {
		System.out.println("Usu�rio:" + email.substring(0,email.indexOf("@")));
	}
	
			
			

}
}
