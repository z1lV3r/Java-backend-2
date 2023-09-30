public class Task {
    public static void main(String[] args) {
        Wizard wizard = new Wizard();
        Warrior warrior = new Warrior();
        wizard.prepareSpell();
        System.out.println(wizard.damagePoints(warrior));
    }
}