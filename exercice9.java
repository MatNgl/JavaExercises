public class exercice9{
    public static void main (String[] args){

        Integer[] numbers = {21565, 3412, 180, 1556, 182, 84, 15};

        for (Integer nb : numbers){
            if( nb%3 != 0 ){
                System.out.print(nb + ", ");
            }
            
        }

    }
}