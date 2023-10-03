public class exo3 {
    public static void main(String[] args) {
     
        int count = 0;
        int start = 1;
        int end = 50;

        while(start <= end){
            if(start%2 == 0){
                count = count + start;
                start++;
            }else {
            start++;
            }
        }
        System.out.print("La somme des nombres pairs entre 1 et 50 est : " + count);
    }
    
}