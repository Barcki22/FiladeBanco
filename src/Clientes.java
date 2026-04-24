public class Clientes {
    private String nome;
    private int senha; // número de senha do banco

    public Clientes(String nome, int senha) {
        this.nome = nome;
        this.senha = senha;
    }



    @Override
    public String toString() {
        return "Senha " + senha + " - " + nome;
    }

}



