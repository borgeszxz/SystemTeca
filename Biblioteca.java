import java.util.ArrayList;
import java.util.List;

public class Biblioteca {
    private List<Livro> livros;

    public Biblioteca() {
        this.livros = new ArrayList<>();
    }

    public void adicionarLivro(Livro livro) {
        livros.add(livro);
        System.out.println("Livro adicionado: " + livro.getTitulo());
    }

    public void listarLivrosDisponiveis() {
        System.out.println("Livros disponíveis para empréstimo:");
        for (Livro livro : livros) {
            if (livro.estaDisponivel()) {
                livro.exibirDetalhes();
                System.out.println("--------------------");
            }
        }
    }

    public Livro buscarLivroPorTitulo(String titulo) {
        for (Livro livro : livros) {
            if (livro.getTitulo().equalsIgnoreCase(titulo)) {
                return livro;
            }
        }
        System.out.println("Livro com o título '" + titulo + "' não encontrado.");
        return null;
    }
}
