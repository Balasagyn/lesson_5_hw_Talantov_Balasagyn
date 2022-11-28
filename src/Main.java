public class Main {
    public static void main(String[] args) {

        Boss boss = new Boss();
        boss.getHealth();
        boss.getDamage();
        boss.getBossDefenseType();
        System.out.println( " Boss Health: " + boss.getHealth() +
                " damage " + boss.getDamage() + "  " + boss.getBossDefenseType());

    }

}
