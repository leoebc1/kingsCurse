/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package kingsCurse;

import java.util.Scanner;

/**
 *
 * @author LEONARDOESLABAOBARBO
 */
public class Aventura {

    private Personagem jogador;
    private Scanner sc;

    public Aventura(Personagem jogador) {
        this.jogador = jogador;
        this.sc = new Scanner(System.in);
    }

    public void evento01() {
        boolean loopEvento01 = true;
        while (loopEvento01) {
            App.limparConsole();
            System.out.println("Aventura 'A Taverna de Tennefort' iniciada!\n"
                    + "Você está na taverna movimentada da cidade de Tennefort.\n"
                    + "Você é " + this.jogador.getNome() + ", um mercenário de Vail Scaedu, um lugar distante, onde as lutas são ferozes.\n"
                    + "No entanto, após semanas tentando encontrar trabalho, você está sem dinheiro e em busca de uma oportunidade.\n"
                    + "A cidade de Tennefort tem sido sua casa temporária, mas o movimento está fraco nos últimos tempos, e você não conseguiu emprego nas últimas duas semanas.\n"
                    + "Você está sentado em uma mesa da taverna, observando as poucas pessoas que passam. O que você fará agora?");
            System.out.println("\n\n [1] - Acenar para o taverneiro\n[2] - Olhar em volta\n[3] - Levantar-se e sair");
            int opcaoUsuario = this.sc.nextInt();
            switch (opcaoUsuario) {
                case 1:
                    evento02();
                    loopEvento01 = false;
                    break;
                case 2:
                    evento03();
                    loopEvento01 = false;
                    break;
                case 3:
                    evento04();
                    loopEvento01 = false;
                    break;
                default:
                    System.out.println("Opcao invalida, tente de novo");
            }
        }
        sc.close();
    }

    private void evento02() {

    }

    private void evento03() {

    }

    private void evento04() {

    }

}
