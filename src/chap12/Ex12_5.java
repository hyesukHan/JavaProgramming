package chap12;

enum Direction{EAST,SOUTH,WEST,NORTH}
public class Ex12_5 {
    public static void main(String[] args) {
        Direction d1 = Direction.EAST;
        Direction d2 = Direction.valueOf("WEST");
        Direction d3 = Enum.valueOf(Direction.class,"EAST");

        System.out.println("d1="+d1);
        System.out.println("d2="+d2);
        System.out.println("d3="+d3);

        System.out.println("d1==d2?"+(d1==d2));
        System.out.println("d1==d3?"+(d1==d3));
    }
}
