public class OperadoresLogicos {
    public static void main(String[] args) {

        boolean condicao1 = true;
        boolean condicao2 = false;

        if(condicao1 && condicao2) {//operador &&(E) verifica se aos duas condições são verdadeiras
            System.out.println("As duas condições são verdadeiras");
        } if(condicao1 || condicao2) {//operador ||(OU) verifica se umas das condições são verdadeiras
            System.out.println("Umas das condições é verdadeira");
        }
      
        System.out.println("Fim!");
    }
}
