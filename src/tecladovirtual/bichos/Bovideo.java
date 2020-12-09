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
public class Bovideo extends Animal {
    private boolean ruminante;
    
    public Bovideo(String nome, String descricao, String caminhoSom, boolean ruminante) {
        super(nome, descricao, caminhoSom);
        this.ruminante = ruminante;
    }
}
