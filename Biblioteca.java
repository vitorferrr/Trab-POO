import java.util.ArrayList;

public class Biblioteca {
    private ArrayList<Usuario> usuarios;
    private ArrayList<Material> materiais;
    private ArrayList<Emprestimo> emprestimos;

    public Biblioteca() {
        this.usuarios = new ArrayList<Usuario>();
        this.materiais = new ArrayList<Material>();
        this.emprestimos = new ArrayList<Emprestimo>();
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
                System.out.println(e.exibirResumo());
            }
        }
    }

/*  public static void listarUsuarios(ArrayList<Usuario> usuarios) {
        System.out.println("--- Lista de Usuários ---");
        for (int i = 0; i < usuarios.size(); i++) {
            Usuario u = usuarios.get(i);
            System.out.println(u.exibirResumo());
        }
    }

    public void listarMateriais(ArrayList<Material> materiais) {
        System.out.println("--- Lista de Materiais ---");
        for (int i = 0; i < materiais.size(); i++) {
            Material m = materiais.get(i);
            System.out.println(m.exibirResumo());
        }
    }

    public void cadastrarUsuario(Usuario u) {
        this.usuarios.add(u);
    }

    public void cadastrarMaterial(Material m) {
        this.materiais.add(m);
    } */
}