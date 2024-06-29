package hw1;

public class BattleGround {
    public static void main(String[] args) {
        Hero hero = new Warrior("Thor", 200);
        Enemy enemy = new Zombie(10, 30);
        Enemy droid = new Droid(10, 20);

        while(hero.isAlive() || (enemy.isAlive() && droid.isAlive())) {
            hero.attackEnemy(enemy);
            if(!enemy.isAlive() && !droid.isAlive()) {
                System.out.println("Зомби мертв!");
                System.out.println("Дроид отправляется на металолом!");
                break;
            }

            enemy.attack(hero);
            if(!hero.isAlive()) {
                System.out.printf("%s погиб \n", hero.getName());
                break;
            }

            hero.attackEnemy(droid);
            if(!enemy.isAlive() && !droid.isAlive()) {
                System.out.println("Зомби мертв!");
                System.out.println("Дроид отправляется на металолом!");
                break;
            }

            droid.attack(hero);
            if(!hero.isAlive()) {
                System.out.printf("%s погиб \n", hero.getName());
                break;
            }
        }
    }
}
