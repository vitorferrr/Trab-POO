import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

public class Emprestimo implements Exibivel, CalculavelMulta{
    private String idEmprestimo;
    private Usuario usuario;
    private Material material;
    private LocalDate dataEmprestimo;
    private LocalDate dataPrevistaDevolucao;
    private LocalDate dataRealDevolucao;
    private int numeroDias;

    private boolean devolucao = false;
    private boolean emprestimoFinalizado;


    public void dadosEmprestimo(){
        System.out.println("ID do empréstimo: " + idEmprestimo);
        System.out.println("Usuário: " + usuario);
        System.out.println("Material: " + material);
        System.out.println("Data do empréstimo: " + dataEmprestimo);
        System.out.println("Data prevista da devolução: " + dataPrevistaDevolucao);
        System.out.println("Data real da devolução: " + dataRealDevolucao);
    }

    public boolean registrarDevolucao(){
        return devolucao = true;
    }

    public boolean verificarEmprestimoFinalizado(){
        if(devolucao = false){
            return false;
        }

        return true;
    }

    public int calcularDiasDeAtraso(){
        return numeroDias = ChronoUnit.DAYS.between(dataRealDevolucao, dataPrevistaDevolucao);
    }

    
}