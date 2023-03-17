/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package equations;

/**
 *
 * @author rod06
 */
public class Triangle {
    private int base;
    private int height;
    private int area;
    private int perimeter;
    
    public Triangle(){
    }
    
    public Triangle(String base, String height){
        this.setBase(Integer.parseInt(base));
        this.setHeight(Integer.parseInt(height));
    }
    
    public void calculateArea(){
        int result = this.getBase() * this.getHeight() / 2;
        this.setArea(result);
    }
    
    public void calculatePerimeter(){
        int result = this.getBase() * 3;
        this.setPerimeter(result);
    }

    public int getBase() {
        return base;
    }

    public void setBase(int base) {
        this.base = base;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public int getArea() {
        return area;
    }

    public void setArea(int area) {
        this.area = area;
    }

    public int getPerimeter() {
        return perimeter;
    }

    public void setPerimeter(int perimeter) {
        this.perimeter = perimeter;
    }
}
