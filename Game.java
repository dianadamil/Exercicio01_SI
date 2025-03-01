import java.util.Random;
import java.util.Scanner;

public class Game {

    private static void initializeBoard(int[][] tabuleiro) { // Inicializa o tabuleiro com 2 peças aleatórias
        addRandomPeca(tabuleiro);
        addRandomPeca(tabuleiro);
    }

    private static void addRandomPeca(int[][] tabuleiro) {
        Random rand = new Random();
        
        int row, col;
        do {
            row = rand.nextInt(4); // Corrigido de nestInt para nextInt
            col = rand.nextInt(4); // Corrigido de nestInt para nextInt
        } while (tabuleiro[row][col] != 0);
        
        tabuleiro[row][col] = (rand.nextInt(2) + 1) * 2; // Corrigido de nestInt para nextInt
    }

    private static void printTabuleiro(int[][] tabuleiro) {
        System.out.println("---------------");
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                if (tabuleiro[i][j] == 0) {
                    System.out.print("|    "); // Espaço vazio
                } else {
                    System.out.printf("| %2d ", tabuleiro[i][j]); // Número formatado
                }
            }
            System.out.println("|");
            System.out.println("---------------");
        }
    }

    public static void main(String[] args) {
        int[][] tabuleiro = new int[4][4]; // Inicializa o tabuleiro vazio
        int points = 0;
        
        initializeBoard(tabuleiro); // Adiciona as primeiras peças aleatórias
        printTabuleiro(tabuleiro); // Exibe o tabuleiro no console
    }
}

