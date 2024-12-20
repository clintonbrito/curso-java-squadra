package com.clintonbrito;

public class ControleRemotoTV extends Object {
  private final int VALOR_MINIMO_VOLUME = 0;
  private final int VALOR_MAXIMO_VOLUME = 100;
  private int volumeAtual = 0;
  //
  private final int VALOR_MINIMO_CANAL = 1;
  private final int VALOR_MAXIMO_CANAL = 9999;
  private int canalAtual = 4;

  public void aumentarVolume() {
    //volume for menor que o limite, aumenta
    if (volumeAtual < VALOR_MAXIMO_VOLUME) {
      volumeAtual = volumeAtual + 1;
    }
  }

  public void baixarVolume() {
    //volume for maior que o limite mínimo, diminui
    if (volumeAtual > VALOR_MINIMO_VOLUME) {
      volumeAtual = volumeAtual - 1;
    }
  }

  public void aumentarCanal() {
    //Vou incrementar o canal se o valor do canal não chegou ao limite máximo
    if (canalAtual < VALOR_MAXIMO_CANAL) {
      canalAtual = canalAtual + 1;
    } else {
      canalAtual = VALOR_MINIMO_CANAL; //volta para o começo, se eu chegar ao limite máximo
    }
  }

  public void diminuirCanal() {
    //Vou diminuir o valor do canal, se o canal atual não for menor que o valor mínimo
    if (canalAtual > VALOR_MINIMO_CANAL) {
      canalAtual = canalAtual - 1;
    } else {
      canalAtual = VALOR_MAXIMO_CANAL;
    }
  }

  public String toString() {
    return "O canal atual é: " + canalAtual + " e o volume está em " + volumeAtual;
  }

  public static void main(String[] args) {
    ControleRemotoTV controle = new ControleRemotoTV();

//    for (int canal = 0; canal < controle.VALOR_MAXIMO_CANAL; canal ++) {
//        controle.aumentarCanal();
//      if (controle.canalAtual % 10 == 5) {
//        controle.aumentarVolume();
//      }
//    }
//
//    System.out.println(controle);

    for (int a = 0; controle.canalAtual < controle.VALOR_MAXIMO_CANAL; controle.aumentarCanal()) {
      if (controle.canalAtual % 10 == 5) {
        controle.aumentarVolume();
      }
    }

    System.out.println(controle);
  }

  //crie um método main que, você aumente o canal até de 1 até 9999
  //neste exercício, cada vez que você passar por um valor que termine em 5, no canal, você deve aumentar o volume em 1
  //Ao final, qual o valor do volume?
}