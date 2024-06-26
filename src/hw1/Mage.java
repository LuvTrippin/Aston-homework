package hw1;

public class Mage extends Hero{

    public Mage(String name) {
        super(name);
    }

    @Override
    public void attackEnemy(Enemy enemy) {
        System.out.println("Маг атакует!");
        enemy.takeDamage(30);
    }
}
