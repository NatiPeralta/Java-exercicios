package exercicios.exercicio7;

import java.math.BigDecimal;

public enum TipoFrete {
    NORMAL {
        @Override
        public BigDecimal calcular(BigDecimal valorPedido) {
            return valorPedido.multiply(new BigDecimal("0.05"));
        }
    },
    EXPRESSO {
        @Override
        public BigDecimal calcular(BigDecimal valorPedido) {
            return valorPedido.multiply(new BigDecimal("0.10"));
        }
    },
    RETIRADA_LOJA {
        @Override
        public BigDecimal calcular(BigDecimal valorPedido) {
            return BigDecimal.ZERO;
        }
    };

    public abstract BigDecimal calcular(BigDecimal valorPedido);
}
