package exercicios.exercicio4;

public class Bicicleta implements IMeioTransporte {
    private int velocidade;

    public Bicicleta() {
        this.velocidade = 0;
    }

    @Override
    public void acelerar() {
        if (velocidade >= 50) {
            System.out.println("Bicicleta já está na velocidade máxima!");
        } else {
            velocidade += 5;
            System.out.println("Bicicleta acelerou. Velocidade atual: " + velocidade + " km/h");
        }
    }

    @Override
    public void frear() {
        if (velocidade <= 0) {
            System.out.println("Bicicleta já está parada!");
        } else {
            velocidade -= 5;
            System.out.println("Bicicleta freou. Velocidade atual: " + velocidade + " km/h");
        }
    }
}
