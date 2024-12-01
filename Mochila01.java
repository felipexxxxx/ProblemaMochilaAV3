import java.util.ArrayList;
import java.util.List;

class Objeto {
    String nome;
    int peso;
    int valor;

    Objeto(String nome, int peso, int valor) {
        this.nome = nome;
        this.peso = peso;
        this.valor = valor;
    }
}

public class Mochila01 {

    // Função para imprimir a matriz progDinam
    public static void imprimirMatriz(int[][] matriz, int n, int capacidade) {
        System.out.println("\nMatriz progDinam (valores máximos possíveis):");
        for (int i = 0; i <= n; i++) {
            for (int w = 0; w <= capacidade; w++) {
                System.out.printf("%3d ", matriz[i][w]);
            }
            System.out.println();
        }
    }

    public static List<String> resolverMochila(int capacidade, List<Objeto> objetos) {
        int n = objetos.size();
        int[][] progDinam = new int[n + 1][capacidade + 1];
        boolean[][] incluso = new boolean[n + 1][capacidade + 1];

        // Preenchimento da matriz progDinam com exibição detalhada de cada subproblema
        for (int i = 1; i <= n; i++) {
            for (int w = 1; w <= capacidade; w++) {
                Objeto obj = objetos.get(i - 1);
                if (obj.peso <= w) { // Objeto cabe na mochila
                    if (progDinam[i - 1][w] < obj.valor + progDinam[i - 1][w - obj.peso]) {
                        progDinam[i][w] = obj.valor + progDinam[i - 1][w - obj.peso];
                        incluso[i][w] = true; // Marca o objeto como incluído
                    } else {
                        progDinam[i][w] = progDinam[i - 1][w];
                    }
                } else { // Objeto não cabe
                    progDinam[i][w] = progDinam[i - 1][w];
                }

                // Exibir o subproblema atual
                System.out.printf("progDinam[%d][%d] = %d\n", i, w, progDinam[i][w]);
            }
        }

   
        imprimirMatriz(progDinam, n, capacidade);

    
        List<String> resultado = new ArrayList<>();
        int w = capacidade;
        for (int i = n; i > 0; i--) {
            if (incluso[i][w]) { // Verifica se o objeto foi incluído
                Objeto obj = objetos.get(i - 1);
                resultado.add(obj.nome);
                w = w- obj.peso; // Atualiza a capacidade restante
            }
        }

        return resultado;
    }


}
