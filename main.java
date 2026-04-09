public class main {
    public static void main(String[] args) {
        Biblioteca b = new Biblioteca();

        Usuario A1 = new Aluno(15, "Vitor", "Vitor@gmail.com");
        Usuario P1 = new Professor(91, "Joel", "Joel@professor.com");

        Material L1 = new Livro(1, "Java", 2015, 2, "Clarice");
        Material L2 = new Livro(2, "Python", 2018, 3, "João");
        Material R1 = new Revista(3, "Revista de Java", 2020, 5, "Edição 1");
        Material E1 = new Ebook(4, "C", 2021, 3, "PDF", "2.5MB");

        
    }
}
