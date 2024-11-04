public class SistemaBiblioteca {
    public static void main(String[] args) {
        Biblioteca biblioteca = new Biblioteca();

        Livro livro1 = new Livro("O Alquimista", "Paulo Coelho", 1988, "1234567890");
        Livro livro2 = new Livro("Dom Quixote", "Miguel de Cervantes", 1605, "0987654321");
        biblioteca.adicionarLivro(livro1);
        biblioteca.adicionarLivro(livro2);

        biblioteca.listarLivrosDisponiveis();

        Usuario usuario = new Usuario("Maria", "U001");

        Livro livroParaEmprestar = biblioteca.buscarLivroPorTitulo("O Alquimista");
        if (livroParaEmprestar != null) {
            usuario.emprestarLivro(livroParaEmprestar);
        }

        usuario.emprestarLivro(livroParaEmprestar);

        biblioteca.listarLivrosDisponiveis();

        usuario.devolverLivro(livroParaEmprestar);

        biblioteca.listarLivrosDisponiveis();
    }
}
