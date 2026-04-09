public abstract class Usuario implements Exibivel{
    private double codigo;
    private String nome;
    private String email;

    public Usuario(double codigo, String nome, String email){
        this.codigo = codigo;
        this.nome = nome;
        this.email = email;
    }

    public double getCodigo(){
        return codigo;
    }

    public void setCodigo(double codigo){
        this.codigo = codigo;
    }

    public String getNome(){
        return nome;
    }

    public void setNome(String nome){
        this.nome = nome;
    }

    public String getEmail(){
        return email;
    }

    public void setEmail(String email){
        this.email = email;
    }

    @Override
    public String exibirResumo(){
        System.out.println("O código é: " + getCodigo() + ", o nome é: " + getNome() + ", o email é: " + getEmail());
    }

    public abstract int limiteMaxEmprestimos();
    public abstract int prazoDevolucaoDias();
    public abstract double valorMultaDiaria();
    public abstract String tipoUsuario();
}