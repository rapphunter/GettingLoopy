public class Main {
    public static void main(String[] args) {
        System.out.println("\n1.");

        for (int cnt = 0; cnt <= 30; cnt++) {
            System.out.println(cnt);
        }

        System.out.println("\n2.");

        for (int cnt = 30; cnt >= 0; cnt--)
            System.out.println(cnt);

        System.out.println("\n3.");

        for (int cnt = 0; cnt <= 18; cnt +=3) {
            System.out.println(cnt);
        }

        System.out.println("\n4.");
        
        for(int cnt = 10; cnt >=0; cnt -=2)
            System.out.println(cnt);
    }
}
