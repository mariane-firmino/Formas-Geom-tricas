package main.formasgeometricas;

public class Triangulo {
    double area;
    double lado1, lado2, lado3;
    double base;
    double altura;
    double perimetro;

    Triangulo (double base, double lado1, double lado2, double lado3, double altura) {
        this.base = base;
        this.lado1 = lado1;
        this.lado2 = lado2;
        this.lado3 = lado3;
        this.altura = altura;
        this.area = (base * altura) / 2;
        this.perimetro = lado1 + lado2 + lado3;
    }

    void imprimir () {
        System.out.println("Base: " + base);
        System.out.println("Lado 1: " + lado1);
        System.out.println("Lado 2: " + lado2);
        System.out.println("Lado 3: " + lado3);
        System.out.println("Altura: " + altura);
        System.out.println("Área: " + area);
        System.out.println("Perímetro: " + perimetro);
    }
}
