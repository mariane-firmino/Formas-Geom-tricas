package main.formasgeometricas;

public class Triangulo {
    double area;
    double base;
    double altura;

    Triangulo (double base,  double altura) {
        this.base = base;
        this.altura = altura;
        this.area = (base * altura) / 2;
    }

    void imprimir () {
        System.out.println("Base: " + base);
        System.out.println("Altura: " + altura);
        System.out.println("Área: " + area);
    }
}

