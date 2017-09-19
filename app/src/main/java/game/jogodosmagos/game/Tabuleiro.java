package game.jogodosmagos.game;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * Created by Junior on 19/09/2017.
 */

public class Tabuleiro {
    private String[][] tabuleiro = new String[8][8];
    private String[] elementosSorteados = new String[8];
    private List<Integer> numeros = new ArrayList<Integer>();
    private String elementos[] = { "Asa de Morcego", "Sapo", "Veneno de Cobra", "Escama de Sereia", "Pena de Aguia", "Besouro", "Cogumelo", "Escorpiao" };


    public String[][] iniciarJogo(){

        //incluindo numeros
        int i = 0;
        for (i = 0; i < 8; i++) {
            numeros.add(i);

        }
        //embaralhando a lista
        Collections.shuffle(numeros);

        //adiciona ao vetor os elementos sorteados
        for (int i1 = 0; i1 < 8; i1++) {
            elementosSorteados[i1] = elementos[numeros.get(i1)];

        }
        //adiciona os elementos sorteados ao tabuleiro
        int ls = 0;
        for (ls = 0; ls < 8; ls++) {
            tabuleiro[ls][ls] = elementosSorteados[ls];

        }

        for (int linha = 0; linha < 8; linha++) {
            for (int coluna = 0; coluna < 8; coluna++) {
                // linha 0
                tabuleiro[0][1] = "neutro";
                tabuleiro[0][2] = "pos verm";
                tabuleiro[0][3] = "pos azul";
                tabuleiro[0][4] = "pos verm";
                tabuleiro[0][5] = "pos verd";
                tabuleiro[0][6] = "pos verd";
                tabuleiro[0][7] = "pos azul";

                // linha 1
                tabuleiro[1][2] = "neg azul";
                tabuleiro[1][3] = "neg verm";
                tabuleiro[1][4] = "neg verd";
                tabuleiro[1][5] = "neg verm";
                tabuleiro[1][6] = "neg azul";
                tabuleiro[1][7] = "neg verd";

                // linha 2
                tabuleiro[2][3] = "neutro";
                tabuleiro[2][4] = "neg verd";
                tabuleiro[2][5] = "neg azul";
                tabuleiro[2][6] = "pos verm";
                tabuleiro[2][7] = "neg verd";

                // linha 3
                tabuleiro[3][4] = "pos azul";
                tabuleiro[3][5] = "pos verd";
                tabuleiro[3][6] = "pos verd";
                tabuleiro[3][7] = "neg verm";

                // linha 4
                tabuleiro[4][5] = "neutro";
                tabuleiro[4][6] = "pos verm";
                tabuleiro[4][7] = "pos azul";

                // linha 5
                tabuleiro[5][6] = "neg azul";
                tabuleiro[5][7] = "neg verm";

                // linha 6
                tabuleiro[6][7] = "neutro";

                System.out.print("    " + tabuleiro[linha][coluna]);
            }
        }
        return tabuleiro;
    }
}
