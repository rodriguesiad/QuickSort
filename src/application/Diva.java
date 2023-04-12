package application;

public class Diva implements Comparable<Diva> {
    private String nome;
    private Integer idade;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Integer getIdade() {
        return idade;
    }

    public void setIdade(Integer idade) {
        this.idade = idade;
    }

    public Diva(String nome, Integer idade) {
        this.nome = nome;
        this.idade = idade;
    }

    @Override
    public int compareTo(Diva o) {
        return Integer.compare(this.idade, o.idade);
    }

    @Override
    public String toString() {
        return "Diva{" +
                "nome='" + nome + '\'' +
                ", idade=" + idade +
                '}';
    }
}
