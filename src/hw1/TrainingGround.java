package hw1;

public class TrainingGround {
    public static void main(String[] args) {

        Mage mage = new Mage("Harry Potter");
        System.out.println(mage.getName());
        //mage.attackEnemy();

        Warrior warrior = new Warrior("Guts");
        System.out.println(warrior.getName());
        //warrior.attackEnemy();

        Archer archer = new Archer("Archer");
        System.out.println(archer.getName());
        //archer.attackEnemy();
    }
}
