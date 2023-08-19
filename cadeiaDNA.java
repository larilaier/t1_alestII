import java.util.Scanner;

public class cadeiaDNA {
    static String cadeia;
    static String cadeiaNova;
    char recebido;
    char D;
    char N;
    char A;
    static Scanner t = new Scanner(System.in);

    public cadeiaDNA() {

    }

    public void analisarCadeia() {

        for (int i = 0; i < cadeia.length(); i++) {
            char currentChar = cadeia.charAt(i);
            if (i < cadeia.length() - 1) {
                char nextChar = cadeia.charAt(i + 1);
                if (currentChar == nextChar) {
                    i++;
                    continue;
                }
            }
        }


        /*for (int i = 0; i < cadeia.length(); i++) {
            char caractereAtual = cadeia.charAt(i);
            switch (caractereAtual) {
                case 'A':
                    if (recebido == 'D' + 'N' || recebido == 'N' + 'D') {
                        System.out.println(cadeiaNova + "A" + cadeia);
                    }
                    break;
                case 'D':
                    if (recebido == 'N' + 'A' || recebido == 'A' + 'N') {
                        System.out.println(cadeiaNova + "D" + cadeia);
                    }
                    break;
                case 'N':
                    if (recebido == 'D' + 'A' || recebido == 'A' + 'D') {
                        System.out.println(cadeiaNova + "N" + cadeia);
                    }
                    break;
                default:
                    // passar para o próximo caractere da string
                    break;
            }**/
        }

    }
}