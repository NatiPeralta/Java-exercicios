package exercicios.exercicio5;

import java.math.BigDecimal;

public class CartaoCredito extends FormaPagamento {
    private String numeroCartao;

    public CartaoCredito(String numeroCartao) {
        this.numeroCartao = numeroCartao;
    }

    @Override
    public void validarPagamento() {
        if (numeroCartao == null || numeroCartao.length() != 16) {
            throw new PagamentoInvalidoException("Número de cartão inválido!");
        }
    }

    @Override
    public void processarPagamento(BigDecimal valor) {
        validarPagamento();
        System.out.println("Pagamento de R$" + valor + " processado com Cartão de Crédito.");
    }
}
