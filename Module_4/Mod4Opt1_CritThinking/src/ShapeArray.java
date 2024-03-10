import java.util.Scanner;

public class ShapeArray {
    public static void main(String[] args) {
    	Scanner scnr = new Scanner(System.in);
    	
        Sphere sphere;
        Cylinder cylinder;
        Cone cone;
        
        System.out.print("Enter sphere radius: ");
        double spRadius = scnr.nextDouble();
        System.out.println();
        
        sphere = new Sphere(spRadius);
        
        System.out.print("Enter cylinder radius: ");
        double cyRadius = scnr.nextDouble();
        System.out.print("\nEnter cylinder height: ");
        double cyHeight = scnr.nextDouble();
        System.out.println();
        
        cylinder = new Cylinder(cyRadius, cyHeight);
        
        System.out.print("Enter cone radius: ");
        double coRadius = scnr.nextDouble();
        System.out.print("\nEnter cone height: ");
        double coHeight = scnr.nextDouble();
        System.out.println();
        
        cone = new Cone(coRadius, coHeight);

        Shape[] shapeArray = {sphere, cylinder, cone};

        for (Shape shape : shapeArray) {
            System.out.println(shape.toString());
        }
    }
}