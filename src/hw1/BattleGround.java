package hw1;

public class BattleGround {
    public static void main(String[] args) {
        Hero hero = new Warrior("Thor", 70);
        Enemy enemy = new Enemy(60, 70);

        hero.attackEnemy(enemy);
        System.out.print(enemy.getHealth() + " ");
        System.out.println(enemy.isAlive());

        enemy.attack(hero);
        System.out.print(hero.getHealth() + " ");
        System.out.println(hero.isAlive());

    }
}
