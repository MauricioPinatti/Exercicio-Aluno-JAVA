public class CalculoBaseMediaDoAlunoImpl implements CalculoBaseMediaDoAluno{

    private final static int MEDIA_DA_ESCOLA = 6;

    @Override
    public float calculaMedia(Aluno aluno) {
        float media = 0;
        float notatotal = 0;

        for (int i = 0; i < aluno.getNotas().size(); i++) {
            notatotal += aluno.getNotas().get(i);
        }

        media = notatotal / aluno.getNotas().size();

        System.out.println("A media do Aluno "+ aluno.getNome() + " é " + media);
        return media;

    }

    @Override
    public void validaSeAlunoFoiAprovado(Float media) {

        if (media >= MEDIA_DA_ESCOLA){
            System.out.println("Status do Aluno: " + "APROVADO");
        }else{
            System.out.println("Status do Aluno: " + StatusAluno.REPROVADO.name());
        }

    }

}
