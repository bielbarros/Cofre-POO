public abstract class Moeda {

    protected double valor;
    protected String pais;

    // Construtor
    public Moeda(double valor, String pais) {
        this.valor = valor;
        this.pais = pais;
    }

    public abstract double converterParaReal();  // Método abstrato para conversão

    // metodo toString para converter o nome lógico em texto
    @Override
    public String toString() {
        return String.format("Moeda: %s - Valor: %.2f", pais, valor);
    }

    @Override
    public boolean equals(Object obj) {
        // Verifica se os dois objetos são o mesmo na memória
        if (this == obj) return true;

        // Verifica se o objeto é nulo ou se as classes dos objetos são diferentes
        if (obj == null || getClass() != obj.getClass()) return false;

        // Converte o objeto para a classe Moeda e compara o valor das moedas
        Moeda moeda = (Moeda) obj;
        return Double.compare(moeda.valor, valor) == 0;
    }



}

