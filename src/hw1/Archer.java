package hw1;

public class Archer extends Hero{

    public Archer(String name) {
        super(name);
    }

    @Override
    public void attackEnemy(Enemy enemy) {
        System.out.println("Лучник атакует!");
        enemy.takeDamage(15);
    }
}
