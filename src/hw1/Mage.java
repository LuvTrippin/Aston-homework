package hw1;

public class Mage extends Hero{
    private final int lightningAttackChance = 20;
    private final int ULTIMATE_RATIO = 5;

    public Mage(String name) {
        super(name);
    }

    public Mage(String name, int health) {
        super(name, health);
    }

    public Mage (String name, int health, int damage) {
        super(name, health, damage);
    }

    @Override
    public void attackEnemy(Enemy enemy) {
        if (Math.random() * 100 <= this.lightningAttackChance) {
            System.out.println("Маг бьет врага молнией!");
            enemy.takeDamage(this.getDamage() * ULTIMATE_RATIO);
            return;
        }
        System.out.println("Маг атакует!");
        enemy.takeDamage(this.getDamage());
    }
}
