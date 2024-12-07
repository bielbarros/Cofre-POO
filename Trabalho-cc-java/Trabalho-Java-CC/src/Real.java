public class Real extends Moeda {

    public Real(double valor) {
        super(valor, "Real");
    }

    @Override
    public double converterParaReal() {
        return valor;  // O valor já está em reais então não coloquei operação
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
