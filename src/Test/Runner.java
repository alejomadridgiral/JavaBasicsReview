package Test;

import Data.Square;

import java.util.Scanner;

public class Runner {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("Por favor indique el lado del cuadrado");
        float squareSide = scan.nextFloat();
        Square mySquare = new Square();
        mySquare.sideSize = squareSide;

        System.out.println("El perimetro del cuadrado es: " + mySquare.getPerimeter());

    }

}
