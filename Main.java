import java.util.ArrayList;
import java.util.List;


public class Main {
    public static void main(String[] args) {
        List<Objeto> objetos = new ArrayList<>();
        objetos.add(new Objeto("Objeto1", 2, 10));
        objetos.add(new Objeto("Objeto2", 3, 12));
        objetos.add(new Objeto("Objeto3", 3, 14));

        int capacidade = 5;
        List<String> resultado = Mochila01.resolverMochila(capacidade, objetos);

        System.out.println("Objetos selecionados: " + resultado);
    }
}
