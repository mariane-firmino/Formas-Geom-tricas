package main.formasgeometricas;
import java.util.Scanner;
/* Criar classes para calcular área e perímetro de formas geométricas 2D;
 * Cada forma terá sua própria classe:
 * Quadrado, Círculo, Retângulo, Triângulo;
 * Insira os atributos e métodos necessários;
 */
public class Principal {
// A classe principal (main) é utilizada para a instanciação e execução dos métodos.
public static void main(String[] aargs) {
    Scanner teclado = new Scanner(System.in);
    int num = 0;
    do{
    System.out.println("Calculadora de Formas Geométricas 2D");
    System.out.println("Opções:");
    System.out.println("----------------------------------------");
    System.out.println("1 - Quadrado \n2 - Círculo \n3 - Retângulo \n4 - Triângulo \n5- Sair");
    System.out.println("----------------------------------------");
    System.out.println("Escolha uma opção:");
    num = teclado.nextInt();
    
    
    switch (num){
        case 1:
            System.out.println("Vamos calcular a área e o perímetro do Quadrado!!!");
            System.out.println("Informe o valor do lado do quadrado:");
            double lado = teclado.nextDouble();
            Quadrado quadrado = new Quadrado(lado);
            quadrado.imprimir();
            break;
        case 2:
            System.out.println("Vamos calcular a área e o perímetro do Círculo!!!");
            System.out.println("Informe o valor do raio do círculo:");
            double raio = teclado.nextDouble();
            Circulo circulo = new Circulo(raio);
            circulo.imprimir();
            break;
        case 3:
            System.out.println("Vamos calcular a área e o perímetro do Retângulo!!!");
            System.out.println("Informe o valor da base do retângulo:");
            double base = teclado.nextDouble();
            System.out.println("Informe o valor da altura do retângulo:");
            double altura = teclado.nextDouble();
            Retangulo retangulo = new Retangulo(base, altura);
            retangulo.imprimir();
            break;
        case 4:
            System.out.println("Vamos calcular a área e o perímetro do Triângulo!!!");
            System.out.println("Informe o valor da base do triângulo:");
            double base1 = teclado.nextDouble();
            System.out.println("Informe o valor da altura do triângulo:"); 
            double alturaTriangulo = teclado.nextDouble();
            Triangulo triangulo1 = new Triangulo(base1, alturaTriangulo);
            triangulo1.imprimir();
            break;
        case 5:
            System.out.println("Fim do programa. Até mais!");
            break;
        default:
            System.out.println("Opção inválida. Tente novamente.");
            break;
    }
    } while (num !=5);
}
}

