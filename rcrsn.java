public class rcrsn{
    public static int Calpower(int x, int n){
        if(x == 0){
            return 0;
        }
        if(n == 0){
            return 1;
        }

        int pownm1 = Calpower(x, n-1);
        int power=x*pownm1;
        return power;
        
        
    }
    public static void main(String [] args) {
        int x = 2;
        int n = 5;
        int ans = Calpower(x, n);
        System.out.println(ans);
        
    }
}