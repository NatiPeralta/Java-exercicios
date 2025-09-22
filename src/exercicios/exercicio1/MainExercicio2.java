package exercicios.exercicio1;

public class MainExercicio2 {
    public static void main(String[] args) {
        Produto p1 = new Produto("Smartphone", 2000.00, 5);
        System.out.println("Preço original: " + p1.getPreco());

        // Aplicando desconto válido
        p1.aplicarDesconto(20);
        System.out.println("Preço após 20% de desconto: " + p1.getPreco());

        // Tentando aplicar desconto inválido
        try {
            p1.aplicarDesconto(60);
        } catch (IllegalArgumentException e) {
            System.out.println("Erro ao aplicar desconto: " + e.getMessage());
        }

        try {
            p1.aplicarDesconto(-5);
        } catch (IllegalArgumentException e) {
            System.out.println("Erro ao aplicar desconto: " + e.getMessage());
        }
    }
}
