package exercicios.exercicio7;

import java.math.BigDecimal;

public class MainExercicio7 {
    public static void main(String[] args) {
        Pedido pedido1 = new Pedido(new BigDecimal("100.00"), TipoFrete.NORMAL);
        Pedido pedido2 = new Pedido(new BigDecimal("200.00"), TipoFrete.EXPRESSO);
        Pedido pedido3 = new Pedido(new BigDecimal("150.00"), TipoFrete.RETIRADA_LOJA);

        System.out.println(pedido1);
        System.out.println(pedido2);
        System.out.println(pedido3);
    }
}
