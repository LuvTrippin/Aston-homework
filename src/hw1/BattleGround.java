package hw1;

public class BattleGround {
    public static void main(String[] args) {
        Hero hero = new Warrior("Thor");
        Enemy enemy = new Enemy(60);
        hero.attackEnemy(enemy);
        System.out.print(enemy.getHealth() + " ");
        System.out.println(enemy.isAlive());

        hero.attackEnemy(enemy);
        System.out.print(enemy.getHealth() + " ");
        System.out.println(enemy.isAlive());

        hero.attackEnemy(enemy);
        System.out.print(enemy.getHealth() + " ");
        System.out.println(enemy.isAlive());
    }
}
