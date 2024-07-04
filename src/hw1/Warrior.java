package hw1;

public class Warrior extends Hero {
    private final int criticalChance = 20;
    private final int ULTIMATE_RATIO = 2;

    public Warrior(String name) {
        super(name);
    }

    public Warrior(String name, int health) {
        super(name, health);
    }

    public Warrior(String name, int health, int damage) {
        super(name, health, damage);
    }

    @Override
    public void attackEnemy(Enemy enemy) {
        if (Math.random() * 100 <= criticalChance) {
            System.out.println("Воин наносит критический удар!");
            enemy.takeDamage(this.getDamage() * ULTIMATE_RATIO);
            return;
        }
        System.out.println("Воин атакует!");
        enemy.takeDamage(this.getDamage());
    }
}
