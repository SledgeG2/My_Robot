
public class Fighter extends Robot {
    Robot F1, F2;

    Fighter(Robot F1, Robot F2) {
        super();
    }

    public Fighter fight(Robot F1, Robot F2) {
        System.out.println("DEBUT DU COMBAT");
        System.out.println(F1.nom + ". Vie:" + F1.hp);
        System.out.println(F2.nom + ". Vie:" + F2.hp);
        while (F1.hp != 0  && F2.hp !=0) {
           if(F1.hp !=0){ 
            F1.fireF(F2);
            F1.isDead(F2);
            }
            if (F2.hp !=0) {
                F2.fireF(F1);
                F2.isDead(F1);
            } 
        }
        return null;
    }
    public static void main(String[] args) {
        Robot F1 = new Robot("Fighter KYLE", 10);
        Robot F2 = new Robot("Fighter UNDER", 10);
        Fighter F = new Fighter(F1, F2);
        F.fight(F1, F2);
    }
}
 