# Java Compiler
 
## Tabela de Lexemas

| Tipo de Lexema                                | Forma de Escrita | Token       | Observação                                                                 |
|----------------------------------------------|------------------|-------------|----------------------------------------------------------------------------|
| Variável `int`                                | var int          | `<id, 0>`   |                                                                            |
| Variável `String`                             | var String       | `<id, 0>`   |                                                                            |
| Valor numérico                                |                  | `<num, 0>`  |                                                                            |
| Valor `String`                                |                  | `<str, 0>`  |                                                                            |
| Loop `for` início                             | per              | `<fori>`    |                                                                            |
| Loop `while` início                           | enq              | `<whi>`     |                                                                            |
| Loop `for` fim                                | perf             | `<forf>`    |                                                                            |
| Loop `while` fim                              | enqf             | `<whf>`     |                                                                            |
| `return`                                      | res              | `<re>`      |                                                                            |
| Adição                                        | +                | `<+>`       |                                                                            |
| Subtração                                     | -                | `<->`       |                                                                            |
| Multiplicação                                 | *                | `<*>`       |                                                                            |
| Divisão                                       | /                | `</>`       |                                                                            |
| Criação de função                             | fun              | `<fun>`     |                                                                            |
| Parâmetros da função                          | ( )              | `<(>` `<)>` |                                                                            |
| Criação de array                              | [ ]              | `<[]>`      |                                                                            |
| Criação de dicionário                         |                  |             |                                                                            |
| Início e fim de conteúdo dentro de função     | { }              | `<{>` `<}>` |                                                                            |
| Comparador "maior que"                        | >                | `<ma>`      |                                                                            |
| Comparador "menor que"                        | <                | `<me>`      |                                                                            |
| Comparador "maior ou igual"                   | >=               | `<mai>`     |                                                                            |
| Comparador "menor ou igual"                   | <=               | `<mei>`     |                                                                            |
| Comparador "igual"                            | ==               | `<ii>`      |                                                                            |
| Comentário (início e fim)                     | #                | `<#>`       | Permite comentários entre blocos lógicos, tornando o código mais didático |
| Início do programa                            |                  | `<ini>`     |                                                                            |
| Fim do programa                               |                  | `<fim>`     |                                                                            |

## Etapas do compilador

### Análise lexica
A análise lexica é a primeira etapa de um compilador, ela é responsável por ler todos os bytes de um arquivo, interpretar todas as
palavras e representalas por meio de estruturas chamadas de Tokens, gerando o chamado fluxo de tokens, uma estrutura que contem
cada conjunto de palavras resumida ao seu tipo.
A análise lexica também é responsável por:
- remover comentários;
- remover espaços em branco;
- correlacionar mensagens de erro com o programa fonte, informando a linha ou a coluna que ocorreu o erro.

#### Lexema x padrão x Token
Lexema:
Essencialmente uma palavra, uma sequencia de caracteres que existe no programa fonte.

Padrão:
Categoriza cada lexema por meio de uma categoria ou tipo.
````java
if (var1 > 37) {
    outraVar += 54;
    System.out.println("ok");
        }
````

| categoria            | lexemas                              | Padrão                                 |
|----------------------|--------------------------------------|----------------------------------------|
| Identificadores      | var1, outraVar, System, out, println | Cadeia de caracteres                   |
| Constantes numericas | 37, 54                               | Sequência de dígitos                   |
| Constantes (cadeias) | "ok"                                 | Cadeia de caracteres envolta por aspas |
| Operadores           | >, +=                                | O proprio lexema                       |
| Palavras chave       | if                                   | O proprio lexema                       |

Token: 
É uma unidade lexica correspondente a um lexema, utilizada para a estruturação do codigo lido em um conjunto
de objetos que podem ser interpretados pelas partes posteriores do compilador 'Analisador sintático'.

````java
public class TokenDTO {

    private String token;
    private Integer id;  
    private String value;
}
````

gerando a seguinte estrutura: 

````
<token, id, value>
````

Os tokens são o output final do analisador lexico.

### Análise semantica

### 📚 Regras de Redução

| Redução | Sequência                           |
|---------|-------------------------------------|
| DEC     | `<var> <typ> <id> <=> <VAL>`        |
| VAL     | `<num>` &#124; `<str>` &#124;&#124; `<FNC>` |
| FNC     | `<fun> <(> <)>` &#124;&#124; `<fun> <(> <PAR> <)>` |
| PAR     | *(vazio)*                           |
| CRB     | `<{> <}>`                           |
