package main.formasgeometricas;

public class Circulo {
    // Atributos
    double raio;
    double pi = 3.14;
    double area;
    double perimetro;

    // Método construtor
    Circulo (double raio) {
        this.raio = raio;
        this.area = pi * (raio * raio);
        this.perimetro = 2 * pi * raio;
    }
    
    // Métodos próprios
    void calcularArea() {
        this.area = pi * (raio * raio);
    }

    void calcularPetimetro() {
        this.perimetro = 2 * pi * raio;
    }

    void imprimir () {
        System.out.println("Raio: " + raio);
        System.out.println("Área: " + area);
        System.out.println("Perímetro: " + perimetro);
    }
}
