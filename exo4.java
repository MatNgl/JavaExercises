public class exo4 {
    public static void main(String[] args) {
     
        int count = 0;
        int start = 1;
        int end = 10;

        while(start<=end){
            count += start*start;
            start++;
        }
        System.out.print(" La somme des carrés des nombres entre 1 et 10 est : " + count);

    }
}