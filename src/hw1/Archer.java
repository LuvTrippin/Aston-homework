package hw1;

public class Archer extends Hero{
    private final int THREE_ARROW_CHANCE = 20;
    private final int ULTIMATE_RATIO = 3;

    public Archer(String name) {
        super(name);
    }

    public Archer(String name, int health) {
        super(name, health);
    }

    public Archer(String name, int health, int damage) {
        super(name, health, damage);
    }

    @Override
    public void attackEnemy(Enemy enemy) {
        if (Math.random() * 100 <= THREE_ARROW_CHANCE) {
            System.out.println("Лучник выпускает сразу 3 стрелы!");
            enemy.takeDamage(this.getDamage() * ULTIMATE_RATIO);
            return;
        }
        System.out.println("Лучник атакует!");
        enemy.takeDamage(this.getDamage());
    }
}
