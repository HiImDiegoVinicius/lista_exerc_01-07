import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner input = new Scanner(System.in);
        System.out.print("Digite o Tamanho de um dos lados do quadrado: ");
        double lado = input.nextDouble();
        double AreaT = lado * lado;
        input.close();
        System.out.println("A Área Total do Quadrado é: " + AreaT);
        double dobro = AreaT * 2;
        System.out.println("O Dobro da Área é: " + dobro);
    }
}
