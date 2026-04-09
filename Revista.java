public class Revista extends Material{
    private String edicao;

    public Revista(double codigo, String titulo, int anoPublicacao, int qntDisponivel, String edicao) {
        super(codigo, titulo, anoPublicacao, qntDisponivel);
        this.edicao = edicao;
    }

    @Override
    public void definirInformacoes(){
        System.out.println(
            "\nTítulo da revista: " + super.getTitulo() + 
            "\nEdição: " + this.edicao + 
            "\nAno de publicação:" + super.getAnoPublicacao() +
            "\nQuantidade disponível: " + super.getQntDisponivel() +
            "\nCódigo do livro: " + super.getCodigo());   
    }
}
