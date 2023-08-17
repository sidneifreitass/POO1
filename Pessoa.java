
package com.mycompany.primeiroprojetoo;

import javax.swing.JOptionPane;
public class Pessoa {
	  String nome;
	    Double peso;
	    Double altura;
	    char sexo;
	    
	    void cadastro() {
	        
	        nome = JOptionPane.showInputDialog("Informe o nome:");
	        sexo = JOptionPane.showInputDialog("Sexo:").charAt(0);
	        peso = Double.valueOf(JOptionPane.showInputDialog("Peso:"));
	        altura = Double.valueOf(JOptionPane.showInputDialog("Altura:"));
	        
	    }
	    
	    double calculoIMC() {
	        
	        return peso/(altura * altura);
	    }
	    
	    String avaliacao() {
	        
	        String avaliacao = "";
	        double imc = calculoIMC();
	        
	        if ("M".equals(sexo)) {
	                if (imc < 20.7) {
	                   avaliacao = "Abaixo do peso";
	                }
	                if (imc >= 20.7 && imc < 26.4) {
	                    avaliacao = "Peso ideal";
	                }
	                if (imc >= 26.5 && imc < 27.8) {
	                    avaliacao = "Pouco acima do peso";
	                }
	                if (imc >= 27.9 && imc < 31.1) {
	                    avaliacao = "Acima do peso";
	                }
	                if (imc >= 31.2) {
	                    avaliacao = "Obesidade";
	                }
	            } else if ("F".equals(sexo)) {
	                if (imc < 19.1) {
	                    avaliacao = "Abaixo do peso";
	                }
	                if (imc >= 19.1 && imc < 25.8) {
	                    avaliacao = "Peso ideal";
	                }
	                if (imc >= 25.9 && imc < 27.3) {
	                    avaliacao = "Pouco acima do peso";
	                }
	                if (imc >= 27.4 && imc < 32.3) {
	                    avaliacao = "Acima do peso";
	                }
	                if (imc >= 32.4) {
	                    avaliacao = "Obesidade";
	                }
	            }
	        
	        return avaliacao;
	    }
	    
	    String exibirDados() {
	        
	        return nome + " - " + calculoIMC() + " - " + avaliacao() + "\n";
	    }
	}


