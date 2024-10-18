package com.mycompany.figurasgeometricas;


class Rectangulo extends FiguraGeometrica {
    private int lado1;
    private int lado2;
    
    public Rectangulo(String nombre, String color, int lado1, int lado2){
        super(nombre, color);
        this.lado1=lado1;
        this.lado2=lado2;
    }
    public void obtenerArea(int lad1, int lad2) {
        int area = lad1 * lad2;
        System.out.println("El area es "+ area);
    }
    public void obtenerPerimetro(int ld1,int ld2){
        int per = (ld1*2)+(ld2*2);
        System.out.println("El perimetro es "+per);
    }
}
