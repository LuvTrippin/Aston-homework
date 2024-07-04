package hw1;

public class Droid extends Enemy {
    private int armor;
    private final int DEFAULT_ARMOR = 10;

    public Droid(int health) {
        super(health);
        this.armor = 10;
    }

    public Droid(int health, int damage) {
        super(health, damage);
        this.armor = DEFAULT_ARMOR;
    }

    @Override
    public void takeDamage(int damage) {
        if(this.armor > damage) {
            this.armor -= damage;
        } else if (this.armor < damage) {
            if (this.getHealth() <= 0) {
                return;
            }
            if (this.getHealth() - damage < 0) {
                this.setHealth(0);
                return;
            }
            this.setHealth(this.getHealth() + (this.armor - damage));
            this.armor = 0;
        }
    }

    @Override
    public void deathCry() {
        System.out.println("Дроид отправляется на металолом!");
    }

    @Override
    public void attack(Hero hero) {
        hero.takeDamage(damage);
        System.out.printf("Дроид стреляет лазерами в %s! \n", hero.getName());
    }


}
