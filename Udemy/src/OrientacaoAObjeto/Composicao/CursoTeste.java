package OrientacaoAObjeto.Composicao;
public class CursoTeste {
    public static void main(String[] args) {
        Aluno aluno1 = new Aluno("Felipe");
        Aluno aluno2 = new Aluno("Pedro");
        Aluno aluno3 = new Aluno("Maria");
        Curso curso1 = new Curso("Java Completo");
        Curso curso2 = new Curso("Web 2023");
        Curso curso3 = new Curso("Python Completo");
        curso1.adicionarAluno(aluno1);
        curso1.adicionarAluno(aluno2);
        curso2.adicionarAluno(aluno1);
        curso2.adicionarAluno(aluno3);
        aluno1.adicionarCurso(curso3);
        aluno2.adicionarCurso(curso3);
        aluno3.adicionarCurso(curso3);
        for (Aluno aluno: curso1.alunos){
            System.out.println("Aluno do curso "+curso1.nome+" "+aluno.nome);
        }
        System.out.println("\n");
        for (Aluno aluno: curso2.alunos){
            System.out.println("Aluno do curso "+curso2.nome+" "+aluno.nome);
        }
        System.out.println("\n");
        for (Aluno aluno: curso3.alunos){
            System.out.println("Aluno do curso "+curso3.nome+" "+aluno.nome);
        }
        System.out.println("Todos os alunos: "+aluno1.cursos.get(0).alunos);
    }
}
