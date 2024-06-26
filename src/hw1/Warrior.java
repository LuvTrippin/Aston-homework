package hw1;

public class Warrior extends Hero {

    public Warrior(String name) {
        super(name);
    }

    @Override
    public void attackEnemy(Enemy enemy) {
        System.out.println("Воин атакует!");
        enemy.takeDamage(35);
    }
}
