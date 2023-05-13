public class recursion3 {
    public static int calFac(int n){
        if(n==0 || n==1){
            return 1;
        }
        int a = calFac(n-1);
        int b = n * a;
        return b;
    }
    public static void main(String[] args){
        int n = 5;
        int ans = calFac(n);
        System.out.println(ans);
    }
}
