package Homework.Fruits;

import java.util.ArrayList;

public class Box<T extends Fruit> {
    private ArrayList<T> box;
    private float weight;

    public Box() {
        box = new ArrayList<>();
    }

    public void addOneFruit() {
        box.add((T) new Fruit());
    }

    public float getBoxWeight(T fruit) {
        weight = this.box.size() * fruit.getWEIGHT();
        return weight;
    }

    public boolean compare(Box box) {
        return weight == box.weight;
    }

    public void emptyBox(Box<T> box) {
        int temp = this.box.size();
        for (int i = 0; i < temp; i++) {
            box.addOneFruit();
            this.box.remove(0);
        }
    }
}
