public class Euro extends Moeda {

    public Euro(double valor) {
        super(valor, "Euro");
    }

    @Override
    public double converterParaReal() {
        return valor * 6.34;  // Inseri o valor do Euro de hoje 05/12.
    }


    @Override
    public boolean equals(Object obj) {
        // Se for o mesmo objeto, retorna true
        if (this == obj) return true;
        // Se o objeto for nulo ou de outro tipo, retorna false
        if (obj == null || getClass() != obj.getClass()) return false;
        // Converte o objeto para Moeda
        Moeda moeda = (Moeda) obj;
        // Compara os valores dos dois objetos
        return Double.compare(moeda.valor, valor) == 0;
    }





}
