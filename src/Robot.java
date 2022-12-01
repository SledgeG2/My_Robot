import java.util.Random;

public class Robot {
    protected String nom;
    protected int hp;

    public Robot() {
        this.hp = 10;
    }

    public Robot(String nom, int hp) {
        this.nom = nom;
        this.hp = hp;
    }

    public Robot(String nom) {
        this.nom = nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public void setHp(int hp) {
        this.hp = hp;
    }

    public String getNom() {
        return nom;
    }

    public int getHp() {
        return hp;
    }

    Robot fire(Robot R) {
        R.hp -= 2;
        System.out.println(R.nom + " a été touché par " + this.nom + ". Vie:" + R.hp);
        return R;
    }

    Random seed = new Random();

    Robot fireF(Robot F) {
        int x = seed.nextInt(2);
        if (x == 1) {
            F.hp -= 2;
            System.out.println(F.nom + " a été touché par " + this.nom + ". Vie:" + F.hp);
        } else {
            F.hp -= 0;
            System.out.println(F.nom + " a parré le tir de " + this.nom + ". Vie:" + F.hp);
        }
        return F;
    }

    public boolean isDead(Robot R) {
        if (R.hp == 0) {
            System.out.println(R.nom + " est mort");
            return true;
        }
        return false;
    }

    public static void main(String[] args) {
        Robot bob = new Robot("Robot bob", 10);
        System.out.println(bob.nom);
        Robot R1 = new Robot("Robot foo", 10);
        Robot R2 = new Robot("Robot bar", 10);
        R1.fire(R2);
    }
}