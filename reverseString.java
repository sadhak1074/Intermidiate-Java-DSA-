public class reverseString{
    public static void restring(String str, int idx ){
        if(idx == 0){
            System.out.println(str.charAt(idx));
            return;
        }

        System.out.print(str.charAt(idx));
        restring(str, idx-1);
    }
    public static void main(String[] args){
        String str = "Hello World";
        restring(str, str.length()-1);
    }
}