package day8assignment;

public class LineComparison2 {
    int x1,x2,y1,y2;
    double l;
    LineComparison2(int x1,int y1,int x2, int y2) {
        this.x1=x1;
        this.y1=x1;
        this.x2=x1;
        this.y2=x1;
    }
    LineComparison2(double l){
        this.l=l;
    }
    public static void main(String[] args) {
        System.out.println("Welcome to Line Comparison!!");
        LineComparison t= new LineComparison(3,4,6,8);
        float l1=t.lengthCal(3,4,6,8);
        System.out.println("Distance of line1: " +l1);
        float l2=t.lengthCal(7,15,9,8);
        System.out.println("Distance of line2: " +l2);
        System.out.println(" lin1=9.8, line2==9.8 ");
        LineComparison y1= new LineComparison(9.8);
        LineComparison y2= new LineComparison(9.8);
        boolean R= y1.equals(y2);
        if(R==true){
            System.out.println("lines are equals");
        }
        else {
            System.out.println("lines are not equals");
        }
    }
    float lengthCal(int x1, int y1, int x2, int y2) {
        float length;
        length = (float) Math.sqrt((x2 - x1) * (x2 - x1) + (y2 - y1) * (y2 - y1));
        return length;
    }
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        LineComparison that = (LineComparison) o;
        return Double.compare(that.l, l) == 0;
    }


}
