public class TriangleTest {

    public static void main(String[] args) {

        TriangleCheck check = new TriangleCheck();

        Triangle trg = new Triangle(90, 35,50);
        boolean isRight = check.isRightTriangle(trg);
        System.out.println("Alpha: " + trg.getAngleAlpha());
        System.out.println("Beta: " + trg.getAngleBeta());
        System.out.println("Gamma: " + trg.getAngleGamma());
        System.out.println(isRight);
    }
}
