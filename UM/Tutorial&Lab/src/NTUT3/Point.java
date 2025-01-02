package NTUT3;

public class Point {
    private int x;
    private int y;

    public Point(int x,int y){
        this.x=x;
        this.y=y;
    }


    public void setpoint(int x,int y){
        this.x=x;
        this.y=y;
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    public String toString(){
        return "["+Integer.toString(getX())+","+Integer.toString(getY())+"]";
    }
}
