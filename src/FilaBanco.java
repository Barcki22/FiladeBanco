public class FilaBanco {
    private final Clientes[] fila;
    private int tamanho;
    private int proximaSenha;

    public FilaBanco(int capacidade) {
        fila = new Clientes [capacidade];
        tamanho = 0;
        proximaSenha = 1;
    }

    public String enqueue(String nome) {
        if (tamanho == fila.length)
            return "Fila cheia! Não foi possível adicionar " + nome + ".";

        fila[tamanho++] = new Clientes(nome, proximaSenha++);
        return fila[tamanho - 1] + " entrou na fila. Posição: " + tamanho;
    }

    public String dequeue() {
        if (tamanho == 0)
            return "Nenhum cliente aguardando.";

        Clientes atendido = fila[0];
        for (int i = 0; i < tamanho - 1; i++)
            fila[i] = fila[i + 1];
        fila[--tamanho] = null;

        return "Atendendo: " + atendido;
    }

    public String front() {
        if (tamanho == 0)
            return "Nenhum cliente aguardando.";

        String lista = "Clientes na fila (" + tamanho + "):\n";
        for (int i = 0; i < tamanho; i++)
            lista += "  " + (i + 1) + ". " + fila[i] + "\n";

        return lista.toString().trim();

    }

    public int getTamanho()    { return tamanho; }
    public int getCapacidade() { return fila.length; }


}
