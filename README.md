## Sistema de Gerenciamento de Mídias (Java Console)


### Sobre

> Este projeto é uma **aplicação de console em Java** para gerenciar um catálogo de mídias, como Jogos, Filmes e Séries. Atualmente, as funcionalidades de gerenciamento de **Jogos** estão implementadas, permitindo adicionar, listar, remover, avaliar (com nota e comentário) e visualizar avaliações de jogos. As seções para Filmes e Séries estão presentes na estrutura, mas ainda em construção.
>
> A aplicação utiliza conceitos básicos de Programação Orientada a Objetos (POO) em Java, como classes (`Jogo`, `Filme`, `Serie`, `Avaliacao`, `Conteudo`), herança (`Jogo`, `Filme`, `Serie` herdam de `Conteudo`), e encapsulamento básico. A interação com o usuário é feita através de menus no console.


### Tecnologia Usada

* **Java** (utilizando `java.util.ArrayList`, `java.util.Scanner`, `java.time.LocalDate`, POO)


### Funcionalidades (Jogos)

* **Cadastrar Jogo:** Permite adicionar um novo jogo ao catálogo, informando título, plataforma e data de lançamento.
* **Listar Jogos:** Exibe todos os jogos cadastrados com seus detalhes (título, plataforma, data de lançamento) e a média das avaliações recebidas.
* **Remover Jogo:** Permite excluir um jogo do catálogo selecionando seu número na lista.
* **Avaliar Jogo:** Permite que um usuário adicione uma avaliação a um jogo existente, fornecendo seu nome, uma nota (0 a 10) e um comentário.
* **Listar Avaliações:** Exibe todas as avaliações (nome do usuário, nota, comentário, data) para um jogo específico.
* **Voltar / Sair:** Permite navegar entre os menus e encerrar a aplicação.


### Execução do projeto

**Requer o JDK (Java Development Kit) instalado!** ☕

1. **Faça o clone do projeto.
    ```bash
      git clone https://github.com/wwilliamsantana/poo-java.git
    ```

2.  **Navegue até o diretório raiz** do projeto no seu terminal (o diretório que contém a pasta `src`).
    ```bash
    cd poo-java
    ```
3.  **Click em RUN dentro da classe main.**
    
4.  **Siga as opções do menu** que aparecerão no console para gerenciar jogos.
