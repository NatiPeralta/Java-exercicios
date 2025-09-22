package exercicios.exercicio4;

public class Carro implements IMeioTransporte {
    private int velocidade;

    public Carro() {
        this.velocidade = 0;
    }

    @Override
    public void acelerar() {
        if (velocidade >= 200) {
            System.out.println("Carro já está na velocidade máxima!");
        } else {
            velocidade += 20;
            System.out.println("Carro acelerou. Velocidade atual: " + velocidade + " km/h");
        }
    }

    @Override
    public void frear() {
        if (velocidade <= 0) {
            System.out.println("Carro já está parado!");
        } else {
            velocidade -= 20;
            System.out.println("Carro freou. Velocidade atual: " + velocidade + " km/h");
        }
    }
}
