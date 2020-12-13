/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tecladovirtual.teclados;

import tecladovirtual.bichos.*;
import tecladovirtual.teclas.Tecla;
import tecladovirtual.teclas.TeclaMenor;

/**
 *
 * @author iris
 */
public class TecladoAnimal extends Teclado {
    public TecladoAnimal (int qntdOitavas) {
        super(qntdOitavas, "animal");
    }
    
    public Animal getAnimal(int tipo, String cifra) {
        Tecla tecla = super.getTecla(tipo, cifra);
        if(tecla instanceof TeclaMenor) {
            return ((TeclaMenor) tecla).getAnimal();
        }
        return null;
    }
    
    public String getDescricaoAnimal(int tipo, String cifra) {
        Animal animal = this.getAnimal(tipo, cifra);
        
        if(animal == null) {
            return "";
        }
        
        if(animal instanceof Ave){            
            String voador = ((Ave) animal).getVoa()
                ? "É voador."
                : "Não é voador.";
            String cantante = ((Ave) animal).getCanta()
                ? "Canta."
                : "Não canta.";
            
            return animal.getNome() + '\n'
                + animal.getDescricao() + '\n' 
                + voador + ' '
                + cantante;
        }
        else if (animal instanceof Felino) {
            String domestico = ((Felino) animal).getDomestico()
                ? "É um animal doméstico."
                : "Não é animal doméstico.";
            
            return animal.getNome() + '\n'
                + animal.getDescricao() + '\n' 
                + domestico;
        }
        else {
            return animal.getNome() + '\n'
                + animal.getDescricao();
        }
    }
}
