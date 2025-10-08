package loops;

public class Eseven {
    void power(){
        int num =2;
        for (int i = 1; i <=10 ; i++) {
            double power = Math.pow(num,i);
            System.out.println(power);
        }
    }


    void superPower(){
        int pwr = 1;
        for (int i = 1; i <=10 ; i++) {
            System.out.println(pwr);
            pwr = pwr * 2;

        }
    }
    public static void main(String[] args) {
    Eseven es = new Eseven();
    es.superPower();

    }
}
