public class Professor extends Usuario{
    public Professor(double codigo, String nome, String email){
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

    public void tipoUsuario(){
        System.out.println("Tipo de usuário é professor");
    }
}