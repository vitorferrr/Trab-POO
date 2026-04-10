import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

public class Emprestimo implements Exibivel, CalculavelMulta{
    private String idEmprestimo;
    private Usuario usuario;
    private Material material;
    private LocalDate dataEmprestimo;
    private LocalDate dataPrevistaDevolucao;
    private LocalDate dataRealDevolucao;

    private boolean devolucao = false;
    private int diasDeAtraso;
    private double multa;

    public String dadosEmprestimo(){
        return "ID do empréstimo: " + idEmprestimo + 
        "\nUsuário: " + usuario + 
        "\nMaterial: " + material + 
        "\nData do empréstimo: " + dataEmprestimo +
        "\nData prevista da devolução: " + dataPrevistaDevolucao +
        "\nData real da devolução: " + dataRealDevolucao;
    }

    public boolean registrarDevolucao(){
        return devolucao = true;
    }

    public boolean verificarEmprestimoFinalizado(){
        if(devolucao == false){
            return false;
        }

        return true;
    }

    public int calcularDiasDeAtraso(){
        return diasDeAtraso = (int) ChronoUnit.DAYS.between(dataRealDevolucao, dataPrevistaDevolucao);
    }

    public double calcularMulta(){
        return multa = diasDeAtraso*usuario.valorMultaDiaria();
    }

    @Override
    public String exibirResumo(){
        return dadosEmprestimo() + 
                "\nDias de atraso: " + diasDeAtraso + 
                "\nValor da multa: " + multa;
    }
}