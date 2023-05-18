import java.util.Scanner;

public class Ordenacao {
   
    // Método de ordenação Bolha
    public static void bubbleSort(int[] vetor) {
        int n = vetor.length;
        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                if (vetor[j] > vetor[j + 1]) {
                    int temp = vetor[j];
                    vetor[j] = vetor[j + 1];
                    vetor[j + 1] = temp;
                }
            }
        }
    }

    // Método de ordenação por seleção
    public static void selectionSort(int[] vetor) {
        int n = vetor.length;
        for (int i = 0; i < n - 1; i++) {
            int minIndex = i;
            for (int j = i + 1; j < n; j++) {
                if (vetor[j] < vetor[minIndex]) {
                    minIndex = j;
                }
            }
            int temp = vetor[minIndex];
            vetor[minIndex] = vetor[i];
            vetor[i] = temp;
        }
    }

    // Método de ordenação por inserção
    public static void insertionSort(int[] vetor) {
        int n = vetor.length;
        for (int i = 1; i < n; ++i) {
            int key = vetor[i];
            int j = i - 1;

            while (j >= 0 && vetor[j] > key) {
                vetor[j + 1] = vetor[j];
                j = j - 1;
            }
            vetor[j + 1] = key;
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        boolean executar = true;
        while (executar) {
            System.out.println("Escolha o método de ordenação:");
            System.out.println("1 - Bolha");
            System.out.println("2 - Seleção");
            System.out.println("3 - Inserção");
            int opcao = scanner.nextInt();

            int[] vetor = new int[10];
            System.out.println("Informe os 10 números para serem ordenados:");
            for (int i = 0; i < 10; i++) {
                vetor[i] = scanner.nextInt();
            }

            switch (opcao) {
                case 1:
                    bubbleSort(vetor);
                    break;
                case 2:
                    selectionSort(vetor);
                    break;
                case 3:
                    insertionSort(vetor);
                    break;
                default:
                    System.out.println("Opção inválida!");
                    continue;
            }

            System.out.println("Vetor ordenado:");
            for (int num : vetor) {
                System.out.print(num + " ");
            }
            System.out.println();

            System.out.println("Deseja executar novamente? (S/N)");
            String resposta = scanner.next();
            if (resposta.equalsIgnoreCase("N")) {
                executar = false;
            }
        }
    }
}