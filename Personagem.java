/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package kingsCurse;

/**
 *
 * @author LEONARDOESLABAOBARBO
 */
public class Personagem {

    protected String nome;
    protected int forca;
    protected int vida;
    protected int mana;
    protected int aptidaoMagica;
    protected int agilidade;
    protected Arma armaPrincipal;
    
    public Personagem(String nome) {
        this.nome = nome;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getForca() {
        return forca;
    }

    public void setForca(int forca) {
        this.forca = forca;
    }

    public int getVida() {
        return vida;
    }

    public void setVida(int vida) {
        this.vida = vida;
    }

    public int getMana() {
        return mana;
    }

    public void setMana(int mana) {
        this.mana = mana;
    }

    public int getAgilidade() {
        return agilidade;
    }

    public void setAgilidade(int agilidade) {
        this.agilidade = agilidade;
    }
    
    public int getAptidaoMagica() {
        return aptidaoMagica;
    }

    public void setAptidaoMagica(int aptidaoMagica) {
        this.aptidaoMagica = aptidaoMagica;
    }

    public void receberDano(int danoRecebido) {
        this.vida -= danoRecebido;
    }

    public int ataqueMelee(int armaduraInimigo) {
        int rolagem = Dados.rolarDado(6);
        if ((rolagem + this.agilidade) > armaduraInimigo) {
            return Dados.rolarDado(6) + this.forca;
        } else {
            return 0;
        }
    }

    public int ataqueRanged(int armaduraInimigo) {
        int rolagem = Dados.rolarDado(6);
        if ((rolagem + this.agilidade) > armaduraInimigo) {
            return Dados.rolarDado(6) + this.forca;
        } else {
            return 0;
        }
    }
}
