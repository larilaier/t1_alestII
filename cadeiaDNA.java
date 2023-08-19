import java.util.Scanner;

public class cadeiaDNA{
    String cadeia;
    Scanner t = new Scanner(System.in);

    System.out.println("Insira a cadeia: ");
    cadeia = t.nextLine();


    char recebido;
    char D;
    char N;
    char A;

    public static void main(String[] args) {
        cadeiaDNA analiseDNA = new cadeiaDNA();
        analiseDNA.analisarCadeia();
    }

    

    public void analisarCadeia() {

        for (int i=0; i<cadeia.length(); i++) {
        char currentChar = cadeia.charAt(i);
        if (i < cadeia.length() - 1) {
            char nextChar = cadeia.charAt(i + 1);
            if (currentChar == nextChar) {
                i++;
                continue;
            }
        }
    }

        for (int i = 0; i < cadeia.length(); i++) {
            char caractereAtual = cadeia.charAt(i);
            switch (caractereAtual) {
                case 'A':
                    if (recebido == 'D' + 'N' || recebido == 'N' + 'D') {
                        System.out.println("A" + cadeia);
                    }
                    break;
                case 'D':
                    if (recebido == 'N' + 'A' || recebido == 'A' + 'N') {
                        System.out.println("D" + cadeia);
                    }
                    break;
                case 'N':
                    if (recebido == 'D' + 'A' || recebido == 'A' + 'D') {
                        System.out.println("N" + cadeia);
                    }
                    break;
                default:
                    // passar para o próximo caractere da string
                    break;
            }
        }

    }
}