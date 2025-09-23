package exercicios.exercicio6;

import java.math.BigDecimal;
import java.util.Collections;

public class MainExercicio6 {
    public static void main(String[] args) {
        Produto p1 = new Produto("Notebook", new Dinheiro(new BigDecimal("3500.00"), Moeda.BRL));
        Produto p2 = new Produto("Mouse", new Dinheiro(new BigDecimal("100.00"), Moeda.BRL));

        Carrinho carrinho = new Carrinho(Collections.emptyList());
        carrinho = carrinho.adicionarItem(p1, 1);
        carrinho = carrinho.adicionarItem(p2, 2);

        System.out.println(carrinho);

        // aplicar cupom de 10%
        carrinho = carrinho.aplicarCupomDesconto(new BigDecimal("10"));
        System.out.println("Com desconto de 10%:");
        System.out.println(carrinho);

        // remover item
        carrinho = carrinho.removerItem(p2);
        System.out.println("Após remover mouse:");
        System.out.println(carrinho);
    }
}
