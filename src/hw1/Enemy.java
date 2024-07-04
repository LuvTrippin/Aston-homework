package hw1;

public abstract class Enemy implements Mortal {
    private int health;
    protected int damage;
    private final int DEFAULT_DAMAGE = 10;

    public Enemy(int health) {
        this.health = health;
        this.damage = DEFAULT_DAMAGE;
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

    public abstract void deathCry();

    public abstract void attack(Hero hero);

    @Override
    public boolean isAlive() {
        return this.health > 0;
    }
}
