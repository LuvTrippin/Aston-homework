package hw1;

public abstract class Hero implements Mortal {
    private final String name;
    private int health;

    public Hero(String name) {
        this.name = name;
        this.health = 100;
    }

    public Hero(String name, int health) {
        this(name);
        this.health = health;
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
