package AtividadeFormativa;

import java.util.Random;
import java.util.Scanner;

public class Atividades {
    Scanner sc = new Scanner(System.in);
    Random rd = new Random();

    // 1.Crie uma Classe que crie uma Matriz de Linha determinada pelo Usuário e
    // Coluna determinadas pelo Usuário
    // Preencha a Matriz com valores aleatórios entre 0 e 9 e imprimia a matriz
    // Substitua os valores da matriz anterior pelo seguinte sistema:
    // se i>j valor = 1
    // se i==j valor = 0
    // se j>i valor = 2

    public void Atividade1() {

        int linhas;
        int colunas;
        System.out.println("Digite o valor do numero de linhas:");
        linhas = sc.nextInt();
        System.out.println("Digite o valor dos numeros das colunas:");
        colunas = sc.nextInt();
        int matriz[][] = new int[linhas][colunas];

        // Preenchendo matriz com valores aleatorios de 0,9

        for (int i = 0; i < linhas; i++) {
            for (int j = 0; j < colunas; j++) {
                matriz[i][j] = rd.nextInt(10);
            }
        }

        // imprimindo a matriz

        for (int i = 0; i < linhas; i++) {
            for (int j = 0; j < colunas; j++) {
                System.out.print(matriz[i][j] + " ");
            }
            System.out.println();
        }
        for (int i = 0; i < linhas; i++) {
            for (int j = 0; j < colunas; j++) {
                if (i > j) {
                    matriz[i][j] = 1;
                } else if (i == j) {
                    matriz[i][j] = 0;
                } else {
                    matriz[i][j] = 2;
                }
            }
        }

        System.out.println("Substituindo valores da Matriz");
        for (int i = 0; i < linhas; i++) {
            for (int j = 0; j < colunas; j++) {
                System.out.print(matriz[i][j] + " ");
            }
            System.out.println();
        }
    }

    // 2. Cria uma classe que:
    // Sortear um número de 0 a 1000 (dica: usar Math.random())
    // Pedir um palpite ao usuário. Se ele errar, informar se o palpite é maior ou
    // menor do que o número sorteado.
    // Pedir novos palpites até que o usuário acerte e, depois disso, mostrar em
    // quantas tentativas ele acertou.

    public void Atividade2() {

        // Sortear um numero de 0 a 1000
        int nDigitado = 0;
        int tentativas = 1;
        int nSorteado = (rd.nextInt(5));
        boolean acertou = false;
        while (acertou == false) {
            System.out.println("Digite o numero novamente ");
            nDigitado = sc.nextInt();
            if (nSorteado == nDigitado) {
                System.out.println("Parabéns! Você acertou o número sorteado em " + tentativas + " tentativa.");
                acertou = true;
            } else if (nDigitado < nSorteado) {
                System.out.println("o Numero sorteado e menor que o numero Digitado!");
            } else {
                System.out.println("o Numero sorteado e maior que o numero Digitado!");
            }

            tentativas++;
        }
    }
}
