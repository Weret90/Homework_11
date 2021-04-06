package Homework.Fruits;

public class Main {
    public static void main(String[] args) {

        Box<Apple> box1 = new Box<>();
        box1.addOneFruit();
        box1.addOneFruit();
        box1.addOneFruit();
        System.out.println("Вес первого ящика с яблоками: " + box1.getBoxWeight(new Apple()));

        Box<Orange> box2 = new Box<>();
        box2.addOneFruit();
        box2.addOneFruit();
        box2.addOneFruit();
        System.out.println("Вес второго ящика с апельсинами: " + box2.getBoxWeight(new Orange()));

        Box<Orange> box3 = new Box<>();
        box3.addOneFruit();
        box3.addOneFruit();
        System.out.println("Вес третьего ящика с апельсинами: " + box3.getBoxWeight(new Orange()));

        System.out.println("Сравниваем первый ящик со вторым по весу:");
        System.out.println(box1.compare(box2));
        System.out.println("Сравниваем первый ящик с третьим по весу:");
        System.out.println(box1.compare(box3));

        System.out.println("Перекладываем фрукты из 3-го ящика во 2-й");
        box3.emptyBox(box2);
        System.out.println("После перекладывания вес 3-го ящика стал равен: " + box3.getBoxWeight(new Orange()));
        System.out.println("Вес второго ящика увеличился и стал равен: " + box2.getBoxWeight(new Orange()));
    }
}
