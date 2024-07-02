package hw1;

public class BattleGround {
    public static void main(String[] args) {
        Hero hero = new Warrior("Thor", 70);
        Enemy enemy = new Zombie(30, 30);
        Enemy droid = new Droid(30, 20);

        while(hero.isAlive() && (enemy.isAlive())) {
            if (enemy.isAlive() && droid.isAlive()) {
                oneTurnSimulate(hero, enemy, droid);
            } else if (enemy.isAlive()) {
                oneTurnSimulate(hero, enemy);
            } else {
                oneTurnSimulate(hero, droid);
            }

        }
    }

    public static void oneTurnSimulate(Hero hero, Enemy ...enemies) {
        for (Enemy e: enemies) {
            hero.attackEnemy(e);
            if(!e.isAlive()) {
                e.deathCry();
                continue;
            }

            e.attack(hero);
            if(!hero.isAlive()) {
                System.out.printf("%s погиб \n", hero.getName());
                return;
            }
        }
    }
}
