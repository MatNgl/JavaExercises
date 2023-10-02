import java.util.ArrayList;

public class exercice1 {

    public static void main(String[] args) {
        ArrayList<Integer> stock = new ArrayList<>();
        stock.add(14);
        stock.add(887);
        stock.add(58);
        stock.add(713);
        stock.add(179);
        stock.add(512);
        stock.add(786);
        stock.add(29);

        int total = sum(stock);

        System.out.println("Contenu du stock : " + total);
    }

    private static int sum(ArrayList<Integer> stock) {
        int total = 0;
        for (int number : stock) {
            total += number;
        }
        return total;
    }
}

