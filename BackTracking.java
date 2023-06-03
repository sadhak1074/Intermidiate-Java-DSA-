public class BackTracking {

    public static void permutation(String str, String perm, int idx){
        if(str.length() == 0) {
            System.out.println(perm);
            return;
        }
 

        for(int i = 0; i<str.length(); i++ ){
            char currchar = str.charAt(i);
            String newString = str.substring(0, i)+str.substring(i+1);
            permutation(newString, perm+ currchar, idx+1);
        }
    }
    public static void main (String[] args){
        String str =  "ABC";
        permutation(str, "", 0);
    }
}