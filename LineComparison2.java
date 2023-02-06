package day8assignment;

public class LineComparison2 {
    int x1,x2,y1,y2;
    LineComparison2(int x1,int y1,int x2, int y2) {
        this.x1=x1;
        this.y1=x1;
        this.x2=x1;
        this.y2=x1;
    }
    public static void main(String[] args) {
        System.out.println("Welcome to Line Comparison!!");
        LineComparison t= new LineComparison(3,4,6,8);
        System.out.println();
        float l1=t.lengthCal(3,4,6,8);
        System.out.println("Distance of line1: " +l1);
        float l2=t.lengthCal(7,15,9,8);
        System.out.println("Distance of line2: " +l2);
    }
    float lengthCal(int x1, int y1, int x2, int y2) {
        float length;
        length = (float) Math.sqrt((x2 - x1) * (x2 - x1) + (y2 - y1) * (y2 - y1));
        return length;
    }


}
