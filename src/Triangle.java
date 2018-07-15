public class Triangle {

    private int angleAlpha;
    private int angleBeta;
    private int angleGamma;
    private boolean isRight;

    public Triangle (int alpha, int beta, int gamma){
        this.angleAlpha = alpha;
        this.angleBeta = beta;
        this.angleGamma = gamma;
    }

    public int getAngleAlpha() {
        return angleAlpha;
    }

    public int getAngleBeta() {
        return angleBeta;
    }

    public int getAngleGamma() {
        return angleGamma;
    }

    public boolean getIsRight(){
        return isRight;
    }

    public void setAngleAlpha(int angleAlpha) {
       this.angleAlpha = angleAlpha;
    }

    public void setAngleBeta(int angleBeta) {
        this.angleBeta = angleBeta;
    }

    public void setAngleGamma(int angleGamma) {
        this.angleGamma = angleGamma;
    }

    public void setIsRight(boolean isRight) {
        this.isRight = isRight;
    }
}