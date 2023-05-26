import java.util.ArrayList;
import java.util.List;
import java.util.Queue;
import java.util.LinkedList;

public class Supermercado {
    private int quantCaixas;
    private Fila filaNormal;
    private Fila filaPrioritaria;
    private List<Queue<Cliente>> filasCaixas;

    public Supermercado(int quantCaixas) {
        this.quantCaixas = quantCaixas;
        this.filasCaixas = new ArrayList<>();
        filaNormal = new Fila();
        filaPrioritaria = new Fila();

        for (int i = 0; i < quantCaixas; i++) {
            filasCaixas.add(new LinkedList<Cliente>());
        }
    }


    public void adicionarCliente(Cliente cliente, boolean prioritario) {
        if (prioritario) {
            filaPrioritaria.adicionarCliente(cliente);
        } else {
            filaNormal.adicionarCliente(cliente);
        }
    }

    public Cliente atenderCliente() {
        if (filaPrioritaria.tamanhoDaFila() > 0) {
            return filaPrioritaria.atenderCliente();
        } else if (filaNormal.tamanhoDaFila() > 0) {
            return filaNormal.atenderCliente();
        } else {
            return null;
        }
    }

    public int tamanhoFilaNormal() {
        return filaNormal.tamanhoDaFila();
    }

    public int tamanhoFilaPrioritaria() {
        return filaPrioritaria.tamanhoDaFila();
    }
}
