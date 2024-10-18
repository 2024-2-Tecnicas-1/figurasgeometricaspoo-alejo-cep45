package com.mycompany.figurasgeometricas;

import java.util.Scanner;

public class Principal {

    static Circulo circulo;
    static Rectangulo rectangulo;
    static Triangulo triangulo;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese el nombre de la figura");
        String nombref = sc.next().toLowerCase();
        System.out.println("Ingrese el color de la figura");
        String colorf = sc.next().toLowerCase();
        System.out.println("Ingrese el tipo de figura");
        String tipof = sc.next();
        switch (tipof) {
            case "circulo":
                System.out.println("Ingrese el radio del circulo");
                double rad = sc.nextDouble();
                Circulo circulo = new Circulo(nombref, colorf, rad);
                circulo.obtenerArea(rad);
                circulo.obtenerPerimetro(rad);
                break;

            case "rectangulo":
                System.out.println("Ingrese el valor del lado 1 del rectangulo");
                int ld1 = sc.nextInt();
                System.out.println("Ingrese el valor del lado 2 del rectangulo");
                int ld2 = sc.nextInt();
                Rectangulo rectangulo = new Rectangulo(nombref, colorf, ld1, ld2);
                rectangulo.obtenerArea(ld1, ld2);
                rectangulo.obtenerPerimetro(ld1, ld2);
                break;

            case "triangulo":
                System.out.println("Ingrese el valor de la base del triangulo");
                int baset = sc.nextInt();
                System.out.println("Ingrese el valor de la altura del triangulo");
                int alt = sc.nextInt();
                Triangulo triangulo = new Triangulo(nombref, colorf, baset, alt);
                triangulo.obtenerArea(baset, alt);
                triangulo.obtenerPerimetro(baset, alt);
                break;
            default:
                System.out.println("Figura no valida");

        }

    }
}
