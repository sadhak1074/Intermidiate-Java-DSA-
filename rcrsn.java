public class rcrsn{
    public static int calGCD(int a, int b){
        if (b == 0){
            return a;
        }
        return calGCD(b, a%b);
    }

    public static void main(String[] args){
        System.out.println("Ans: "+calGCD(2, 1));
    }
}