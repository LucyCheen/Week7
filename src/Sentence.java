public class Sentence {
    public static void main(String[] args) {
        String inputStr = "上海自來水來自海上";
        boolean palindrome = true;
        for (int i = 0; i<inputStr.length()/2; i++){
            int j = inputStr.length()-1-i;
            if(inputStr.charAt(i) != inputStr.charAt(j)){
                palindrome = false;
                break;
            }
        }
        if(palindrome){
            System.out.println("It is a palindrome.");
        }else {
            System.out.println("It is not a palindrome.");
        }
    }
}
