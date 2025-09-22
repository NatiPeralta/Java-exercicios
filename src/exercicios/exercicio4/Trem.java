package exercicios.exercicio4;

public class Trem implements IMeioTransporte {
    private int velocidade;

    public Trem() {
        this.velocidade = 0;
    }

    @Override
    public void acelerar() {
        if (velocidade >= 150) {
            System.out.println("Trem já está na velocidade máxima!");
        } else {
            velocidade += 15;
            System.out.println("Trem acelerou. Velocidade atual: " + velocidade + " km/h");
        }
    }

    @Override
    public void frear() {
        if (velocidade <= 0) {
            System.out.println("Trem já está parado!");
        } else {
            velocidade -= 15;
            System.out.println("Trem freou. Velocidade atual: " + velocidade + " km/h");
        }
    }
}
