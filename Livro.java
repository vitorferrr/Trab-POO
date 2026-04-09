public class Livro extends Material{
    private String autor;

    public Livro(double codigo, String titulo, int anoPublicacao, int qntDisponivel, String autor) {
        super(codigo, titulo, anoPublicacao, qntDisponivel);
        this.autor = autor;
    }
}
