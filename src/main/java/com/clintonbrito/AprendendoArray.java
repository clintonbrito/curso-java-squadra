package com.clintonbrito;

import java.util.Arrays;
import java.util.stream.IntStream;

public class AprendendoArray {
    int minhaVariavel = 10;
    int[] meuArray = null;
    String meuTexto = null;

    public static void main(String[] args) {
        //crio um array
        int primeiroArray[] = {6, 4, 7, 9, 5, 7, 8, 1, 0, 3};

        //coloco um valor dentro de um array
        primeiroArray[9] = 78;

        //para pegar o valor do array
        int minhaVariavel = primeiroArray[6];

        //assim eu crio um array vazio informando quantas posicoes eu tenho
        int segundoArray[] = new int[10];            //todos estarão preenchidos com o valor zero
        String[] arrayString = new String[10];        //todos os valores estarão preenchidos com null
        boolean[] arrayBoolean = new boolean[10];    //todos estarão preenchidos com valor false

        //
        int tamanho = 10;
        int[] terceiroArray = new int[tamanho];

        //
        for (int posicao = 0; posicao < primeiroArray.length; posicao++) //repete todos os comandos que estão dentro do { } dele
        {
            //peguei o elemento que estava dentro array pela posicao
            int numeroAtual = primeiroArray[posicao];

            //multipliquei o número atual por 2
            int dobro = numeroAtual * 2;

            //pega o dobro e coloca dentro do array (na posicao informada)
            primeiroArray[posicao] = dobro;

            // essa linha substitui os comandos das linhas 34, 37 e 40, só que faz tudo na mesma linha
            primeiroArray[posicao] = primeiroArray[posicao] * 2;
        }
    }
}
