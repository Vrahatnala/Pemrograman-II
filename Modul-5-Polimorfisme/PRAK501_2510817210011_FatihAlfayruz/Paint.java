package PRAK501_2510817210011_FatihAlfayruz;

public class Paint {
    private double coverage;

    public Paint(double c) {
        coverage = c;
    }

    public double amount(Shape s) {
        System.out.println("Computing amount for " + s);
        return Math.ceil(s.area() / coverage);
    }
}
