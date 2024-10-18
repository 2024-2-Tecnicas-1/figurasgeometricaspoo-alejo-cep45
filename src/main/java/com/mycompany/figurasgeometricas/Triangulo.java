
package com.mycompany.figurasgeometricas;


class Triangulo extends FiguraGeometrica{
    private int base;
    private int alt;

    public Triangulo(String nombre, String color, int base, int alt) {
        super(nombre, color);
        this.base=base;
        this.alt=alt;
    }
    public void obtenerArea(int bse, int atu){
        double area=(bse*atu)/2;
        area=Math.round(area*100.0)/100.0;
        System.out.println("El area es "+area);
    }
    public void obtenerPerimetro(int bse, int atu){
        double hip=Math.sqrt(Math.pow((bse/2), 2)+Math.pow(atu,2));
        double per=(hip*2)+bse;
        per=Math.round(per*100.0)/100.0;
        System.out.println("El perimetro es "+per);
    }
    
}
