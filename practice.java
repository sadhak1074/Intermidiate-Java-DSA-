public class practice{
    public static void main(String[] args){
        int n = 5 ;
        int pos = 2;
        int BitMask = 1<<pos;

        int newBitmask = ~(BitMask);
        int newNumber = newBitmask & n;

        System.out.println(newNumber);
    }
}