package exercicios.exercicio5;

import java.math.BigDecimal;

public class Boleto extends FormaPagamento {
    private String codigoBarras;

    public Boleto(String codigoBarras) {
        this.codigoBarras = codigoBarras;
    }

    @Override
    public void validarPagamento() {
        if (codigoBarras == null || codigoBarras.length() != 47) {
            throw new PagamentoInvalidoException("Código de barras do boleto inválido!");
        }
    }

    @Override
    public void processarPagamento(BigDecimal valor) {
        validarPagamento();
        System.out.println("Pagamento de R$" + valor + " processado com Boleto.");
    }
}
