package exercicios.exercicio8;

import java.math.BigDecimal;

public class MainExercicio8 {
    public static void main(String[] args) {
        // Estratégias de frete
        CalculadoraFrete sedex = pedido ->
                new BigDecimal("20.00").add(pedido.getValor().multiply(new BigDecimal("0.05")));

        CalculadoraFrete pac = pedido ->
                new BigDecimal("10.00").add(pedido.getValor().multiply(new BigDecimal("0.02")));

        CalculadoraFrete retiradaNaLoja = pedido -> BigDecimal.ZERO;

        // Estratégia promocional (lambda)
        CalculadoraFrete freteGratisPromocional = pedido ->
                pedido.getValor().compareTo(new BigDecimal("300.00")) > 0
                        ? BigDecimal.ZERO
                        : new BigDecimal("25.00");

        // Criando pedidos
        Pedido pedido1 = new Pedido(new BigDecimal("200.00"), "12345-678", sedex);
        Pedido pedido2 = new Pedido(new BigDecimal("150.00"), "98765-432", pac);
        Pedido pedido3 = new Pedido(new BigDecimal("500.00"), "11111-111", retiradaNaLoja);

        System.out.println("Pedido 1 total (Sedex): " + pedido1.calcularTotal());
        System.out.println("Pedido 2 total (Pac): " + pedido2.calcularTotal());
        System.out.println("Pedido 3 total (Retirada): " + pedido3.calcularTotal());

        // Trocando a estratégia em tempo de execução
        pedido1.setEstrategiaFrete(freteGratisPromocional);
        System.out.println("Pedido 1 total (Frete Promocional): " + pedido1.calcularTotal());
    }
}
