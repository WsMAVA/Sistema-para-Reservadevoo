package wsilva;

import java.util.Scanner;

public class ReservaLinhaArea {
    public static void main(String[] args) {
        Reserva reserva = new Reserva();
        reserva.livrodeVoo();

    }
    public static class Reserva{
        private String nomepassageiro;
        private int numerodovoo;

        public void livrodeVoo(){
            Scanner s = new Scanner(System.in);

            System.out.println("Digite o nome do passageiro: ");
            nomepassageiro = s.nextLine();

            System.out.println("Digite o número do voo: ");
            numerodovoo = s.nextInt();

            System.out.println("Voo reservado com sucesso para " + nomepassageiro + " no número de voo " + numerodovoo);

        }
    }
}
