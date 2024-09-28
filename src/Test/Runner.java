package Test;

import Data.Rectangle;
import Data.Square;
import Data.Triangle;

import java.util.Scanner;

public class Runner {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("Por favor indique el lado del cuadrado");
        float squareSide = scan.nextFloat();
        Square mySquare = new Square();
        mySquare.sideSize = squareSide;

        System.out.println("El perimetro del cuadrado es: " + mySquare.getPerimeter());

        System.out.println("por favor indique la longitud del rectangulo");
        float rectangleLength = scan.nextFloat();
        Rectangle myRectangle = new Rectangle();
        myRectangle.lengthSize = rectangleLength;

        System.out.println("Por favor indique el ancho del rectangulo");
        float rectangleBreadht = scan.nextFloat();
        myRectangle.breadthSize = rectangleBreadht;

        System.out.println("El perimetro del rectangulo es: " + myRectangle.getPerimeter());

        System.out.println("Por favor indique la longitud de la base del trianqulo");
        float triangleBase = scan.nextFloat();
        Triangle myTriangle = new Triangle();
        myTriangle.baseSize = triangleBase;

        System.out.println("Por favor indique la longitud del lado a trianqulo");
        float trianglASide = scan.nextFloat();
        myTriangle.aSideSize = trianglASide;

        System.out.println("Por favor indique la longitud del lado c trianqulo");
        float triangleCside = scan.nextFloat();
        myTriangle.cSideSize = triangleCside;

        System.out.println("El perimetro del triangulo es: " + myTriangle.getPerimeter());

    }

}
