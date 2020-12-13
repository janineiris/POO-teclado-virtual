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
public class Animal {
    private String caminhoSom;
    private String nome;
    private String descricao;
    
    public Animal(String nome, String descricao, String caminhoSom) {
        this.nome = nome;
        this.descricao = descricao;
        this.caminhoSom = caminhoSom;
    }
    
    public String getNome() { return this.nome; }
    public String getDescricao() { return this.descricao; }
    public String getCaminho() { return this.caminhoSom; }
    
    public void setNome(String nome) { this.nome = nome; }
    public void setDescricao(String descricao) { this.descricao = descricao; }
    public void setCaminho(String caminho) { this.caminhoSom = caminho; }
}
