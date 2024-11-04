public class Livro {
    private String titulo;
    private String autor;
    private int anoPublicacao;
    private String ISBN;
    private boolean disponivel;

    public Livro(String titulo, String autor, int anoPublicacao, String ISBN) {
        this.titulo = titulo;
        this.autor = autor;
        this.anoPublicacao = anoPublicacao;
        this.ISBN = ISBN;
        this.disponivel = true;
    }

    public void exibirDetalhes() {
        System.out.println("Título: " + titulo);
        System.out.println("Autor: " + autor);
        System.out.println("Ano de Publicação: " + anoPublicacao);
        System.out.println("ISBN: " + ISBN);
        System.out.println("Disponível: " + (disponivel ? "Sim" : "Não"));
    }

    public boolean estaDisponivel() {
        return disponivel;
    }

    public void setDisponivel(boolean disponivel) {
        this.disponivel = disponivel;
    }

    public String getTitulo() {
        return titulo;
    }
}
