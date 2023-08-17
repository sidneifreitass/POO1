
package com.mycompany.primeiroprojetoo;

import javax.swing.JOptionPane;

public class PrincipalIMC {
	public static void main(String[] args) {
        
        int n = Integer.parseInt(JOptionPane.showInputDialog("Qtd. Pessoas:"));
        
        Pessoa pessoas[] = new Pessoa[n];
        
        String result = "";
        
        for (int i = 0; i < n; i++) {
            
            Pessoa p = new Pessoa();
            p.cadastro();
            pessoas[i] = p;
            result += p.exibirDados();
        }
        
        JOptionPane.showInputDialog(result);
    }
}




