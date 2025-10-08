package loops;

public class Eeight {
    void triangle(){
        String str = "*";
        for (int i = 1; i <=5 ; i++) {
            System.out.println(str);
            str = str + "*";

        }

    }
    public static void main(String[] args) {
        Eeight ei = new Eeight();
        ei.triangle();
    }

}
