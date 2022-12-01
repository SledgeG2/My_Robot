public class Arena extends Robot {
    Robot R1, R2;

    public Arena(Robot R1, Robot R2) {
        super();
    }

    public Arena fight(Robot R1, Robot R2) {
        System.out.println("DEBUT DU COMBAT");
        System.out.println(R1.nom + ". Vie:" + R1.hp);
        System.out.println(R2.nom + ". Vie:" + R2.hp);
        while (R2.hp != 0) {
            R1.fire(R2);
            if (R2.hp != 0) {
                R2.fire(R1);
            } else {
                System.out.println("COMBAT TERMINER");
                isDead(R2);
                System.out.println(R1.nom + " est vainqueur");
            }
        }
        return null;
    }

    public static void main(String[] args) {
        Robot R1 = new Robot("Robot D2R2", 10);
        Robot R2 = new Robot("Robot Data", 10);
        Arena A = new Arena(R1, R2);
        A.fight(R1, R2);
    }
}