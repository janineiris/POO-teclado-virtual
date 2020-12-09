/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tecladovirtual.bichos;

/**
 *
 * @author iris
 */
public class Felino extends Animal {
    private boolean domestico;
    private boolean predador = true;
    
    public Felino(String nome, String descricao, String caminhoSom, boolean domestico) {
        super(nome, descricao, caminhoSom);
        this.domestico = domestico;
    }
}
