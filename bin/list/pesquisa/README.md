# Projeto SomaNumeros

## Descrição
Este projeto consiste em classes Java para manipular uma lista de números inteiros. Com estas classes, é possível adicionar números a uma lista, calcular a soma dos números, encontrar o maior e o menor número na lista e exibir todos os números.

## Classes
- `Numeros`: Representa um número inteiro e fornece um método para acessar seu valor.
- `SomaNumeros`: Contém uma lista de objetos `Numeros` e métodos para manipular esta lista.
- `Main`: Contém o método `main` que demonstra o uso das classes `Numeros` e `SomaNumeros`.

## Funcionalidades
- Adicionar números à lista.
- Calcular a soma dos números na lista.
- Encontrar o maior número na lista.
- Encontrar o menor número na lista.
- Exibir todos os números na lista.

## Como usar
1. Crie uma instância da classe `SomaNumeros`.
2. Use o método `adicionarNumero(int numero)` para adicionar números à lista.
3. Use o método `calcularSoma()` para obter a soma dos números.
4. Use o método `encontrarMaiorNumero()` para encontrar o maior número na lista.
5. Use o método `encontrarMenorNumero()` para encontrar o menor número na lista.
6. Use o método `exibirNumeros()` para exibir todos os números na lista.

## Exceções
Os métodos `encontrarMaiorNumero()` e `encontrarMenorNumero()` lançam uma `RuntimeException` se a lista estiver vazia.

## Autor
[Seu Nome]

## Licença
Este projeto está licenciado sob a [Licença MIT](LICENSE).
