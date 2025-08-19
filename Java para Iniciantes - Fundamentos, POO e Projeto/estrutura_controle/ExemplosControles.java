package estrutura_controle;

public class ExemplosControles {

    public static void main(String[] args) {

        // if - else (condicionais)
        // operadores de comparação

        // x > y, a == b

        int idade = 18;
        // if -> começa a condição
        // () -> contem a condição a ser avaliado
        // {} -> corpo da condição
        if (idade >= 18) {
            System.out.println("você é maior de idade!");

        } else {
            System.out.println("voce não é maior de idade");
        }

        // if -> validar se algo é verdadeiro
        // else -> executa se o if não executar

        double nota = 6.3;

        if (nota > 7) {
            System.out.println("voce está na média");
        } else {
            System.out.println("você não está na média...");
        }

        // else if -> intermediario do if e else
        // e ele valida um bloco tambem
        int hora = 14;

        if (hora < 12) {
            System.out.println("Bom dia");
        } else if (hora < 18) {
            System.out.println("Boa tarde");
        } else {
            System.out.println("Boa noite");
        }

        // eu posso ter 1 ou mais else if

        // 2 - operadores de comparação
        int x = 10;
        int y = 5;

        // = é diferente de

        System.out.println("x == y: " + (x == y));
        System.out.println("x != y: " + (x != y));
        System.out.println("x > y: " + (x > y));
        System.out.println("x < y: " + (x < y));

        boolean o = true;

        if (o) {
            System.out.println(("é verdadeiro"));
        }

        // Operadores lógicos

        // &&
        //
    }

}
