public class Cliente {
    private int quantClientes;
    private int numItens;

    public Cliente(int quantClientes,int numItens) {
        this.numItens = numItens;
        this.quantClientes = quantClientes;
    }

    public int getQuantClientes() {
        return quantClientes;
    }

    public int getNumItens() {
        return numItens;
    }
}
