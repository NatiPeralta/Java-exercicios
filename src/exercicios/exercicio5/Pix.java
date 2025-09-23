package exercicios.exercicio5;

import java.math.BigDecimal;

public class Pix extends FormaPagamento {
    private String chavePix;

    public Pix(String chavePix) {
        this.chavePix = chavePix;
    }

    @Override
    public void validarPagamento() {
        if (chavePix == null || chavePix.isEmpty()) {
            throw new PagamentoInvalidoException("Chave Pix inválida!");
        }
    }

    @Override
    public void processarPagamento(BigDecimal valor) {
        validarPagamento();
        System.out.println("Pagamento de R$" + valor + " processado com Pix.");
    }
}
