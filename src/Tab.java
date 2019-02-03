import java.util.Random;

public class Tab {

    public static final int ARRAY_SIZE = 10;

    public static void main(String[] args) {

        int i;
        int[] tab = new int[ARRAY_SIZE];
        Random random = new Random();

        for (i = 0; i < tab.length; i++) {
            tab[i] = random.nextInt();
        }

        for (i = 0; i < tab.length; i++) {
            System.out.print(tab[i] + " ");
        }

        while (i > 0) {
            i--;
            System.out.print(tab[i] + " ");
        }
    }
}