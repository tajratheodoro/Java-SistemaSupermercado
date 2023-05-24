public class Cliente {
    private int quantClientes;
    private int tempoAtendimento;
    private int numItens;

    public Cliente(int quantClientes, int tempoAtendimento, int numItens) {
        this.numItens = numItens;
        this.quantClientes = quantClientes;
        this.tempoAtendimento = tempoAtendimento;
    }

    public int getQuantClientes() {
        return quantClientes;
    }

    public int getTempoAtendimento() {
        return tempoAtendimento;
    }

    public int getNumItens() {
        return numItens;
    }
}
