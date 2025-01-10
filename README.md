# Problema da Mochila 0/1 🎒

## **Descrição do Projeto**  
Este projeto foi desenvolvido como parte de um trabalho acadêmico da disciplina de **CANA** e implementa a solução para o **Problema da Mochila 0/1** utilizando **programação dinâmica**.  
O objetivo do problema é selecionar itens com peso e valor para maximizar o valor total carregado, respeitando uma capacidade máxima da mochila.

---

## **Funcionamento do Projeto**  
O projeto é composto pelas seguintes classes:  

- **`Objeto`**: representa um item com nome, peso e valor.  
- **`Mochila01`**: contém a implementação do algoritmo de programação dinâmica para resolver o problema.  
- **`Main`**: classe principal que executa o programa e exibe os itens selecionados para a mochila.

---

## **Algoritmo de Programação Dinâmica**  
O algoritmo utiliza uma matriz `progDinam[][]`, onde:
- `progDinam[i][w]` armazena o **valor máximo** que pode ser obtido considerando os primeiros `i` itens com uma capacidade `w`.
- Para cada item, verifica-se se ele pode ser incluído na mochila:
  - Se sim, atualiza o valor máximo adicionando o valor do item.
  - Se não, mantém o valor máximo anterior.

### **Impressão da Matriz de Decisão**  
O projeto imprime a matriz completa de programação dinâmica para facilitar o entendimento do processo de cálculo.

---

## **Como Executar o Projeto**  
1. Clone o repositório:
   ```bash
   git clone https://github.com/seu-usuario/problema-mochila01.git
2. Abra o projeto em uma IDE Java (como IntelliJ ou Eclipse).
3. Compile e execute a classe Main.java.
4. O programa irá exibir a matriz de valores máximos e a lista dos objetos selecionados para a mochila.

---

## **Conclusão**
Este projeto ilustra de forma clara e didática a aplicação de programação dinâmica para resolver problemas de otimização combinatória, mostrando como utilizar matrizes para calcular a melhor combinação de itens para um espaço limitado.




