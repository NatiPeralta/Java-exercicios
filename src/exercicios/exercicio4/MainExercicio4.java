package exercicios.exercicio4;

import java.util.ArrayList;
import java.util.List;

public class MainExercicio4 {
    public static void main(String[] args) {
        List<IMeioTransporte> transportes = new ArrayList<>();
        transportes.add(new Carro());
        transportes.add(new Bicicleta());
        transportes.add(new Trem());

        for (IMeioTransporte t : transportes) {
            t.acelerar();
            t.acelerar();
            t.frear();
            System.out.println("------------------------");
        }
    }
}
