public class Aluno extends Usuario{
    public Aluno(double codigo, String nome, Sring email){
        super(codigo, nome, email);
    }

    public int limiteMaxEmprestimos(){
        return 3;
    }

    public int prazoDevolucaoDias(){
        return 7;
    }

    public double valorMultaDiaria(){
        return 2.50;
    }

    public String tipoUsuario(){
        System.out.println("Tipo de usuário é aluno");
    }
}