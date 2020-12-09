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
public class Ave extends Animal {
    private boolean voa;
    private boolean canta;
    
    public Ave(String nome, String descricao, String caminhoSom, boolean voa, boolean canta) {
        super(nome, descricao, caminhoSom);
        this.voa = voa;
        this.canta = canta;
    }
    
    public Ave(String nome, String descricao, String caminhoSom) {
        super(nome, descricao, caminhoSom);
        this.voa = true;
        this.canta = true;
    }
}
