package exercicios.exercicio1;

public class MainExercicio1 {
    public static void main(String[] args) {
        Produto p1 = new Produto("Notebook", 3500.00, 10);
        System.out.println("Produto criado: " + p1);

        p1.setPreco(3200.00);
        p1.setQuantidadeEmEstoque(15);
        System.out.println("Produto atualizado: " + p1);

        try {
            p1.setPreco(-100);
        } catch (IllegalArgumentException e) {
            System.out.println("Erro ao atualizar preço: " + e.getMessage());
        }

        try {
            p1.setQuantidadeEmEstoque(-5);
        } catch (IllegalArgumentException e) {
            System.out.println("Erro ao atualizar estoque: " + e.getMessage());
        }

        try {
            p1.setNome("");
        } catch (IllegalArgumentException e) {
            System.out.println("Erro ao atualizar nome: " + e.getMessage());
        }
    }
}
