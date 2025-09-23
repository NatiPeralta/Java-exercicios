package exercicios.exercicio7;

import java.math.BigDecimal;

public class Pedido {
    private final BigDecimal valor;
    private final TipoFrete tipoFrete;

    public Pedido(BigDecimal valor, TipoFrete tipoFrete) {
        if (valor.compareTo(BigDecimal.ZERO) < 0) {
            throw new IllegalArgumentException("Valor do pedido não pode ser negativo");
        }
        this.valor = valor;
        this.tipoFrete = tipoFrete;
    }

    public BigDecimal calcularValorTotal() {
        return valor.add(tipoFrete.calcular(valor));
    }

    @Override
    public String toString() {
        return "Pedido de " + valor + " com frete " + tipoFrete +
                " → Total = " + calcularValorTotal();
    }
}
