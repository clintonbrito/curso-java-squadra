package com.clintonbrito;

import java.util.Arrays;

public class ArrayBidimensional {
    public static void main(String[] args) {

        int[][] arrayDeEntrada = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}, {10, 11, 12}};
        int[][] arrayDeSaida = new int[5][4];

        for(int linha = 0; linha < arrayDeEntrada.length; linha++) {

            int soma = 0;

            for(int coluna = 0; coluna < arrayDeEntrada[linha].length; coluna++) {
                arrayDeSaida[linha][coluna] = arrayDeEntrada[linha][coluna] * 2;
                soma += arrayDeSaida[linha][coluna];
            }

            arrayDeSaida[linha][arrayDeEntrada[linha].length] = soma;
        }

        for (int coluna = 0; coluna < arrayDeEntrada.length; coluna++) {
            int multiplicacao = 1;
            for (int linha = 0; linha < arrayDeEntrada.length; linha++) {
                multiplicacao *= arrayDeSaida[linha][coluna];
            }
            arrayDeSaida[arrayDeSaida.length - 1][coluna] = multiplicacao;
        }

        System.out.println(Arrays.deepToString(arrayDeEntrada));
        System.out.println(Arrays.deepToString(arrayDeSaida));

    }
}
