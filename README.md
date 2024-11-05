
---

# Sistema de Gerenciamento de Biblioteca 📚

## Descrição do Projeto

Este projeto é um sistema de gerenciamento de livros para uma biblioteca, implementado em Java. O sistema permite registrar informações sobre livros, gerenciar empréstimos e devoluções e buscar livros disponíveis para empréstimo.

### Funcionalidades Principais

- **Cadastro de Livros**: Adicionar novos livros com título, autor, ano de publicação e ISBN.
- **Empréstimo e Devolução**: Usuários podem emprestar livros disponíveis e devolvê-los quando terminarem.
- **Consulta de Livros**: Listar todos os livros disponíveis para empréstimo e buscar por título específico.

## Estrutura do Código

O projeto é dividido em quatro classes principais, cada uma em um arquivo separado:

- `Livro.java`: Define a classe `Livro`, que armazena as informações e o status de um livro.
- `Usuario.java`: Define a classe `Usuario`, representando o usuário do sistema que pode emprestar e devolver livros.
- `Biblioteca.java`: Define a classe `Biblioteca`, que gerencia a lista de livros e permite a adição, listagem e busca de livros.
- `SistemaBiblioteca.java`: Classe principal que executa o sistema, criando uma biblioteca e gerenciando as ações de usuários e livros.

## Classes e Métodos

### Classe `Livro`

Armazena as informações e o status de um livro.

- **Atributos**:
  - `titulo` (String): Título do livro.
  - `autor` (String): Nome do autor.
  - `anoPublicacao` (int): Ano de publicação.
  - `ISBN` (String): Código ISBN do livro.
  - `disponivel` (boolean): Status de disponibilidade para empréstimo.
  
- **Métodos**:
  - `exibirDetalhes()`: Exibe as informações do livro.
  - `estaDisponivel()`: Retorna `true` se o livro está disponível para empréstimo, `false` caso contrário.
  - `setDisponivel(boolean disponivel)`: Altera o status de disponibilidade do livro.

### Classe `Usuario`

Representa um usuário do sistema que pode emprestar e devolver livros.

- **Atributos**:
  - `nome` (String): Nome do usuário.
  - `idUsuario` (String): Identificador único do usuário.
  
- **Métodos**:
  - `emprestarLivro(Livro livro)`: Se o livro está disponível, registra o empréstimo e altera o status para indisponível.
  - `devolverLivro(Livro livro)`: Devolve o livro e altera o status de volta para disponível.

### Classe `Biblioteca`

Gerencia a lista de livros e permite a adição, listagem e busca de livros.

- **Atributos**:
  - `livros` (List<Livro>): Lista de livros disponíveis na biblioteca.

- **Métodos**:
  - `adicionarLivro(Livro livro)`: Adiciona um novo livro à lista da biblioteca.
  - `listarLivrosDisponiveis()`: Exibe todos os livros que estão disponíveis para empréstimo.
  - `buscarLivroPorTitulo(String titulo)`: Procura um livro pelo título e retorna o objeto `Livro` correspondente, se encontrado.

## Fluxo de Execução

A execução do sistema inclui:

1. Instanciar uma biblioteca.
2. Adicionar livros.
3. Criar um usuário e realizar operações de empréstimo e devolução.

Exemplo de código:

```java
Biblioteca biblioteca = new Biblioteca();
Livro livro1 = new Livro("O Alquimista", "Paulo Coelho", 1988, "1234567890");
biblioteca.adicionarLivro(livro1);

Usuario usuario = new Usuario("Maria", "U001");
usuario.emprestarLivro(livro1);
usuario.devolverLivro(livro1);
```

## Estrutura do Projeto

```plaintext
SystemTeca/
├── Livro.java           # Classe Livro
├── Usuario.java         # Classe Usuario
├── Biblioteca.java      # Classe Biblioteca
└── SistemaBiblioteca.java # Classe principal para execução do sistema
```

## Pré-requisitos

- **Java JDK** 8 ou superior.

## Compilação e Execução

1. **Clone o repositório**:
   ```bash
   git clone https://github.com/borgeszxz/SystemTeca.git
   ```
2. **Compile o código**:
   Compile todos os arquivos `.java`:
   ```bash
   javac *.java
   ```
3. **Execute o sistema**:
   ```bash
   java SistemaBiblioteca
   ```

## Exemplo de Saída

```plaintext
Livro adicionado: O Alquimista
Livros disponíveis para empréstimo:
Título: O Alquimista
Autor: Paulo Coelho
Ano de Publicação: 1988
ISBN: 1234567890
Disponível: Sim
--------------------
Maria (ID: U001) emprestou o livro: O Alquimista
O livro O Alquimista não está disponível para empréstimo.
Maria (ID: U001) devolveu o livro: O Alquimista
```
--- 
