package Another;

public class Rectangle {
    int x1, y1, x2, y2;

    public Rectangle() {
    }

    public Rectangle(int x1, int y1, int x2, int y2) {
        this.x1 = x1;
        this.y1 = y1;
        this.x2 = x2;
        this.y2 = y2;
    }

    public Rectangle(int x1, int y1, float f) {
        this.x1 = x1;
        this.y1 = y1;
    }
    public Rectangle(int x2, float f, int y2) {
        this.x2 = x2;
        this.y2 = y2;
    }


}
