package hw1;

public class Mage extends Hero{
    private final int lightningAttackChance = 20;

    public Mage(String name) {
        super(name);
    }

    public Mage(String name, int health) {
        super(name, health);
    }

    @Override
    public void attackEnemy(Enemy enemy) {
        if (Math.random() * 100 <= this.lightningAttackChance) {
            System.out.println("Маг бьет врага молнией!");
            enemy.takeDamage(this.getDamage() * 5);
            return;
        }
        System.out.println("Маг атакует!");
        enemy.takeDamage(this.getDamage());
    }
}
