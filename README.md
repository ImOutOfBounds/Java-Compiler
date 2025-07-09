# Java Compiler

# Tabela de Lexemas

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
