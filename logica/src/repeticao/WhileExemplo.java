package repeticao;

import javax.swing.JOptionPane;

public class WhileExemplo {
public static void main(String[] args) {
	// la�o repetitivo
	
	String email = JOptionPane.showInputDialog("Email");
	
	while(email.contains("@" )==false){
		email = JOptionPane.showInputDialog("Email com @");
		
	}
	
	System.out.println("Usu�rio"+email.substring(0, email.indexOf("@") ));
	
	String nome = JOptionPane.showInputDialog("nome");
	
	while (nome.length()<3 || nome.length() > 15) {
		nome = JOptionPane.showInputDialog("nome");
	}
	System.out.println(nome);
}

}
