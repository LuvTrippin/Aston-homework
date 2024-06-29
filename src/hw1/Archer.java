package hw1;

public class Archer extends Hero{
    private final int threeArrowChance = 20;

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
        if (Math.random() * 100 <= this.threeArrowChance) {
            System.out.println("Лучник выпускает сразу 3 стрелы!");
            enemy.takeDamage(this.getDamage() * 3);
            return;
        }
        System.out.println("Лучник атакует!");
        enemy.takeDamage(this.getDamage());
    }
}
