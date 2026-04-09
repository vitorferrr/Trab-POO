import java.util.ArrayList;
import java.util.List;

public class Biblioteca {
    private List<Usuario> usuarios;
    private List<Material> materiais;
    private List<Emprestimo> emprestimos;

    public Biblioteca() {
        this.usuarios = new ArrayList<>();
        this.materiais = new ArrayList<>();
        this.emprestimos = new ArrayList<>();
    }

    public static void listarUsuarios(List<Usuario> usuarios) {
        System.out.println("--- Lista de Usuários ---");
        for (int i = 0; i < usuarios.size(); i++) {
            Usuario u = usuarios.get(i);
            u.exibirResumo();
        }
    }

    public void listarMateriais() {
        System.out.println("--- Lista de Materiais ---");
        for (int i = 0; i < materiais.size(); i++) {
            Material m = materiais.get(i);
            m.exibirResumo();
        }
    }

    public Material buscarMaterialPorCodigo(int codigoBuscado) {
        for (int i = 0; i < materiais.size(); i++) {
            Material m = materiais.get(i);
            if (m.getCodigo() == codigoBuscado) {
                return m;
            }
        }
        return null;
    }

    public void listarEmprestimosEmAndamento() {
        for (int i = 0; i < emprestimos.size(); i++) {
            Emprestimo e = emprestimos.get(i);
            if (!e.verificarEmprestimoFinalizado()) {
                System.out.println("ID: " + i + " - Detalhes: ");
                e.exibirResumo();
            }
        }
    }
}
