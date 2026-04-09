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

    public void cadastrarUsuario(Usuario usuario) {
        this.usuarios.add(usuario);
    }

    public void cadastrarMaterial(Material material) {
        this.materiais.add(material);
    }

    public void listarUsuarios() {
        for (Usuario u : usuarios) {
            u.exibirDetalhes(); // Supondo que Usuario também implemente Exibivel
        }
    }
}
