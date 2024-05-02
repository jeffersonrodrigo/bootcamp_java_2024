## Tipos Java
### Tipos de dados
No Java, existem algumas palavras reservadas, para a representação dos tipos de dados básicos, que precisam ser manipulados, para a construção de programas. Estes tipos de dados são conhecidos como tipos primitivos (Primitive Types).


| Família   | Tipo Primitivo | Wrapper Class | Tamanho  |
|-----------|----------------|----------------------|----------------|
| Lógico    | boolean        | Boolean              | 1 bit |
| Literais  | char           | Character            | 1 byte       |
| -         | --             | String               | 1 byte cada  |
| Inteiro   | byte           | Byte                 | 1 byte             |
|           | short          | Short                | 2 bytes             |
|           | int            | Integer              | 4 bytes             |
|           | long           | Long                 | 8 bytes             |
| Real      | float          | Float                | 4 bytes             |
|           | double         | Double               | 8 bytes             |

### Declaração de Variáveis
Variável, é uma identificação de um espaço em memória, utilizado pelo nosso programa. Seguindo as convenções em linguagem de programação, toda variável é composta por: tipo de dados + identificação + valor atribuído.

A estrutura padrão para se declarar uma variável sempre é:

`<Tipo> <nomeVariavel> <atribuicaoDeValorOpcional>`

### Declaração de Constantes

Já as Constantes, são valores armazenados em memória que não podem ser modificados depois de declarados. Em Java, esses valores são representados pela palavra reservada `final`, seguida do tipo.

Por convenção, Constantes são sempre escritas em CAIXA ALTA.

`final <Tipo> <NOME_DA_CONSTANTE> <atribuicaoDeValorOpcional>`