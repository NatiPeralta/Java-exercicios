package exercicios.exercicio8;

import java.math.BigDecimal;

public class Pedido {
    private final BigDecimal valor;
    private final String cep;
    private CalculadoraFrete estrategiaFrete;

    public Pedido(BigDecimal valor, String cep, CalculadoraFrete estrategiaFrete) {
        if (valor.compareTo(BigDecimal.ZERO) < 0) {
            throw new IllegalArgumentException("Valor do pedido não pode ser negativo");
        }
        if (cep == null || cep.isBlank()) {
            throw new IllegalArgumentException("CEP inválido");
        }
        this.valor = valor;
        this.cep = cep;
        this.estrategiaFrete = estrategiaFrete;
    }

    public BigDecimal calcularTotal() {
        return valor.add(estrategiaFrete.calcular(this));
    }

    public void setEstrategiaFrete(CalculadoraFrete estrategiaFrete) {
        this.estrategiaFrete = estrategiaFrete;
    }

    public BigDecimal getValor() {
        return valor;
    }

    public String getCep() {
        return cep;
    }
}
