import java.util.ArrayList;

public class exo5 {
    public static void main(String[] args) {
        ArrayList<Integer> nbArray = new ArrayList<>();
        nbArray.add(75);
        nbArray.add(80);
        nbArray.add(90);
        nbArray.add(95);
        nbArray.add(85);

    Integer averageArray = avergageCalc(nbArray);
    System.out.print("La moyenne de la liste est : " + averageArray);
    }

    private static  Integer avergageCalc(ArrayList<Integer> numbers){
        int sum = 0;
        for (int number : numbers){
            sum += number;
        } 
        return sum / numbers.size();
    }

    
}