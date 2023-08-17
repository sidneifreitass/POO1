
package com.mycompany.primeiroprojetoo;


import com.mycompany.primeiroprojetoo.Pessoa;
import java.util.ArrayList;
import javax.swing.JOptionPane;

public class PrincipalIMC2 {
	public static void main(String[] args) {

        ArrayList<Pessoa> pessoas = new ArrayList<>();
	
        String menu = "1 - Cadastrar\n "
                + "2 - Listar\n"
                + "3 - Sair!";
        
        int op = 0;
        
        do  {

            op = Integer.parseInt(JOptionPane.showInputDialog(menu));
            
            if (op == 1){
                Pessoa p = new Pessoa();
                p.cadastro();
                pessoas.add(p);
            }
            
            if (op == 2) {
                
                String result = "Pessoas a cadastrar\n\n";
                
                for (Pessoa pessoa : pessoas) {
                    
                    result += pessoa.exibirDados();
                }
                
                JOptionPane.showConfirmDialog(null, result);
            }
            
        } while (op != 3);
    }
}



