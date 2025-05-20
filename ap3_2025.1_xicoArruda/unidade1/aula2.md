### U1 - Aula 2 - 16/05/2025 - Olá mundo, tipos primitivos (1,0)

### 1. Considerações sobre OO e tipos primitivos:

- **Orientação a Objetos**: é um jeito diferente de programar.
  Resumo do paradigma: modelar software como um conjunto de objetos que possuem estado (atributos) e comportamento (métodos).
  Outros paradigmas: imperativo, procedural, funcional, lógico, declarativo, reativo.

- **Tipos Primitivos**: tipos de dados básicos fornecidos pela linguagem Java para armazenar valores simples. São armazenados diretamente na memória (_stack_) e têm um tamanho fixo. Não são objetos, portanto, não possuem métodos associados. Ascomparações são feitas com operadores ==,<, >. Os limites [são esses](tiposPrimitivos.png).

- **Classes (String, Integer)**: Em Java, classes são "moldes" para objetos. Um objeto é uma instância de uma classe. As variáveis que são instâncias de classes são referências aos objetos armazenados na memória (_heap_). Classes podem ter métodos e atributos associados. Usa-se o método .equals(). Usar == compara referências de memória.

- **String** é uma classe _muito_ especial usada para representar [sequências de caracteres](stringEmJava.png)

- **GUI**: Posso usar IA para gerar interface gráfica [GUI - Graphical User Interface](exemplos_gui).

- **Diagrama de Classes**: pode ser usado para começar a modelagem e virar software.

```mermaid
classDiagram
    class Aluno {
        - long matricula = -1
        # String nomeCompleto = ""
        - String nomeDaMae = ""
        - int idade = -1
        - LocalDate dataNascimento = null
        - LocalDate dataCadastro = null

        + Aluno()
        + Aluno(String nomeCompleto)
        + Aluno(String nomeCompleto, int idade)
        //getters, setters, toString()
    }
```

### 2. Exercício em sala - Finalizar o exercício 1.

Salve em unidade1\exercicio1\...

Gabaritos para ajudar no exercícios [aqui](gabaritos).

Após concluir cada questão, faça _commit_ localmente e sincronize-o (_push_) com o seu repositório remoto no GitHub. Conforme [figura](https://drive.google.com/open?id=1dV5TwUdMxSmh80sx13epVcJFewIT_MVk).

Entregue a folha assinada!
