public class OperadoresRelacionais {
    public static void main(String[] args) {
        
        int numero1 =  1;
        int numero2 = 2;

        boolean simNao = numero1 == numero2;
        System.out.println("NúmeroUm é IGUAL ao numeroDois? " + simNao);

        simNao = numero1 != numero2;
        System.out.println("NúmeroUm é DIFERENTE ao numeroDois? " + simNao);

        simNao = numero1 > numero2;
        System.out.println("NúmeroUm é MAIOR ao numeroDois? " + simNao);

        simNao = numero1 < numero2;
        System.out.println("NúmeroUm é MENOR ao numeroDois? " + simNao);

        //Temos também os operadores >=(Maior ou igual) e <= (Menor ou igual)

        //Usando classe
        String nomeUM = "Paulo";
        //String nomeDois = "Santos";

        String nomeDois = new String("Paulo");

        System.out.println(nomeUM == nomeDois);//resultado => false
        System.out.println(nomeUM.equals(nomeDois));//resultado => true
        
    }
}
