public class Rectangle {
    private Point leftTop;
    private Point rightBottom;

    public Rectangle(Point leftTop, Point rightBottom) {
        if (leftTop == null || rightBottom == null){
            throw new NullPointerException();
        }
        this.leftTop = leftTop;
        this.rightBottom = rightBottom;
    }

    public Rectangle(double x0, double y0, double x1, double y1) {
        leftTop = new Point(x0, y0);
        rightBottom = new Point(x1, y1);
    }

    public Rectangle() {
        this(0, 0, 1, 1);
    }


    public Point getLeftTop() {
        return leftTop;
    }

    public void setLeftTop(Point leftTop) {
        if (leftTop == null){
            throw new NullPointerException();
        }
        this.leftTop = leftTop;
    }

    public Point getRightBottom() {
        return rightBottom;
    }

    public void setRightBottom(Point rightBottom) {
        if (rightBottom == null){
            throw new NullPointerException();
        }
        this.rightBottom = rightBottom;
    }

    /**
     * Перемещение прямоугольника на х вправо(влево), на у вверх(вниз)
     * @param x смещение вправо (если х < 0, то смещение влево)
     * @param y смещение вверх (если у < 0, то смещение вниз)
     */
    public void move(double x, double y){
        leftTop.add(x, y);
        rightBottom.add(x, y);
    }

    /**
     * Изменение ширины прямоугольника. Левый нижний угол не меняет своего местоположения,
     * а правый верхний перемещается так, что ширина прямоугольника становится равна width.
     * @param width новая длина
     */
    public void setWidth(double width){
        if (width <= 0){
            throw new IllegalArgumentException("Ширина не может быть <= 0");
        }
        rightBottom.setX(leftTop.getX() + width);
    }

    /**
     * Изменение высоты прямоугольника. Левый нижний угол не меняет своего местоположения,
     * а правый верхний перемещается так, что высота прямоугольника становится равна height.
     * @param height новая длина
     */
    public void setHeight(double height){
        if (height <= 0){
            throw new IllegalArgumentException("Высота не может быть <= 0");
        }
        rightBottom.setY(leftTop.getY() + height);
    }

    @Override
    public String toString() {
        return String.format("leftTop = [%s]; rightBottom = [%s]", leftTop, rightBottom);
    }
}
