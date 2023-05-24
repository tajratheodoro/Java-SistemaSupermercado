import java.util.Queue;
import java.util.LinkedList;

// "filaPrioritaria" contém todas as pessoas com algum tipo de deficiência ou idosas
// "filaNormal" contém todas as outras pessoas sem alguma exeção
public class GerenciamentoSup {
    private int quantCaixas;
    private Queue<String> filaNormal;
    private Queue<String> filaPrioritaria;

    public GerenciamentoSup(int quantCaixas) {
        this.quantCaixas = quantCaixas;
        this.filaNormal = new LinkedList<>();
        this.filaPrioritaria = new LinkedList<>();
    }
}
