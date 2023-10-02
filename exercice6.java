public class exercice6{
    public static void main (String [] args){
        String str = "abcdefghijklmnopqrstuvwxyz";
        int i = str.length();
    
        while (i>=0){
            System.out.println(str.charAt(i));
            i=i-1;
        }
    }
}