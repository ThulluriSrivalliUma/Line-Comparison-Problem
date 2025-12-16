public class Line {
    private Point p1;
    private Point p2;
    private Double length;

    Line(Point p1, Point p2) {
        this.p1 = p1;
        this.p2 = p2;
        calculateLength();
    }

    private void calculateLength() {
        this.length = Math.sqrt(Math.pow(p2.x-p1.x,2)+Math.pow(p2.y-p1.y,2));
        System.out.println("The length of the line is: " + this.length);
    }
    public int compareTo(Line two) {
        return this.length.compareTo(two.length);
    }
}