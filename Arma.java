/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package kingsCurse;

/**
 *
 * @author LEONARDOESLABAOBARBO
 */
public class Arma {

    protected String nome;
    protected String tipo;
    protected String distancia;
    protected int bonusMelee;
    protected int bonusRanged;

    public Arma(String nome, String tipo, String distancia, int bonusMelee, int bonusRanged) {
        this.nome = nome;
        this.tipo = tipo;
        this.distancia = distancia;
        this.bonusMelee = bonusMelee;
        this.bonusRanged = bonusRanged;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getDistancia() {
        return distancia;
    }

    public void setDistancia(String distancia) {
        this.distancia = distancia;
    }

    public int getBonusMelee() {
        return bonusMelee;
    }

    public void setBonusMelee(int bonusMelee) {
        this.bonusMelee = bonusMelee;
    }

    public int getBonusRanged() {
        return bonusRanged;
    }

    public void setBonusRanged(int bonusRanged) {
        this.bonusRanged = bonusRanged;
    }

}
