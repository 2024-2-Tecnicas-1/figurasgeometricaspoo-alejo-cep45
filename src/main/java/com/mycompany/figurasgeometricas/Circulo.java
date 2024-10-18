package com.mycompany.figurasgeometricas;

class Circulo extends FiguraGeometrica {
    private double radio;
    
    public Circulo(String nombre, String color, double radio){
        super(nombre, color);
        this.radio=radio;
    }
    
    public void obtenerArea(double rad){
        double area=Math.PI*Math.pow(rad, 2);
        area=Math.round(area*100.0)/100.0;
        System.out.println("El area es "+ area);
    }
    public void obtenerPerimetro(double rad){
        double per=2*Math.PI*rad;
        per=Math.round(per*100.0)/100.0;
        System.out.println("El perimetro es "+per);
    }
}
