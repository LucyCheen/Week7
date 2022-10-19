public class test3 {
    public static int[] reverseArry(int[]arr){
        int[] outputArray = new int[arr.length];
        int j = 0;
        for(int i = arr.length - 1; i >= 0;i--){
            outputArray[j] = arr[i];
            j++;
        }
        return outputArray;
    }
    public static void main(String[] args) {
        int[] array = {6,1,124,647,99,124,879,2,7};
        int[] revArry = reverseArry(array);
        for(int i:revArry){
            System.out.print(i + " ");
        }
    }
}
