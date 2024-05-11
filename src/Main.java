import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        ArvoreBinaria arvoreBinaria = new ArvoreBinaria();
        ArvoreAvl arvoreAvl = new ArvoreAvl();

        System.out.println("Escolha a estrutura da árvore:");
        System.out.println("1. Árvore Binária");
        System.out.println("2. Árvore AVL");
        int escolha = sc.nextInt();
        sc.nextLine(); // Limpar o buffer

        System.out.println("Como deseja inserir os números?");
        System.out.println("1. Manualmente");
        System.out.println("2. Aleatoriamente");
        int modoInsercao = sc.nextInt();
        sc.nextLine(); // Limpar o buffer

        if (modoInsercao == 1) {
            System.out.println("Insira os números separados por espaço:");
            String[] numeros = sc.nextLine().split(" ");
            for (String numero : numeros) {
                int valor = Integer.parseInt(numero);
                if (escolha == 1) {
                    arvoreBinaria.inserir(valor);
                } else {
                    arvoreAvl.inserirAvl(valor);
                }
            }
        } else {
            System.out.println("Quantos números deseja inserir aleatoriamente?");
            int quantidade = sc.nextInt();
            for (int i = 0; i < quantidade; i++) {
                int valor = (int) (Math.random() * 100) + 1; // Números aleatórios de 1 a 100
                if (escolha == 1) {
                    arvoreBinaria.inserir(valor);
                } else {
                    arvoreAvl.inserirAvl(valor);
                }
            }
        }

        System.out.println("Árvore resultante:");

        if (escolha == 1) {
            arvoreBinaria.imprimir();
        } else {
            arvoreAvl.imprimir();
        }

        sc.close();
    }
}