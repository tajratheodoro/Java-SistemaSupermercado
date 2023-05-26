import java.util.LinkedList;
import java.util.Queue;

public class Fila {
    private Queue<Cliente> fila;
    
    public Fila() {
        fila = new LinkedList<>();
    }

    public void adicionarCliente(Cliente cliente) {
        fila.add(cliente);
    }

    public Cliente atenderCliente() {
        return fila.poll();
    }

    public int tamanhoDaFila() {
        return fila.size();
    }
}
