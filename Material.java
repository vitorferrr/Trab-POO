public abstract class Material implements Exibivel{
    private double codigo;
    private String titulo;
    private int anoPublicacao;
    private int qntDisponivel;

    public Material(double codigo, String titulo, int anoPublicacao, int qntDisponivel){
        this.codigo = codigo;
        this.titulo = titulo;
        this.anoPublicacao = anoPublicacao;
        this.qntDisponivel = qntDisponivel;
    }

    public String verificarDisponibilidade() {
        if (qntDisponivel > 0) {
            return "Está disponível!";
        } else {
            return "Não está disponível!";
        }
    }

    public void reduzirQuantidade(){
        if (verificarDisponibilidade().equals("Está disponível!")) {
            qntDisponivel--;
        } else {
            System.out.println("Não é possível fazer o empréstimo.");
        }
    }

    public void devolucaoLivro() {
        this.qntDisponivel++;
    }

    public abstract void definirInformacoes();

    @Override
    public String exibirResumo(){
        if (verificarDisponibilidade().equals("Está disponível!")) {
            return "Temos " + this.qntDisponivel + " disponível(eis) do livro " + this.titulo + " do ano de " + anoPublicacao;
        } else {
            return "Não temos o livro " + this.titulo + " disponível no momento!";
        }
    }
}