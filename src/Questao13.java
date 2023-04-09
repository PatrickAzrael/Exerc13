import java.util.Scanner;

public class Questao13 {
    public static void main(String[] args) {
        Scanner leia = new Scanner(System.in);
        System.out.println("Informe a sua altura: ");
        float h;
        h = leia.nextFloat();

        System.out.println("Informe o seu sexo (1 para masculino e 2 para feminino): ");
        int S;
        S = leia.nextInt();
        leia.close();
        double pesoideal;

        if (S == 1) {
            pesoideal = (72.7 * h) - 58;
            System.out.printf("Você é do Sexo masculino e seu peso ideal é: " + pesoideal);
        } else {
            pesoideal = (62.1 * h) - 44.7;
            System.out.printf("Você é do Sexo feminino e seu peso ideal é: " + pesoideal);

        }
    }

}
