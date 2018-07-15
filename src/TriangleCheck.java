public class TriangleCheck {


    public boolean isRightTriangle(Triangle triangle) {
         if (triangle.getAngleAlpha() == 90 || triangle.getAngleBeta() == 90 || triangle.getAngleGamma() == 90) {
            triangle.setIsRight(true);
        }
        return triangle.getIsRight();
    }
}
