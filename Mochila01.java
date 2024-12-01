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

        for (int i = 1; i <= n; i++) {
            for (int w = 1; w <= capacidade; w++) {
                Objeto obj = objetos.get(i - 1);
                if (obj.peso <= w) { 
                    if (progDinam[i - 1][w] < obj.valor + progDinam[i - 1][w - obj.peso]) {
                        progDinam[i][w] = obj.valor + progDinam[i - 1][w - obj.peso];
                        incluso[i][w] = true; 
                    } else {
                        progDinam[i][w] = progDinam[i - 1][w];
                    }
                } else { 
                    progDinam[i][w] = progDinam[i - 1][w];
                }

               
                System.out.printf("progDinam[%d][%d] = %d\n", i, w, progDinam[i][w]);
            }
        }

   
        imprimirMatriz(progDinam, n, capacidade);

    
        List<String> resultado = new ArrayList<>();
        int w = capacidade;
        for (int i = n; i > 0; i--) {
            if (incluso[i][w]) { 
                Objeto obj = objetos.get(i - 1);
                resultado.add(obj.nome);
                w = w- obj.peso; 
            }
        }

        return resultado;
    }


}
