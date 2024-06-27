package hw1;

public class Enemy implements Mortal {
    private int health;
    private int damage;

    public Enemy(int health) {
        this.health = health;
        this.damage = 10;
    }

    public Enemy(int health, int damage) {
        this(health);
        this.damage = damage;
    }

    public int getHealth() {
        return health;
    }

    public void setHealth(int health) {
        this.health = health;
    }

    public void takeDamage(int damage) {
        if (this.health <= 0) {
            return;
        }
        if (this.health - damage < 0) {
            this.health = 0;
            return;
        }
        this.health -= damage;
    }

    public void attack(Hero hero) {
        hero.takeDamage(this.damage);
        System.out.println("Enemy attacked " + hero.getName());
    }

    @Override
    public boolean isAlive() {
        return this.health > 0;
    }
}
