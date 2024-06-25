public class operadoresTernarios {
    public static void main(String[] args) {
        int a, b;
       
        a = 6;
        b = 6;

        String resultado = "";
        /*
        Exemplo de condicional utilizando uma estrutura IF/ELSE
        if (a == b) {
            resultado = "Verdadeiro";
        } else {
            resultado = "Falso";
        }
        */

        resultado = a == b ? "Verdadeiro" : "Falso"; //Expressão ternária

        System.out.println(resultado);


    }
}
