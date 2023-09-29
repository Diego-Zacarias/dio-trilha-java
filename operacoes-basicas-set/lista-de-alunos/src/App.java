public class App {
    public static void main(String[] args) throws Exception {
        GerenciadorAlunos alunos = new GerenciadorAlunos();

        alunos.adicionarAluno("Diego", 123456789L, 10);
        alunos.adicionarAluno("Maria", 987654321L, 5);
        alunos.adicionarAluno("Thiago", 963852741L, 7);
        alunos.adicionarAluno("Ana", 741852963L, 10);
        alunos.adicionarAluno("Pedro", 102345678L, 8);
        alunos.adicionarAluno("Julia", 852963147L, 9);
        alunos.adicionarAluno("Jose", 963852147L, 9.5);
        alunos.adicionarAluno("Quezia", 852147369L, 10);
        alunos.adicionarAluno("Miguel", 222555777L, 7.8);
        System.out.println("--------");
        alunos.exibirAlunosPorNome();
        System.out.println("--------");
        alunos.exibirAlunosPorNota();

        alunos.removerAluno(123456789L);
        System.out.println("--------");
        alunos.exibirAlunos();
    }
}
