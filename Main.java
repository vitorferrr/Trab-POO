import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<Usuario> usuarios = new ArrayList<Usuario>();
        ArrayList<Material> materiais = new ArrayList<Material>();

        Biblioteca b = new Biblioteca();

        Usuario a1 = new Aluno(15, "Vitor", "vitor@gmail.com");
        Usuario p1 = new Professor(91, "Joel", "joel@professor.com");
        Material l1 = new Livro(1, "Java", 2015, 1, "Clarice");
        Material l2 = new Livro(2, "Python", 2018, 3, "João");
        Material r1 = new Revista(3, "Revista de Java", 2020, 5, "Edição 1");
        Material e1 = new Ebook(4, "C", 2021, 3, "PDF", "2.5MB");
        
        usuarios.add(a1);
        usuarios.add(p1);
        materiais.add(l1);
        materiais.add(l2);
        materiais.add(r1);
        materiais.add(e1);
  
        imprimirUsuarios(usuarios);
        imprimirMateriais(materiais);

        realizarEmprestimo(a1, l1, materiais);
        realizarEmprestimo(p1, l1, materiais);

    }

    public static void imprimirUsuarios(ArrayList<Usuario> u){
        System.out.println("USUÁRIOS:");
        for(int i = 0; i < u.size(); i++){
            System.out.println("Nome: " + u.get(i).getNome() + ", código: " + u.get(i).getCodigo() + ", email: " + u.get(i).getEmail());
            System.out.println("=========================");
        }
    }

    public static void imprimirMateriais(ArrayList<Material> mat){
        System.out.println("MATERIAIS:");
        for(int i = 0; i < mat.size(); i++){
            System.out.println("Título: " + mat.get(i).getTitulo() + ", código: " + mat.get(i).getCodigo() + ", ano de publicação: " + mat.get(i).getAnoPublicacao());
            System.out.println("=========================");
        }
    }

    public static void realizarEmprestimo(Usuario u, Material m, ArrayList<Material> materiais){
        for(int i = 0; i < materiais.size(); i++){
            if(m == materiais.get(i)){
                if(materiais.get(i).getQntDisponivel() > 0){
                    System.out.println("Empréstimo realizado com sucesso!");
                    materiais.get(i).reduzirQuantidade();
                }
                else{
                    System.out.println("Indisponível");
                }
            }
        }
    }
}