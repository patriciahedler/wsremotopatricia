package decisao;

import javax.swing.JOptionPane;

public class DesafioDecisao {
	//exerc?cio 1 Di?ria Hotel
public static void main(String[] args) {
	short ndiarias =  Short.parseShort(JOptionPane.showInputDialog("Digite o n?mero de di?rias"));
	
	if(ndiarias> 15) {
		System.out.println("Total conta ? R$" + (80+5.5)*ndiarias);
	}else if (ndiarias==15) {
		System.out.println("Total conta ? R$" + (80+6)*ndiarias);
	}else {
			System.out.println("Total conta ? R$" + (80+8)*ndiarias);
		
	}
}
}
