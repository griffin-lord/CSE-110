public class circle {
    public static void main(String[] args) {
        double radius = 5.0;
        double circumference = 2*Math.PI*radius;
        double area = Math.PI*Math.pow(radius,2);
        System.out.println("Circumference: " + circumference);
        System.out.println("Area: " + area);
    }
}
