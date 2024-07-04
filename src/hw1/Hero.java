package hw1;

public abstract class Hero implements Mortal {
    private final String name;
    private int health;
    private int damage;
    private final int DEFAULT_HEALTH = 100;
    private final int DEFAULT_DAMAGE = 20;

    public Hero(String name) {
        this.name = name;
        this.health = DEFAULT_HEALTH;
        this.damage = DEFAULT_DAMAGE;
    }

    public Hero(String name, int health) {
        this(name);
        this.health = health;
        this.damage = DEFAULT_DAMAGE;
    }

    public Hero(String name, int health, int damage) {
        this(name, health);
        this.damage = damage;
    }

    public String getName() {
        return name;
    }

    public int getHealth() {
        return health;
    }

    public void setHealth(int health) {
        this.health = health;
    }

    public int getDamage() {
        return damage;
    }

    public abstract void attackEnemy(Enemy enemy);

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

    @Override
    public boolean isAlive() {
        return this.health > 0;
    }
}
