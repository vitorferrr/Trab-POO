public class Professor extends Usuario{
<<<<<<< HEAD
    public Professor(double codigo, String nome, String email){
=======
    public Professor(double codigo, String nome, Sring email){
>>>>>>> f457162d99c732a012de718b38ff7cc91216eb02
        super(codigo, nome, email);
    }

    public int limiteMaxEmprestimos(){
        return 5;
    }

    public int prazoDevolucaoDias(){
        return 14;
    }

    public double valorMultaDiaria(){
        return 1.00;
    }

    public String tipoUsuario(){
        System.out.println("Tipo de usuário é professor");
    }
}