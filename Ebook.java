public class Ebook extends Material{
    private String formato;
    private double tamanhoArquivo;

    public Ebook(double codigo, String titulo, int anoPublicacao, int qntDisponivel, String formato, double tamanhoArquivo) {
        super(codigo, titulo, anoPublicacao, qntDisponivel);
        this.formato = formato;
        this.tamanhoArquivo = tamanhoArquivo;
    }
    
    @Override
    public void definirInformacoes(){
        System.out.println(
            "\nTítulo do Ebook: " + super.getTitulo() + 
            "\nTamanho do arquivo: " + this.tamanhoArquivo + 
            "\nFormato do arquivo: " + this.formato +
            "\nAno de publicação:" + super.getAnoPublicacao() +
            "\nQuantidade disponível: " + super.getQntDisponivel() +
            "\nCódigo do livro: " + super.getCodigo());   
    }
}
