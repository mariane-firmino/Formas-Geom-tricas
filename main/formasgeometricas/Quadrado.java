package main.formasgeometricas;
/* Toda classe terá atributos e métodos;
 * Atributos são as características (variavel)
 * Métodos são as ações (funções);
 * Classificamos esses métodos de acordo com as suas características:
 * Método Construtor: Quando for instanciado um novo objeto, ele será 'const'
 * definido no método construtor (imagine esse método como a 'fábrica' da sua)
 * Métodos get e set:
 * get (pegar) -> utilizado para ver qual o valor atual do atributo;
 * set (colocar) -> insere/altera o valor do atributo;
 * Métodos 'próprios': Métodos que criamos para dar mais ações para a nossa classe;
 */


public class Quadrado {
    // Atributos da classe quadrado:
    double lado;
    double area;
    double perimetro;

    // Métodos
    // Método construtor:
    Quadrado(double lado) {
        this.lado = lado; 
        this.area = lado * lado;
        this.perimetro = lado * 4;
        // Estamos pegando a variável 'temporária (lado)' e atribuindo seu valor 
        // para o atributo 'this.lado' que não será 'esquecido'.
    }

    // Métodos próprios:
    void calcularArea() {
        this.area = lado * lado;
    }

    void calcularPerimetro() {
        this.perimetro = lado * 4;
    }

    void imprimir () {
        System.out.println("Lado: " + lado);
        System.out.println("Área: " + area);
        System.out.println("Perímetro: " + perimetro);
    }

}
