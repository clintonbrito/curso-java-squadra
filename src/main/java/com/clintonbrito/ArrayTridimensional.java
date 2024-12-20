package com.clintonbrito;

import com.github.ricksbrown.cowsay.plugin.CowExecutor;

import java.util.Scanner;

public class ArrayTridimensional {
    public static void main(String[] args) {

        int numDeDimensoes = 3;
        int numDeLinhas = 0;
        int numDeColunas = 0;

        // Pegar os valores de entrada do número de linhas e colunas via terminal pelo Scanner
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite o número de linhas: ");
        numDeLinhas = scanner.nextInt();
        System.out.println("Digite o número de colunas: ");
        numDeColunas = scanner.nextInt();

        int[][][] arrayDeEntrada = new int[numDeDimensoes][numDeLinhas][numDeColunas];
        int[][][] arrayDeSaida = new int[numDeDimensoes][numDeLinhas + 1][numDeColunas + 1];

        int valorInicial = 1;

        // Populando o array tridimensional
        for (int dimensao = 0; dimensao < numDeDimensoes; dimensao++) {
            for (int linha = 0; linha < numDeLinhas; linha++) {
                for (int coluna = 0; coluna < numDeColunas; coluna++) {
                    if (dimensao == 0) {
                        arrayDeEntrada[dimensao][linha][coluna] = valorInicial;
                        valorInicial++;
                    } else if (dimensao == 1) {
                        arrayDeEntrada[dimensao][linha][coluna] = arrayDeEntrada[0][linha][coluna] * 2;
                    } else {
                        arrayDeEntrada[dimensao][linha][coluna] = arrayDeEntrada[1][linha][coluna] * 3;
                        valorInicial++;
                    }
                }
            }
        }

        // Calculando a soma das linhas e armazenando no array de saída
        for (int dimensao = 0; dimensao < numDeDimensoes; dimensao++) {
            for (int linha = 0; linha < numDeLinhas; linha++) {
                int soma = 0;
                for (int coluna = 0; coluna < numDeColunas; coluna++) {
                    arrayDeSaida[dimensao][linha][coluna] = arrayDeEntrada[dimensao][linha][coluna] * 2;
                    soma += arrayDeSaida[dimensao][linha][coluna];
                }
                arrayDeSaida[dimensao][linha][numDeColunas] = soma;
            }
        }

        // Calculando a soma das colunas e armazenando no array de saída
        for (int dimensao = 0; dimensao < numDeDimensoes; dimensao++) {
            for (int coluna = 0; coluna < numDeColunas + 1; coluna++) {

                int soma = 0;

                for (int linha = 0; linha < numDeLinhas; linha++) {
                    soma += arrayDeSaida[dimensao][linha][coluna];
                }
                arrayDeSaida[dimensao][numDeLinhas][coluna] = soma;
            }
        }

        // Capturando a saída do array de entrada
        StringBuilder entradaBuilder = new StringBuilder();
        entradaBuilder.append("ARRAY TRIDIMENSIONAL DE ENTRADA\n");
        for (int dimensao = 0; dimensao < numDeDimensoes; dimensao++) {
            entradaBuilder.append("Dimensão: ").append(dimensao).append("\n");
            for (int linha = 0; linha < numDeLinhas; linha++) {
                for (int coluna = 0; coluna < numDeColunas; coluna++) {
                    entradaBuilder.append(String.format("%5d ", arrayDeEntrada[dimensao][linha][coluna]));
                }
                entradaBuilder.append("\n");
            }
            entradaBuilder.append("\n");
        }

        // Capturando a saída do array de saída
        StringBuilder saidaBuilder = new StringBuilder();
        saidaBuilder.append("ARRAY TRIDIMENSIONAL DE SAÍDA\n");
        for (int dimensao = 0; dimensao < numDeDimensoes; dimensao++) {
            saidaBuilder.append("Dimensão: ").append(dimensao).append("\n");
            for (int linha = 0; linha < numDeLinhas + 1; linha++) {
                for (int coluna = 0; coluna < numDeColunas + 1; coluna++) {
                    saidaBuilder.append(String.format("%5d ", arrayDeSaida[dimensao][linha][coluna]));
                }
                saidaBuilder.append("\n");
            }
            saidaBuilder.append("\n");
        }

//        Concatenando as saídas
//        String output = entradaBuilder.toString() + saidaBuilder.toString();

        // Usando cowsay para imprimir a saída
        CowExecutor cowExecutorEntrada = new CowExecutor();
        cowExecutorEntrada.setCowfile("default");
        cowExecutorEntrada.setMessage(entradaBuilder.toString());
        String resultEntrada = cowExecutorEntrada.execute();

        CowExecutor cowExecutorSaida = new CowExecutor();
        cowExecutorSaida.setCowfile("tux");
        cowExecutorSaida.setMessage(saidaBuilder.toString());
        String resultSaida = cowExecutorSaida.execute();

        System.out.println(resultEntrada);
        System.out.println(resultSaida);
    }
}
