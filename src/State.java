import javax.xml.bind.annotation.XmlRootElement;
import java.lang.Math;

@XmlRootElement
public class State {
    private Rectangle rect1;
    private Rectangle rect2;

    public State() {
        rect1 = new Rectangle();
        rect2 = new Rectangle();
    }

    public State(Rectangle rect1, Rectangle rect2) {
        if (rect1 == null || rect2 == null){
            throw new NullPointerException();
        }
        this.rect1 = rect1;
        this.rect2 = rect2;
    }

    public Rectangle getRect1() {
        return rect1;
    }

    public void setRect1(Rectangle rect1) {
        this.rect1 = rect1;
    }

    public Rectangle getRect2() {
        return rect2;
    }

    public void setRect2(Rectangle rect2) {
        this.rect2 = rect2;
    }

    /**
     * Вычисление текущей площади пересечения прямоугольников
     * @return значение текущей площади пересечения прямоугольников
     */
    public double calcCommonArea(){
        double S = 0;
        Point rect1l, rect1r, rect2l, rect2r;
        rect1l = rect1.getLeftTop();
        rect1r = rect1.getRightBottom();
        rect2l = rect2.getLeftTop();
        rect2r = rect2.getRightBottom();

        double r1x1 = rect1l.getX();
        double r1y1 = rect1l.getY();
        double r1x2 = rect1r.getX();
        double r1y2 = rect1r.getY();

        double r2x1 = rect2l.getX();
        double r2y1 = rect2l.getY();
        double r2x2 = rect2r.getX();
        double r2y2 = rect2r.getY();

        double r1l = Math.min(r1x1, r1x2);
        double r1r = Math.max(r1x1, r1x2);
        double r1t = Math.min(r1y1, r1y2);
        double r1b = Math.max(r1y1, r1y2);

        double r2l = Math.min(r2x1, r2x2);
        double r2r = Math.max(r2x1, r2x2);
        double r2t = Math.min(r2y1, r2y2);
        double r2b = Math.max(r2y1, r2y2);


        double l = Math.max(r1l, r2l);
        double r = Math.min(r1r, r2r);
        double t = Math.max(r1t, r2t);
        double b = Math.min(r1b, r2b);

        S = Math.max(r-l, 0)*Math.max(b-t, 0);
        return S;
    }

    @Override
    public String toString() {
        return String.format("State\nRect1: {%s}\nRect2: {%s}\nCommonSquare = %.3f", rect1, rect2, calcCommonArea());
    }
}
