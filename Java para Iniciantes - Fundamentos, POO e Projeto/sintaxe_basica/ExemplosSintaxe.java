package sintaxe_basica;

public class ExemplosSintaxe {
    public static void main(String[] args) {
        // 1 - Impressão de texto
        System.out.println("PODEMOS IMPRIMIR ISSO! e numeros também " + 45);

        // 2- Tipos primitivos
        // variavel = coloca dados
        // int - integer = inteiro

        int idade = 25;
        int anoAtual = 2024;

        System.out.println("sua idade é " + idade + " anos");

        double altura = 1.79;
        double pi = 3.14;

        System.out.println("Altura " + altura + " PI " + pi);

        // Textos = Strings
        String nome = "Isaac";

        System.out.println("O nome é: " + nome);

        // boolean => true ou false
        boolean estaLogado = true;
        boolean temAcesso = false;

        System.out.println("Está logado? " + estaLogado);
        System.out.println("Acesso: " + temAcesso);

        // Variaveis

        int numero;
        numero = 10;

        System.out.println(numero);

        numero = 15;

        System.out.println(numero);

        // a atribuição precisa ser do mesmo tipo declarado
        // numero = "teste";

        // 4 - Operadores báasicos
        // aritméticas
        int a = 10;
        int b = 5;

        System.out.println("A + B = " + (a + b));
        System.out.println("A - B = " + (a - b));
        System.out.println("A / B = " + (a / b));
        System.out.println("A * B = " + (a * b));

        double c = 10;
        double d = 3;

        System.out.println("C / D = " + (c / d));

        // operador incremento e decremento
        int contador = 0;

        contador++;

        System.out.println("VALOR CONTADOR: " + contador);

        contador--;
        contador--;
        contador--;

        System.out.println("VALOR CONTADOR: " + contador);

        // operador composto
        // a= 10
        // a = a + 5
        // a += 5

    }
}
