package exercicios.exercicio5;

import java.math.BigDecimal;

public class MainExercicio5 {
    public static void main(String[] args) {
        FormaPagamento cartao = new CartaoCredito("1234567812345678");
        FormaPagamento boleto = new Boleto("23793381286006686369453000063305375810000466000"); // exemplo com 47 dígitos
        FormaPagamento pix = new Pix("nataliapix@banco.com");

        try {
            cartao.processarPagamento(new BigDecimal("100.00"));
        } catch (PagamentoInvalidoException e) {
            System.out.println("Erro: " + e.getMessage());
        }

        try {
            boleto.processarPagamento(new BigDecimal("250.00"));
        } catch (PagamentoInvalidoException e) {
            System.out.println("Erro: " + e.getMessage());
        }

        try {
            pix.processarPagamento(new BigDecimal("50.00"));
        } catch (PagamentoInvalidoException e) {
            System.out.println("Erro: " + e.getMessage());
        }

        // Exemplo inválido
        FormaPagamento cartaoInvalido = new CartaoCredito("123");
        try {
            cartaoInvalido.processarPagamento(new BigDecimal("200.00"));
        } catch (PagamentoInvalidoException e) {
            System.out.println("Erro esperado: " + e.getMessage());
        }
    }
}
