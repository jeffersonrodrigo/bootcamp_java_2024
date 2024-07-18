# Desafio POO - Modelagem e Diagramação de um Componente iPhone

## Descrição

Realizado o modelo e diagrama a representação UML de um componente iPhone, incluindo funcionalidades como Reprodutor Musical, Aparelho Telefônico e Navegador na Internet, baseado no vídeo de lançamento do iPhone de 2007.

## Funcionalidades a Modelar

- **Reprodutor Musical**: tocar(), pausar(), selecionarMusica(String musica)
- **Aparelho Telefônico**: ligar(String numero), atender(), iniciarCorreioVoz()
- **Navegador na Internet**: exibirPagina(String url), adicionarNovaAba(), atualizarPagina()

## Objetivo

- Criar um diagrama UML representando as funcionalidades.
- Opcionalmente, implementar as classes e interfaces em Java.



### Diagrama UML do iPhone

```mermaid
classDiagram
    class iPhone {
        +ReprodutorMusical reprodutorMusical
        +AparelhoTelefonico aparelhoTelefonico
        +NavegadorInternet navegadorInternet
    }

    class ReprodutorMusical {
        +tocar()
        +pausar()
        +selecionarMusica(String musica)
    }

    class AparelhoTelefonico {
        +ligar(String numero)
        +atender()
        +iniciarCorreioVoz()
    }

    class NavegadorInternet {
        +exibirPagina(String url)
        +adicionarNovaAba()
        +atualizarPagina()
    }

    iPhone --> ReprodutorMusical : 
    iPhone --> AparelhoTelefonico : 
    iPhone --> NavegadorInternet : 

```