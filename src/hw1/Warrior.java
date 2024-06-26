package hw1;

public class Warrior extends Hero {

    public Warrior(String name) {
        super(name);
    }

    @Override
    public void attackEnemy() {
        System.out.println("Воин атакует!");;
    }
}
