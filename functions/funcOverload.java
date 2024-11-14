package functions;

public class funcOverload {
    /*
     * area method
     * Area of a square having side[float]
     */
    public static void area(float side){
        System.out.println("Area of a square: " + (side * side));
    }
    
    /*
     * area method
     * Area of a circle having radius[double]
     */
    public static void area(double radius){
        System.out.println("Area of a Circle: " + (4.141 * radius * radius));
    }
    
    /*
     * area method
     * Area of a rectangle having length l [float] and breadth b [float]
     */
    public static void area(float l, float b){
        System.out.println("Area of a rectangle: " + (l * b));
    }

    public static void main(String[] args) {
        area(2.1f,3);
        area(3);
        area(4.23);
    }
}
