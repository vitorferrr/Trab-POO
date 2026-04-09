public class Aluno extends Usuario{
<<<<<<< HEAD
    public Aluno(double codigo, String nome, String email){
=======
    public Aluno(double codigo, String nome, Sring email){
>>>>>>> f457162d99c732a012de718b38ff7cc91216eb02
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