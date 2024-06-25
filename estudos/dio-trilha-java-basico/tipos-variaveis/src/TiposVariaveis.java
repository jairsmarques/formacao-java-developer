public class TiposVariaveis {
    public static void main(String[] args) {
        //tipos primitivos
        //estudem a classe String que representa texto na aplicação

        String meuNome = "Jair de Sousa";
        System.out.println(meuNome);

        double salarioMinimo = 2500.33;
        System.out.println(salarioMinimo);

        System.out.println("***Casting***");
        short numeroCurto = 1;
        int numeroNormal = numeroCurto;
        short numeroCurto2 = (short)numeroNormal;
        System.out.println(numeroCurto2);

        System.out.println("***Constante***");
        final int valor_nunca_podera_mudar = 10;
        //valor_nunca_podera_mudar = 50; <= não é permitido mudar ovalor da variável
        System.out.println(valor_nunca_podera_mudar);
        final double VALOR_DE_PI = 3.14; //=> usar caixa alta na declaração de constantes
        System.out.println(VALOR_DE_PI);
    }
}
