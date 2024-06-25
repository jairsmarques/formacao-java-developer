public class operadoresUnarios {
    public static void main(String[] args) {
        int numero = 5;
        System.out.println(- numero);//imprime -5 mas não altera a variável para negativo
        System.out.println(numero);

        numero = - numero;// altera o valor da variável que positivo para negativo
        System.out.println(numero);

        numero =  numero * -1;// altera o valor da variável que é negativo para positivo
        System.out.println(numero);

        //Incrementação e Decrementação
        numero++;
        System.out.println(numero);//++ incrementa 1 a variável número

        numero--;
        System.out.println(numero);//-- decrementa 1 avariável número

        boolean variavel = true;
        System.out.println(!variavel);//operador ! inverte o valor da variavel
        System.out.println(variavel);//em memória ela permanece como true
        variavel = !variavel;//inverte o valor em memória
        System.out.println(variavel);
    }
}
