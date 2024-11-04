public class Usuario {
    private String nome;
    private String idUsuario;

    public Usuario(String nome, String idUsuario) {
        this.nome = nome;
        this.idUsuario = idUsuario;
    }

    public void emprestarLivro(Livro livro) {
        if (livro.estaDisponivel()) {
            livro.setDisponivel(false);
            System.out.println(nome + " (ID: " + idUsuario + ") emprestou o livro: " + livro.getTitulo());
        } else {
            System.out.println("O livro " + livro.getTitulo() + " não está disponível para empréstimo.");
        }
    }

    public void devolverLivro(Livro livro) {
        livro.setDisponivel(true);
        System.out.println(nome + " (ID: " + idUsuario + ") devolveu o livro: " + livro.getTitulo());
    }
}
