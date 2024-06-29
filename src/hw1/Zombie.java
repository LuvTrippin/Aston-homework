package hw1;

public class Zombie extends Enemy {
    private boolean isResurrected = false;
    private final int maxHealth;

    public Zombie(int health) {
        super(health);
        this.maxHealth = health;
    }

    public Zombie(int health, int damage) {
        super(health, damage);
        this.maxHealth = health;
    }

    @Override
    public void attack(Hero hero) {
        hero.takeDamage(damage);
        System.out.printf("Зомби пытается укусить %s! \n", hero.getName());
    }

    @Override
    public void takeDamage(int damage) {
        if (this.getHealth() <= 0) {
            if (isResurrected) {
                return;
            }
            this.setHealth(this.maxHealth);
            isResurrected = true;
        } else if (this.getHealth() - damage < 0) {
            if (isResurrected) {
                this.setHealth(0);
                return;
            }
            this.setHealth(this.maxHealth);
            isResurrected = true;
            return;
        }
        this.setHealth(this.getHealth() - damage);
    }
}
