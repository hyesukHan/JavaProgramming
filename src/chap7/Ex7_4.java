package chap7;

class Ex7_4{
    public static void main(String[] args) {
        Point3D p = new Point3D(1,2,3);
        p.info();
    }
}

class Point{
    int x;
    int y;

    Point(int x,int y){
        this.x = x;
        this.y = y;
    }

    public void info(){
        System.out.println("("+x+","+y+")");
    }
}

class Point3D extends Point{
    int z;

    Point3D(int x, int y,int z){
        super(x,y);
        this.z = z;
    }

    public void info(){
        System.out.println("("+x+","+y+","+z+")");
    }
}