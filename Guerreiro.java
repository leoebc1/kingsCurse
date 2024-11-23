/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package kingsCurse;

/**
 *
 * @author LEONARDOESLABAOBARBO
 */
public class Guerreiro extends Personagem {

    
    public Guerreiro(String nome) {
        super(nome);
        this.forca = Dados.rolarMultiplo(6, 2) + 3;
        this.vida = Dados.rolarMultiplo(6, 5) + 5;
        this.mana = Dados.rolarDado(6) - 2;
        this.agilidade = Dados.rolarDado(6);
        this.aptidaoMagica = Dados.rolarDado(6) - 3;
        this.armaPrincipal = new Arma("Espada", "comum", "melee", 2, 0);
    }
    
    
    public int ataqueMelee(int armaduraInimigo, int arma){
        int rolagem = Dados.rolarDado(6);
        System.out.println("Você golpeia com " + this.armaPrincipal.getNome());
        if ((rolagem + this.agilidade) > armaduraInimigo){
            return Dados.rolarDado(6) + this.forca;
        } else {
            return 0;
        }
    }
    
    
}
