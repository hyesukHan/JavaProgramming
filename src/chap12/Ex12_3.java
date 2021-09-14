package chap12;

import java.sql.SQLOutput;
import java.util.ArrayList;
class Fruit implements Eatable{
    public String toString(){ return "Fruit";}
}
class Apple extends Fruit{
    public String toString(){ return "Apple";}
}
class Grape extends Fruit{
    public String toString(){return "Grape";}
}
class Toy{
    public String toString(){return "Toy";}
}

interface Eatable{}

public class Ex12_3 {
    public static void main(String[] args) {
        FruitBox<Fruit> fruitBox = new FruitBox<>();
        FruitBox<Apple> appleBox = new FruitBox<>();
        FruitBox<Grape> grapeBox = new FruitBox<>();

        fruitBox.add(new Fruit());
        fruitBox.add(new Fruit());

        appleBox.add(new Apple());
        grapeBox.add(new Grape());

        System.out.println("FruitBox"+fruitBox);
        System.out.println("AppleBox"+appleBox);
        System.out.println("GrapeBox"+grapeBox);

    }
}


class FruitBox<T extends Fruit & Eatable> extends Box<T>{}

class Box<T>{
    ArrayList<T> list = new ArrayList<>();
    void add(T item){list.add(item);}
    T get(int i){return list.get(i);}
    int size(){return list.size();}
    public String toString(){return list.toString();}

}