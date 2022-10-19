public class test5 {
    public static void upperCaseposition(String input){
        boolean found = false;
        for (int i = 0; i<input.length(); i++){
            char c = input.charAt(i);
            if(Character.toUpperCase(c) == c){
                System.out.println(c + " " + i);
                found = true;
                break;
            }
        }
        if(found == false){      //!found
            System.out.println(-1);
        }
    }
    public static void main(String[] args) {
        upperCaseposition("abcd");
        upperCaseposition("AbcD");
        upperCaseposition("abCD");
    }
}
