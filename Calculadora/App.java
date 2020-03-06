package calculadora;
import java.util.Scanner;

class App {
    public static void main(String[] args){
        //Instãncia de classe em java
        Calculadora calculadora = new Calculadora();
        
        //Classe de entrada no java
        Scanner entrada = new Scanner(System.in);
        
        // Next int é para receber inteiro via teclado
        System.out.print("Escreva um número");
        calculadora.a = entrada.nextInt();
        System.out.print("Escreva o segundo número");
        calculadora.b = entrada.nextInt();

        calculadora.Soma();
        
        // Recebe o resultado do retorno do método
        int resultado = calculadora.Multiplicacao();

        System.out.println("O resultado foi " + resultado);
        
        calculadora.Subtracao(calculadora.a, calculadora.b);
        
        int resultadoDivisao = calculadora.Divisao(calculadora.a, calculadora.b);
        
        System.out.println("O resultado da divisão foi " + resultadoDivisao);
    }
}
