import java.util.ArrayList;
import java.util.List;

public class Application {

    public static void main(String[] args) {

        List<Float> notasAluno1 = new ArrayList<Float>();

        notasAluno1.add(new Float(4.5));
        notasAluno1.add(new Float(7.9));
        notasAluno1.add(new Float(2.8));
        notasAluno1.add(new Float(9.5));

        Aluno aluno1 = new Aluno("Pedro Henrique",16, 15039395,notasAluno1);

        CalculoBaseMediaDoAlunoImpl calculosBaseAluno = new CalculoBaseMediaDoAlunoImpl();

        float media = calculosBaseAluno.calculaMedia(aluno1);
        calculosBaseAluno.validaSeAlunoFoiAprovado(media);
    }
}

