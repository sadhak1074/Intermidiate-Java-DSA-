public class towerOfHanoi{

    public static void tOh(int n, String source, String helper, String destination){
        if(n == 1){
            System.out.println(source + " -> " + destination);
            return;
        }

        tOh(n-1, source, helper, destination );
        System.out.println("transfered " + n + " from " + source + " to " + destination);
        tOh(n-1, helper, source, destination);
    }
    public static void main(String[] args) {
        int n = 3;
        tOh(n, "S", "H", "D");
        
    }
}