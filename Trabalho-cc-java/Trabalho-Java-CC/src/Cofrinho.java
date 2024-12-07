import java.util.ArrayList;
import java.util.List;

public class Cofrinho {
    private List<Moeda> moedas;

    public Cofrinho() {
        this.moedas = new ArrayList<>();
    }


    // Método para adição de moedas e print para confirmação
    public void adicionarMoeda(Moeda moeda) {
        moedas.add(moeda);
        System.out.println(moeda.toString() + " adicionada ao cofrinho.");
    }

    // Método para remoção de moedas com prints para confirmação
    public void removerMoeda(Moeda moeda) {
        if (moedas.remove(moeda)) {
            System.out.println(moeda.toString() + " removida do cofrinho.");
        } else {
            System.out.println("Moeda não encontrada no cofrinho.");
        }
    }

    /* Método para listar moedas usando condicionais e função isEmpty para verificar se contém
    moedas ou não.
     */
    public void listarMoedas() {
        if (moedas.isEmpty()) {
            System.out.println("O cofrinho está vazio! ");
        } else {
            System.out.println("Listando moedas no cofrinho: ");
            for (Moeda moeda : moedas) {
                System.out.println(moeda);
            }
        }
    }



    public double calcularTotal() {
        double total = 0;
        for (Moeda moeda : moedas) {
            total += moeda.converterParaReal();
        }
        return total;
    }
}
