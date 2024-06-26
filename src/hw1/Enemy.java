package hw1;

public class Enemy implements Mortal {
    private int health;

    public Enemy(int health) {
        this.health = health;
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

    @Override
    public boolean isAlive() {
        return this.health > 0;
    }
}
