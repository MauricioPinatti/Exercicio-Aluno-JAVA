import java.util.List;
//como criamos uma lista, precisamos importar o metodo lista.

public class Aluno {

    //atributos
    private String nome;
    private int idade;
    private int ra;
    private List<Float> notas;

    //construtor
    public Aluno(String nome, int idade, int ra, List<Float> notas) {
            this.nome = nome;
            this.idade = idade;
            this.ra = ra;
            this.notas = notas;
    }

    //Metodos getters/setters dos atributos
        public String getNome() {
            return nome;
        }

        public void setNome(String nome) {
            this.nome = nome;
        }

        public int getIdade() {
            return idade;
        }

        public void setIdade(int idade) {
            this.idade = idade;
        }

        public int getRa() {
            return ra;
        }

        public void setRa(int ra) {
            this.ra = ra;
        }

        public List<Float> getNotas() {
            return notas;
        }

        public void setNotas(List<Float> notas) {
            this.notas = notas;
        }

}
